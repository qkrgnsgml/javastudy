public class BeepThread {
    int x=13;

    class Inner {
        public void sum() {
            Volume vol = () -> {
                System.out.println(x);
            };
            vol.sum();
        }

    }

}
