package codingtest.firstlevel;

public class FirstLevel41 {
    public int solution(int n) {
        int answer = 0;
        String stringN = String.valueOf(n);
        for(int i=0;i<stringN.length();i++){
            answer+=Character.getNumericValue(stringN.charAt(i));
        }
        return answer;
    }
}
