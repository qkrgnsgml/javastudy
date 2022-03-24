package codingtest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FirstLevel20 {
    public int[] solution(int[] numbers) {

        Set<Integer> a = new HashSet<>();


        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                a.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[a.size()];

        int i = 0;
        for (Integer integer : a) {
            answer[i] = integer;
            i++;
        }

        Arrays.sort(answer);

        return answer;
    }
}
