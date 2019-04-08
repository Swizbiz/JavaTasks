package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    private Thread targetThread;
    State state;

    @Override
    public void run() {

        while(true){
            if (targetThread.getState() != state) {
                state = targetThread.getState();
                System.out.println(state);
            }
            if (targetThread.getState() == State.TERMINATED){
                break;
            }
        }
    }

    public LoggingStateThread(Thread thread) {
        this.targetThread = thread;
        State state = targetThread.getState();
    }
}
