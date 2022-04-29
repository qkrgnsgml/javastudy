package codingtest.secondlevel;

public class SecondLevel7 {
    public int solution(int n) {
        int answer =0;

        for(int i=1;i<=n;i++){
            int inum=i;
            int add =0;
            while (true){
                add+=inum;

                if(add==n){
                    answer++;
                    break;
                }else if(add>n){
                    break;
                }
                inum++;
            }
        }
        return answer;
    }
}
