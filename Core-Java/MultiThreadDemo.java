// File: MultiThreadDemo.java
class MyThread extends Thread {
    private String message;

    public MyThread(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " - " + i);
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread One");
        MyThread t2 = new MyThread("Thread Two");

        t1.start();
        t2.start();
    }
}
