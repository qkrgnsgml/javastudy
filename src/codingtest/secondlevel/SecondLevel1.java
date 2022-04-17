package codingtest.secondlevel;

public class SecondLevel1 {
    public static String solution(int n) {
        String answer = "";
        int leave = n;
        int cnt = 0;
        while(true){
            cnt++;
            n = (int) (n - (Math.pow(3,cnt)));
            if(n<=0){
                cnt--;
                break;
            }
        }

        for(int i=cnt;i>0;i--){
            for(int j=1;j<=3;j++){
                if(j==3){
                    leave = (int) (leave-((Math.pow(3,cnt)*(j-1))));
                    answer +=4;
                    break;
                }
                if(leave-((Math.pow(3,cnt))*j)<0){
                    leave = (int) (leave-((Math.pow(3,cnt)*(j-1))));
                    answer +=j-1;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(43));
    }
}
