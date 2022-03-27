package codingtest;

import java.util.*;
import java.util.stream.Collectors;

public class FirstLevel25 {
    public int[] solution(int[] arr) {
        int dup = 0;
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            dup = arr[i];
            if (i == 0) {
                a.add(dup);
                continue;
            } else {
                if (arr[i - 1] == dup) {
                    continue;
                } else {
                    a.add(dup);
                }
            }
        }

        int[] anwser = new int[a.size()];
        int j = 0;
        for (int i : a) {
            anwser[j] = i;
            j++;
        }
        return anwser;

    }
}
