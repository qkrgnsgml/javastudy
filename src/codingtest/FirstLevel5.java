package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLevel5 {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> allNum = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        for (int number : numbers) {
            if(allNum.contains(number)){
                answer+=number;
            }
        }

        return 45-answer;
        //return 45-Arrays.stream(numbers).sum();
    }

    public static void main(String[] args) {
        FirstLevel5 firstLevel5 = new FirstLevel5();
        int[] a = {1,2,3,4,6,7,8,0};
        System.out.println(firstLevel5.solution(a));


    }
}
