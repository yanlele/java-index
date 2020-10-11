package October.demo1;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 使用 Callable 接口来创建线程
 * <p>
 * Runnable 接口执行的是独立的任务，Runnable 接口不会产生任何返回值，
 * 如果你希望在任务完成后能够返回一个值的话，那么你可以实现 Callable 接口而不是 Runnable 接口。
 */
public class Demo3 implements Callable {
    static int count;

    public Demo3(int count) {
        this.count = count;
    }

    @Override
    public Object call() throws Exception {
        return count;
    }

    public static void main(String[] args) throws Exception {
        FutureTask<Integer> task = new FutureTask(() -> {
            for (int i = 0; i < 1000; i++) {
                count++;
            }
            return count;
        });
        Thread thread = new Thread(task);
        thread.start();

        Integer total = task.get();
        System.out.println("total = " + total);
    }
}
