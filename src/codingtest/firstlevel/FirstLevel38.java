package codingtest.firstlevel;

public class FirstLevel38 {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==32){ //공백이라면
                answer+=" ";
                continue;
            }
            if(s.charAt(i)>=65&&s.charAt(i)<91){ //대문자라면 65~90
                if(s.charAt(i)+n>90){//z를 넘어가면
                    answer+=Character.toString(64+(s.charAt(i)+n-90));
                }else{
                    answer+=Character.toString(s.charAt(i)+n);
                }
            }else{ //소문자라면 97~122
                if(s.charAt(i)+n>122){
                    answer+=Character.toString(96+(s.charAt(i)+n-122));
                }else{
                    answer+=Character.toString(s.charAt(i)+n);
                }
            }

        }
        return answer;
    }
}
