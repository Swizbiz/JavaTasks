package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        private void notifyUsers(Connection connection, String userName){
            connectionMap.forEach((name, cnct) -> {if (!(userName.equals(name))){
                try {
                    connection.send(new Message(MessageType.USER_ADDED, name));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            });
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException{
            while (true) {
                Message msg = connection.receive();
                if (msg.getType() == MessageType.TEXT)
                    sendBroadcastMessage(new Message(MessageType.TEXT, String.format("%s: %s", userName, msg.getData())));
                else ConsoleHelper.writeMessage("Error");
            }
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException{
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message msgUserName = connection.receive();
                String userName = msgUserName.getData();
                if (msgUserName.getType() == MessageType.USER_NAME
                    && !userName.isEmpty()
                    && !(connectionMap.containsKey(userName))) {
                    connectionMap.put(userName, connection);
                    connection.send(new Message(MessageType.NAME_ACCEPTED));
                    return userName;
                }
                else continue;
            }
        }

        @Override
        public void run() {
            String clientName = null;
            ConsoleHelper.writeMessage(socket.getRemoteSocketAddress() + "");
            try (Connection connection = new Connection(socket)) {
                clientName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, clientName));
                notifyUsers(connection, clientName);
                serverMainLoop(connection, clientName);
                connectionMap.remove(clientName);
            } catch (IOException | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Error");
                e.printStackTrace();
            } finally {
                if (clientName != null) {
                    connectionMap.remove(clientName);
                    sendBroadcastMessage(new Message(MessageType.USER_REMOVED, clientName));
                }
            }
        }
    }

    public static void sendBroadcastMessage(Message message){
        connectionMap.forEach((name, connection) -> {
            try {
                connection.send(message);
            } catch (IOException e) {
                e.printStackTrace();
                try {
                    connection.send(new Message(MessageType.TEXT, "Failed to send Message: " + e.getMessage()));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        int port = ConsoleHelper.readInt();
        try (ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("Server is run");
            while (true){
                new Handler(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
