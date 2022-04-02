package codingtest.firstlevel;

import java.util.*;
import java.util.stream.Collectors;

public class FirstLevel16 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int fail = 0;
        int cnt = 0;
        float failRate = 0.0F;
        Map<Integer, Float> numCnt = new LinkedHashMap<>();

        for (int i = 1; i <= N; i++) {
            fail = 0;
            cnt = 0;
            for (int j = 0; j < stages.length; j++) {
                if (i == stages[j]) {
                    fail++;
                }
                if (stages[j] >= i) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                failRate = 0.0F;
            } else {
                failRate = (float) fail / cnt;
            }
            numCnt.put(i, failRate);
        }

        List<Float> floats = numCnt.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        int i = 0;
        for (Float aFloat : floats) {
            for (Integer integer : numCnt.keySet()) {
                if (aFloat == numCnt.get(integer)) {
                    answer[i] = integer;
                    break;
                }
            }
            i++;
        }


        return answer;
    }

    public static void main(String[] args) {
        int a = 5;
        int[] b = {2, 1, 2, 4, 2, 4, 3, 3};
        FirstLevel16 firstLevel16 = new FirstLevel16();
        System.out.println(firstLevel16.solution(a, b));
    }
}
