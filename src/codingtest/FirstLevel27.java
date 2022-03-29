package codingtest;

public class FirstLevel27 {
    public static int solution(String dartResult) {
        int answer = 0;
        String[] arrayDart = dartResult.split("");
        int power=0;
        int num=0;
        int[] numArr = new int[3];
        int j=0;
        for(int i=0;i<arrayDart.length;i++){
            if(arrayDart[i].equals("D")){
                power=2;
            }else if(arrayDart[i].equals("T")){
                power=3;
            }else if(arrayDart[i].equals("S")){
                power=1;
            }else{
                continue;
            }

            if(i==1){
                num = Integer.parseInt(arrayDart[i - 1]);
            }else{
                if(arrayDart[i-2].matches("[+-]?\\d*(\\.\\d+)?")){
                    num = Integer.parseInt(arrayDart[i-2]+arrayDart[i-1]);
                }else {
                    num = Integer.parseInt(arrayDart[i - 1]);
                }
            }

            numArr[j]= (int) Math.pow(num,power);

            if(dartResult.length()-1==i){
                continue;
            }
            if(arrayDart[i+1].equals("*")){
                if(j==0){
                    numArr[j]*=2;
                }else{
                    numArr[j]*=2;
                    numArr[j-1]*=2;
                }
            }else if(arrayDart[i+1].equals("#")){
                numArr[j]*=-1;
            }else {

            }
            j++;

        }
        for (int i : numArr) {
            answer+=i;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("1D2S#10S"));
    }
}
