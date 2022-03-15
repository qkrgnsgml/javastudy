package synchro;

public class CleanSynchronized {

    int balance = 10000000;
    int count1 = 0;
    int count2 = 0;

    public int getBalance() {
        return balance;
    }

    public void addBalance(int balance) {
        this.balance += balance;
    }

    public static void main(String[] args) {
        final CleanSynchronized cleanSynchronized = new CleanSynchronized();
        new Thread() {

            @Override
            public void run() {
                synchronized (cleanSynchronized) {
                    while (cleanSynchronized.getBalance() >= 1000) {
                        cleanSynchronized.addBalance(-1000);
                        cleanSynchronized.count1++;
                    }
                }
                System.out.println("Thread 1 : " + cleanSynchronized.count1);
            }

        }.start();

        new Thread() {

            @Override
            public void run() {
                synchronized (cleanSynchronized) {
                    while (cleanSynchronized.getBalance() >= 1000) {
                        cleanSynchronized.addBalance(-1000);
                        cleanSynchronized.count2++;
                    }
                    System.out.println("Thread 2 : " + cleanSynchronized.count2);
                }
            }

        }.start();

        new Thread() {

            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("balance : " + cleanSynchronized.balance);
                System.out.println("count total : " + (cleanSynchronized.count1 + cleanSynchronized.count2));
            }

        }.start();
    }
}

