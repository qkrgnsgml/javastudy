package codingtest.toss;

public class test1 {
    public static int solution(String s) {
        int answer = -1;
        for(int i=0;i<s.length()-2;i++){
            String substring = s.substring(i, i + 3);
            if(substring.charAt(0)==substring.charAt(1)){
                if(substring.charAt(0)==substring.charAt(2)){
                    if(Character.getNumericValue(substring.charAt(0))>answer){
                        answer= Character.getNumericValue(substring.charAt(0));
                    }

                }
            }
        }
        if(answer==-1){
            return -1;
        }
        return answer*111;
    }

    public static void main(String[] args) {
        System.out.println(solution("12223"));
    }
}
