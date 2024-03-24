package dmytro.bozhor.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntRunner {
    public static void main(String[] args) {

        var atomicInteger = new AtomicInteger();

        System.out.println(atomicInteger.incrementAndGet());
        System.out.println(atomicInteger.addAndGet(15));

        atomicInteger.set(75);
        System.out.println(atomicInteger);

    }
}
