package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

public class BotClient extends Client {
    @Override
    protected String getUserName() {
        int x = (int) (Math.random() * 100);
        return "date_bot_" + x;
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    public class BotSocketThread extends SocketThread{
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            if (!message.contains(": ")) return;
            String[] messages = message.split(": ");
            String userName = messages[0];
            String userMessage = messages[1];
            HashMap<String, String> formats = new HashMap<String, String>() {
                {
                    put("дата", "d.MM.YYYY");
                    put("день", "d");
                    put("месяц", "MMMM");
                    put("год", "YYYY");
                    put("время", "H:mm:ss");
                    put("час", "H");
                    put("минуты", "m");
                    put("секунды", "s");
                }
            };
            formats.keySet().stream().filter(usMsg -> usMsg.equals(userMessage))
                    .forEach(s -> sendTextMessage(String.format("Информация для %s: %s",
                            userName, new SimpleDateFormat(formats.get(s)).format(Calendar.getInstance().getTime())
                    )));
            }
    }

    public static void main(String[] args) {
        BotClient bot = new BotClient();
        bot.run();
    }
}
