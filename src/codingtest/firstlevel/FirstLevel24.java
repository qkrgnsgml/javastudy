package codingtest.firstlevel;

public class FirstLevel24 {
    public String solution(String s) {

        if(s.length()%2==1){
            return s.substring(s.length()/2,s.length()/2+1);
        }else{
            return s.substring(s.length()/2-1,s.length()/2+1);
        }

    }
}
