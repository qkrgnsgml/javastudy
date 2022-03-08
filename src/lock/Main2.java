package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main2 {
    public static void main(String[] args) {
        final SharedData mySharedData = new SharedData(); // shared resource
        final Lock lock = new ReentrantLock(); // lock instance

        for (int i = 0; i < 10; i++) {
            new Thread(new TestRunnable2(mySharedData, lock)).start();
        }
    }
}

class TestRunnable2 implements Runnable {
    private final SharedData mySharedData;
    private final Lock lock;

    public TestRunnable2(SharedData mySharedData, Lock lock) {
        this.mySharedData = mySharedData;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            for (int i = 0; i < 100; i++) {
                mySharedData.increase();
            }

            mySharedData.print();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}