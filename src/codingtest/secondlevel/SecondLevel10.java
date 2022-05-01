package codingtest.secondlevel;

public class SecondLevel10 {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int count =0;
        for(int i=0;i<prices.length;i++){
            count = 0;
            for(int j=i+1;j<prices.length;j++){

                if(prices[i]>prices[j]){
                    count++;
                    answer[i] = count;
                    break;
                }
                count++;
            }
            if(count==prices.length-1-i){
                answer[i] = count;
            }

            if(i == prices.length-1){
                answer[i] = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 2, 3}));
    }
}
