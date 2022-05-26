package codingtest.secondlevel;

import java.util.Arrays;

public class SecondLevel23 {

    static int solution(int[][] land) {
        int answer = 0;
        int temp = 0;
        int max = 1;
        int temp2 = 0;

        for (int i = 0; i < land.length; i++) {
            max = 0;

            for (int j = 0; j < land[i].length; j++) {

                if (j == temp2 && j != 0) {
                    continue;
                }

                if (max < land[i][j]) {
                    max = land[i][j];
                    temp = j;
                }

            }
            temp2 = temp;
            answer += max;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}}));
    }
}
