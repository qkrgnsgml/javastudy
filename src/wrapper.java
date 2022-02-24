public class wrapper {
    public static void main(String[] args) {
        int i=5;
        Integer intObj = 7;
        int sum = i + intObj; //jDK1.5전에는 불가
        System.out.println(intObj.getClass());
        System.out.println("sum = " + sum);


    }
}
