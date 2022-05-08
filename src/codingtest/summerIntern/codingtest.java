package codingtest.summerIntern;

public class codingtest {
    public static int solution(int[][] atmos) {
        int answer = 0;
        boolean[] hasMask = new boolean[atmos.length];
        for (int i = 0; i < atmos.length; i++) {
            if (atmos[i][0] >= 151 && atmos[i][1] >= 76) {
                if (i == 0) {
                    answer++;
                    continue;
                }
                if (hasMask[i - 1] == true) {
                    hasMask[i - 1] = false;
                    continue;
                }
                if (i > 2) {
                    if (hasMask[i - 2] == true) {
                        continue;
                    }
                }

                answer++;
                continue;
            }
            if (atmos[i][0] >= 81 || atmos[i][1] >= 36) {
                if (i == 0) {
                    answer++;
                    hasMask[i] = true;
                    continue;
                }

                if (hasMask[i - 1] == true) {
                    continue;
                }
                if (i > 2) {
                    if (hasMask[i - 2] == true) {
                        continue;
                    }
                }
                answer++;
                hasMask[i] = true;
            }

        }
        return answer;
    }

    public static void main(String[] args) {


        System.out.println(solution(new int[][]{{140, 90}, {177, 75}, {95, 45}, {71, 31}, {150, 30},
                {80, 35}, {72, 33}, {166, 81}, {151, 75}}));
    }
}
