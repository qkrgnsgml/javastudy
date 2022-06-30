package codingtest.study;

import boj.FastReader;

import java.util.Arrays;

public class Sort implements Comparable<Sort>{
    public int num, idx;

    static StringBuilder sb = new StringBuilder();

    static int N;
    static int[] P;
    static Sort[] B;

    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        B = new Sort[N];
        P = new int[N];
        for(int i=0; i<N;i++){
            B[i] = new Sort();
            B[i].num = scan.nextInt();
            B[i].idx = i;
        }
    }

    static void pro(){
        Arrays.sort(B);

        for(int b_idx = 0; b_idx<N; b_idx++){
            P[B[b_idx].idx] = b_idx;
        }

        for(int i=0;i<N;i++){
            sb.append(P[i]).append(' ');
        }
        System.out.println(sb.toString());
    }

    @Override
    public int compareTo(Sort other) {
        if(num != other.num) return num- other.num;
        return idx - other.idx;
    }
}
