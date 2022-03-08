package lock;

public class SharedData {
    private int value;

    public void increase() {
        value += 1;
    }

    public void print() {
        System.out.println(value);
    }
}