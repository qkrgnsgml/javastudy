package codingtest.firstlevel;

public class FirstLevel34 {
    public String solution(String[] seoul) {
        String answer = "김서방은 ";
        int count = 0;
        for(String man : seoul){
            if(man.equals("Kim")){
                answer += count + "에 있다";
                break;
            }
            count++;
        }

        return answer;
    }
}
