package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        final SharedData mySharedData = new SharedData(); // shared resource

        for (int i = 0; i < 10; i++) {
            new Thread(new TestRunnable(mySharedData)).start();
        }
    }
}

class TestRunnable implements Runnable {
    private final SharedData mySharedData;

    public TestRunnable(SharedData mySharedData) {
        this.mySharedData = mySharedData;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            mySharedData.increase();
        }

        mySharedData.print();
    }
}