package codingtest;

public class FirstLevel18 {
    public int solution(int n) {
        String a = "";

        while(n > 0){
            a = a + (n % 3) ;
            n /= 3;
        }


        return Integer.parseInt(a,3);
    }
}
