package codingtest.firstlevel;

public class FirstLevel46 {
    public String solution(int num) {
        if(num<0){
            num*=-1;
        }
        if(num==0){
            return "Even";
        }else if(num%2==1){
            return "Odd";
        }else{
            return "Even";
        }
    }
}
