package codingtest.firstlevel;

import java.util.Locale;

public class FirstLevel40 {
    public String solution(String s) {
        String answer = "";
        int count = 2;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==32){
                answer+=" ";
                count=2;
                continue;
            }

            if(count%2==0){
                String s1 = Character.toString(s.charAt(i)).toUpperCase();
                answer+=s1;
                count++;
            }else{
                String s2 = Character.toString(s.charAt(i)).toLowerCase();
                answer+=s2;
                count++;
            }

        }
        return answer;
    }
}
