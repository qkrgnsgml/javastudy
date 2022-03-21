package boj;

public class NandM {

    static StringBuilder sb = new StringBuilder();

    static int N,M;
    static int[] selected;

    static void rec_func(int k){
        if(k==M+1){
            for (int i = 1; i <= M; i++) sb.append(selected[i]).append(' ');
            sb.append('\n');
        }else{
            for(int cand = 1;cand<=N; cand++){
                selected[k] = cand;
                rec_func(k+1);
                selected[k]=0;
            }
        }
    }

    private static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();

    }

    public static void main(String[] args) {
        input();

        rec_func(1);
    }
}
