package codingtest.firstlevel;

import java.util.Arrays;
import java.util.Collections;

public class FirstLevel43 {
    public long solution(long n) {
        long answer = 0;
        String a = ""+n;
        String[] c = new String[a.length()];
        for(int i=0;i<c.length;i++){
            c[i]=""+a.charAt(i);
        }
        Arrays.sort(c, Collections.reverseOrder());
        String b = "";
        for (String aChar : c) {
            b+=aChar;
        }
        answer=Integer.parseInt(b);
        return answer;
    }
}
