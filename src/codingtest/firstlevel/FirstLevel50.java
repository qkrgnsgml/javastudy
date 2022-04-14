package codingtest.firstlevel;

public class FirstLevel50 {
    public boolean solution(int x) {
        String s = String.valueOf(x);
        int sum=0;
        int num = 0;
        for (int i=0;i<s.length();i++){
            num = Character.getNumericValue(s.charAt(i));
            sum +=num;
        }
        if(x%sum==0){
            return true;
        }else{
            return false;
        }
    }
}
