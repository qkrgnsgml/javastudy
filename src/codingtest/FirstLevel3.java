package codingtest;

import java.util.HashMap;
import java.util.Map;

public class FirstLevel3 {
    public int solution(String s) {
        Map<String,Integer> numList = new HashMap<>();
        numList.put("zero",0);
        numList.put("one",1);
        numList.put("two",2);
        numList.put("three",3);
        numList.put("four",4);
        numList.put("five",5);
        numList.put("six",6);
        numList.put("seven",7);
        numList.put("eight",8);
        numList.put("nine",9);

        for (String num : numList.keySet()) {
            if(s.contains(num)){
                s = s.replaceAll(num,""+numList.get(num));
            }
        }

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        FirstLevel3 firstLevel3 = new FirstLevel3();
        System.out.println(firstLevel3.solution("one4seveneight"));
    }
}
