package codingtest.study;

import boj.FastReader;

public class BruteForce {
    static int N, M;
    static int[] selected, used;

    static StringBuilder sb = new StringBuilder();

    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M + 1];
    }

    static void rec_func_1(int k) { //n개중에 M개만큼의 완전탐색
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(' ');
                sb.append('\n');
            }
        } else {
            for (int cand = 1; cand <= N; cand++) {
                selected[k] = cand;
                //k+1 ~ M 을 모두 탐색
                rec_func_1(k + 1);
                selected[k] = 0;
            }
        }
    }

    static void rec_func_2(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(' ');
                sb.append('\n');
            }
        } else {
            for (int cand = 1; cand <= N; cand++) {
                boolean isUsed = false;
                for (int i = 1; i < k; i++) {
                    if (cand == selected[i]) {
                        isUsed = true;
                    }
                }
                //k번째에 cand가 되면
                if (!isUsed) {
                    selected[k] = cand;
                    rec_func_2(k + 1);
                    selected[k] = 0;
                }
            }
        }
    }


    static void rec_func_2_upgrade(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(' ');
                sb.append('\n');
            }
        } else {
            for (int cand = 1; cand <= N; cand++) {
                if(used[cand]==1) continue;

                selected[k] = cand; used[cand] =1;

                rec_func_2_upgrade(k+1);

                selected[k] = 0; used[cand] = 0;
            }
        }
    }

    static void rec_func_3(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(' ');
                sb.append('\n');
            }
        } else {
            int start = selected[k-1];
            for (int cand = start; cand <= N; cand++) {
                selected[k] = cand;
                rec_func_3(k + 1);
                selected[k] = 0;
            }
        }
    }

    static void rec_func_4(int k) { //n개중에 M개만큼의 완전탐색
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(' ');
                sb.append('\n');
            }
        } else {
            for (int cand = selected[k-1]+1 ; cand <= N; cand++) {
                selected[k] = cand;
                //k+1 ~ M 을 모두 탐색
                rec_func_4(k + 1);
                selected[k] = 0;
            }
        }
    }

    public static void main(String[] args) {

    }
}
