package codingtest.firstlevel;

public class FirstLevel31 {
    boolean solution(String s) {
        int pct=0;
        int yct=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='p'||s.charAt(i)=='P'){
                pct++;
            }
            if(s.charAt(i)=='y'||s.charAt(i)=='Y'){
                yct++;
            }
        }

        if(yct==0&&pct==0){
            return true;
        }else{
            return pct==yct;
        }
    }
}
