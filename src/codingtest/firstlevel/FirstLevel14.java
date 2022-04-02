package codingtest.firstlevel;

import java.util.HashMap;
import java.util.Map;

public class FirstLevel14 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Map<Integer, Integer> has = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            has.put(i, 0);
        }
        for (int i : lost) {
            has.put(i, has.get(i) - 1);
        }
        for (int i : reserve) {
            has.put(i, has.get(i) + 1);
        }

        for (Integer integer : has.keySet()) {
            if (has.get(integer) == -1) {
                if (integer!=1&&has.get(integer - 1) == 1) {
                    has.put(integer, has.get(integer) + 1);
                    has.put(integer - 1, has.get(integer - 1) - 1);
                    continue;
                } else if (integer!=n&&has.get(integer + 1) == 1) {
                    has.put(integer, has.get(integer) + 1);
                    has.put(integer + 1, has.get(integer + 1) - 1);
                    continue;
                }
            }
        }
        for (Integer value : has.values()) {
            if (value >= 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FirstLevel14 firstLevel14 = new FirstLevel14();
        int a = 5;
        int[] b = {2,4};
        int[] c = {1, 3, 5};
        System.out.println(firstLevel14.solution(a,b,c));
    }
}
