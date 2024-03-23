package dmytro.bozhor;

import java.util.ArrayList;

public class ThreadRunner {
    public static void main(String[] args) throws InterruptedException {

        var integerList = new ArrayList<Integer>();
        var arrayListFillerRunnable = new ArrayListFiller(integerList);
        var arrayListFillerRunnableTwo = new ArrayListFiller(integerList);
        var thread = new Thread(arrayListFillerRunnable);
        var threadTwo = new Thread(arrayListFillerRunnable);

        thread.start();
        threadTwo.start();
        thread.join();
        threadTwo.join();
        System.out.println(arrayListFillerRunnable.getIntegerList().size());
    }
}