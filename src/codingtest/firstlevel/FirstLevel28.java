package codingtest.firstlevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLevel28 {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int arrNum : arr){
            if(arrNum%divisor==0){
                list.add(arrNum);
                count++;
            }
        }
        if(count==0){
            list.add(-1);
        }
        int[] answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        Arrays.sort(answer);
        return answer;
    }
}
