package October.demo1;

/**
 * 继承 Thread 类来创建线程
 * <p>
 * 第一种方式是继承 Thread 类来创建线程
 */
public class Demo1 extends Thread {
    static int count;

    @Override
    public synchronized void run() {
        for (int i = 0; i < 1000; i++) {
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Demo1 demo1 = new Demo1();
        demo1.start();
        demo1.join();
        System.out.println("count = " + count);
    }
}
