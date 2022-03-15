package synchro;

public class SimpleSynchronized {

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
        final SimpleSynchronized simpleSynchronized = new SimpleSynchronized();
        new Thread() {

            @Override
            public void run() {
                while (simpleSynchronized.getBalance() >= 1000) {
                    simpleSynchronized.addBalance(-1000);
                    simpleSynchronized.count1++;
                }

                System.out.println("Thread 1 : " + simpleSynchronized.count1);
            }

        }.start();

        new Thread() {

            @Override
            public void run() {
                while (simpleSynchronized.getBalance() >= 1000) {
                    simpleSynchronized.addBalance(-1000);
                    simpleSynchronized.count2++;
                }
                System.out.println("Thread 2 : " + simpleSynchronized.count2);
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
                System.out.println("balance : " + simpleSynchronized.balance);
                System.out.println("count total : " + (simpleSynchronized.count1 + simpleSynchronized.count2));
            }

        }.start();
    }
}