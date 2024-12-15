package MultiThreading;

class MultiThreadingExtendingThreadClass extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Thread" + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class ExtendingThreadClass {

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            MultiThreadingExtendingThreadClass thread = new MultiThreadingExtendingThreadClass();
            thread.start();
        }
    }
}
