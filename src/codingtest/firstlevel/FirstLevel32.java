package codingtest.firstlevel;

import java.util.Arrays;
import java.util.Collections;

public class FirstLevel32 {
    public static String solution(String s) {
        String answer = "";
        char[] a = new char[s.length()];
        char[] b = new char[s.length()];
        int j=0;
        int k=0;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                b[j] = s.charAt(i); //대문자 넣기
                j++;
            }else{
                a[k]=s.charAt(i); //소문자 넣기
                k++;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=a.length-1;i>=0;i--){
            if(a[i] == 0){
                continue;
            }
            answer+=Character.toString(a[i]);
        }
        for(int i=b.length-1;i>=0;i--){
            if(b[i] == 0){
                continue;
            }
            answer+=Character.toString(b[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
}
