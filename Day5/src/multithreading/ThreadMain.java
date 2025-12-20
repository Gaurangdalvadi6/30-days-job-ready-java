package multithreading;

public class ThreadMain {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        RunnableInterfaceUse runnableInterfaceUse = new RunnableInterfaceUse();
        Thread thread = new Thread(runnableInterfaceUse);
        thread.start();
    }
}
