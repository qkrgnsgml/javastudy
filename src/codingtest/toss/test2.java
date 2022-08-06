package codingtest.toss;

import java.util.Arrays;

public class test2 {
    public int solution(int[] levels) {
        int answer = 0;
        int[] ints = Arrays.stream(levels).sorted().toArray();
        double v = levels.length * 0.75;
        double ceil = Math.ceil(v);
        int i = levels.length - 1;
        int ceil1 = (int) ceil;
        if(ceil1>i){
            return -1;
        }
        return ints[ceil1];
    }
}
