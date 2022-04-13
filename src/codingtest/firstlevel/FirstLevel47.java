package codingtest.firstlevel;

public class FirstLevel47 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int temp = 0;
        if(n<m){
            temp = n;
            n = m;
            m = temp; //n이 무조건 큰수
        }
        for(int i=1; i<=n;i++){
            if(n%i==0&&m%i==0){
                answer[0] = i;
            }
        }
        for(int i=1;i<=n*m;i++){
            if(i%n==0&&i%m==0){
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}
