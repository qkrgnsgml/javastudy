package codingtest.firstlevel;

public class FirstLevel42 {
    public static int[] solution(long n) {

        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        int j=0;
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            answer[j] = Character.getNumericValue(c);
            j++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(12345L));
    }
}
