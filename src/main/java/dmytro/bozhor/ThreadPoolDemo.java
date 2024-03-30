package dmytro.bozhor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

    public static void main(String[] args) throws InterruptedException {

        var threadPool = Executors.newFixedThreadPool(10);

        var start = System.currentTimeMillis();

        for (int i = 0; i < 20; i++) {
            threadPool.execute(ThreadPoolDemo::getSleep);
        }

        threadPool.shutdown();
        threadPool.awaitTermination(1, TimeUnit.MINUTES);

        var finish = System.currentTimeMillis();

        System.out.println("END");
        System.out.println("Execution time: " + (finish - start));

    }

    private static void getSleep() {
        try {
            Thread.sleep(2_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
