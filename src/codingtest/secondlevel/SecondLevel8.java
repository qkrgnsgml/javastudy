package codingtest.secondlevel;

import java.util.Arrays;
import java.util.Collections;

public class SecondLevel8 {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Integer[] Bcopy = new Integer[B.length];
        for(int i=0;i<B.length;i++){
            Bcopy[i] = B[i];
        }

        Arrays.sort(A);
        Arrays.sort(Bcopy, Collections.reverseOrder());
        for(int i=0;i<B.length;i++){
            answer += A[i] * Bcopy[i];
        }

        return answer;
    }
}
