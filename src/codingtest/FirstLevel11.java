package codingtest;

import java.util.*;

public class FirstLevel11 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        List<String> dup = new ArrayList<>();
        dup.add("");
        for (String s : participant) {
            boolean b = Arrays.stream(completion).anyMatch(t -> t.contains(s));
            if(!b){
                return s;
            }
        }

        for (String s : participant) {
            if(dup.contains(s)){
                return s;
            }
            dup.add(s);
        }

        return answer;
    }

    public String solution2(String[] participant, String[] completion) {
        String answer = "";
        List<String> dup = new ArrayList<>();
        List<String> com = Arrays.asList(completion);

        for (String s : participant) {
            if(!com.contains(s)){
                return s;
            }
        }

        //중복시
        for (String s : participant) {
            if(dup.contains(s)){
                return s;
            }
            dup.add(s);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] a = {"leo", "kiki", "eden"};
        String[] b = {"leo", "kiki"};
        FirstLevel11 firstLevel11 = new FirstLevel11();
        System.out.println(firstLevel11.solution(a,b));
    }
}
