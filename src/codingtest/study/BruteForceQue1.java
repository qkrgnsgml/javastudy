package codingtest.study;

import boj.FastReader;

public class BruteForceQue1 {
    static int N, max, min;
    static int[] nums, operators, order;

    static StringBuilder sb = new StringBuilder();

    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        operators = new int[5];
        order = new int[N+1];
        for(int i=1;i<=N;i++) nums[i] = scan.nextInt();
        for(int i=1;i<=4;i++) operators[i] = scan.nextInt();

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
    }

    static int calculator(){ //정답 갱신 함수
        int value = nums[1];
        for (int i=1;i<=N-1;i++){
            if(order[i]==1){
                value+=nums[i+1];
            }
            if(order[i]==2){
                value-=nums[i+1];
            }
            if(order[i]==3){
                value*=nums[i+1];
            }
            if(order[i]==4){
                value/=nums[i+1];
            }
        }
        return value;
    }

    static void rec_func(int k){
        if(k==N){
            //정답 갱신
            int value = calculator();
            max = Math.max(max,value);
            min = Math.min(min, value);
        }else {
            for(int cand = 1; cand<=4;cand++){
                if(operators[cand]>=1){
                    operators[cand]--;
                    order[k] = cand;
                    rec_func(k+1);
                    operators[cand]++;
                    order[k] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        input();
    }
}
