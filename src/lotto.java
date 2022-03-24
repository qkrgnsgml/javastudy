import java.util.*;
public class lotto {

    public static void main(String[] args) {
        Random rn = new Random();
        int[] lotto = new int[6];
        int[] list = new int[46];
        System.out.println("=================================");
        for(int i = 'A'; i <= 'E'; i++) {
            System.out.print("\n"+(char)i + " 자 동  ");

            for(int k = 0; k < lotto.length; k++) {
                lotto[k] = rn.nextInt(45)+1;
                if(list[lotto[k]] == 0) {
                    list[lotto[k]] =1;
                }
                else
                    k--;
            }
            Arrays.sort(lotto);
            for(int k = 0; k < lotto.length; k++) {
                System.out.printf("%02d ", lotto[k]);
            }
        }
        System.out.println();
        System.out.println("===========================");
    }
}