enum Week {
    MONDAY(0), TUSEDAY(1), WEDNESDAY(2), THURSDAY(3), FRIDAY(4), SATURDAY(5), SUNDAY(6);

    private final int value;
    Week(int value) { this.value = value; }
    public int getValue() { return value; }
}


public class WeekEx{
    public static void main(String[] args) {
//        Week[] arr = Week.values();
//        for (Week rb : arr) {
//            System.out.println(rb);
//        }
//        Week rb = Week.valueOf("TUSEDAY");
//        System.out.println(rb);
        System.out.println(Week.TUSEDAY.ordinal());
    }
}