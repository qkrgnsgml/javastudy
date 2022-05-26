package codingtest.secondlevel;

import java.util.Arrays;

public class SecondLevel23_1 {
    int solution(int[][] land) {
        int answer = 0;

        for(int i = 1 ; i<land.length; i++){

            land[i][0] += Math.max(Math.max(land[i-1][1],land[i-1][2]), land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][2],land[i-1][0]), land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][1],land[i-1][0]), land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][1],land[i-1][0]), land[i-1][2]);
        }
        int [] result = land[land.length-1];
        Arrays.sort(result);
        return result[result.length-1];
    }
}
