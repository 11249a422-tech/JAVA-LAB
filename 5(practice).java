class MyThread extends Thread {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread Name: " + threadName);
    }
}

public class Main {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}
