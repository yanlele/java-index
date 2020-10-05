package October.demo1;

public class Demo2 implements Runnable {
    static int count;

    @Override
    public synchronized void run() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Demo2()).start();
        System.out.println("count = " + count);
    }
}
