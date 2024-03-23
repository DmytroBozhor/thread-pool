package dmytro.bozhor;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ArrayListFiller implements Runnable {

    private List<Integer> integerList;

    private final Lock lock = new ReentrantLock();

    public ArrayListFiller(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5_000; i++) {
            lock.lock();
            integerList.add(i);
            lock.unlock();
        }

    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }
}
