package codingtest.firstlevel;

public class FirstLevel35 {
    public int solution(int n) {
        int answer = 0;
        boolean isit = true;
        for (int i = 2; i <= n; i++) {
            isit = true;
            if(i!=2&&i%2==0){
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isit = false;
                    break;
                }
            }
            if (isit) {
                answer++;
            }

        }
        return answer;
    }
}
