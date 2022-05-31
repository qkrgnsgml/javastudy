package codingtest.secondlevel;

public class SecondLevel26 {
    public int solution(int n) { //피보나치
        int answer = 1;

        int a = 1;
        int b = 1;

        for (int i = 1; i < n; i++) {
            answer = (a + b)  % 1000000007; // 마지막에 나눠주면 overflow가 나기 때문에 계산 과정에서 나눔

            a = b;
            b = answer;
        }

        return answer;
    }
}
