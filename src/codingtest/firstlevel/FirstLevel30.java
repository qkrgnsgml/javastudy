package codingtest.firstlevel;

import java.util.*;

public class FirstLevel30 {
    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        Arrays.sort(strings);
        String[] c = new String[strings.length];
        int i=0;
        for (String string : strings) {
            c[i] = ""+string.charAt(n);
            i++;
        }
        Arrays.sort(c);

        List<String> arr = new ArrayList<>(Arrays.asList(strings));

        i=0;
        for (String s1 : c) {
            for (String s : arr) {
                if(s1.equals(""+s.charAt(n))){
                    answer[i] = s;
                    arr.remove(s);
                    i++;
                    break;
                }

            }

        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"abce", "abcd", "cdx"},2));
    }
}
