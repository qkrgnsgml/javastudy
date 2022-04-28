package codingtest.secondlevel;

import java.util.Arrays;

public class SecondLevel6 {
    public String solution(String s) {
        String answer = "";
        String[] numList = s.split(" ");
        int[] numbers = new int[numList.length];
        for(int i=0;i<numbers.length;i++){
            numbers[i] = Integer.parseInt(numList[i]);
        }
        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();
        answer = answer + min + " " + max;
        return answer;
    }
}
