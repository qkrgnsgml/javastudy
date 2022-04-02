package codingtest.firstlevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstLevel19 {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Integer[] list = Arrays.stream(d).sorted().boxed().toArray(Integer[]::new);

        for (Integer integer : list) {
            if(budget-integer>=0){
                answer++;
                budget-=integer;
            }else {
                break;
            }
        }


        return answer;
    }
}
