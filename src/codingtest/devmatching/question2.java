package codingtest.devmatching;

public class question2 {
    public int[][] solution(int n, boolean horizontal) {
        int[][] answer = new int[n][n];
        int a=0;
        int b=0;
        if(horizontal==true){ //첫 시작이 수평
            answer[0][0] = 1; //0,0 은 1
            for(int i=1;i<n;i++){
                answer[i][i] = answer[i-1][i-1] + 2*i; //대각선 값은 고정
                a =answer[i][i];
                b = answer[i][i];
                if(i%2==1){
                    for(int j=i-1;j>=0;j--){
                        answer[i][j] = ++a;
                    }
                    for(int j=i-1;j>=0;j--){
                        answer[j][i] = --b;
                    }
                }else{
                    for(int j=i-1;j>=0;j--){
                        answer[i][j] = --a;
                    }
                    for(int j=i-1;j>=0;j--){
                        answer[j][i] = ++b;
                    }
                }
            }
        }else {
            answer[0][0] = 1; //0,0 은 1
            for(int i=1;i<n;i++){
                answer[i][i] = answer[i-1][i-1] + 2*i; //대각선 값은 고정
                a =answer[i][i];
                b = answer[i][i];
                if(i%2==1){ //홀수면 위로가는건 - 왼쪽으로 가는건 +
                    for(int j=i-1;j>=0;j--){
                        answer[i][j] = --a;
                    }
                    for(int j=i-1;j>=0;j--){
                        answer[j][i] = ++b;
                    }
                }else{ // 짝수면 위로가는건 + 왼쪽으로 가는건 -
                    for(int j=i-1;j>=0;j--){
                        answer[i][j] = ++a;
                    }
                    for(int j=i-1;j>=0;j--){
                        answer[j][i] = --b;
                    }
                }
            }
        }
        return answer;
    }
}
