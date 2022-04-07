package codingtest.firstlevel;

public class FirstLevel37 {
    public int solution(String s) {
        int answer = 0;
        boolean isNum = false;

        isNum = s.matches("[0-9]+[\\.]?[0-9]*");
        if(isNum){
            return Integer.parseInt(s);
        }else{
            if(s.substring(0,1).equals("+")){
                return Integer.parseInt(s.substring(1));
            }else{
                return -(Integer.parseInt(s.substring(1)));
            }
        }


    }
}
