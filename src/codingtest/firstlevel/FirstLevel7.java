package codingtest.firstlevel;

public class FirstLevel7 {
    public String solution(int[] numbers, String hand) {
        hand = hand.equals("right")?"R":"L";
        String answer = "";
        String left = "*";
        String right = "#";
        for (int number : numbers) {
            if(number==1||number==4||number==7){
                answer+="L";
                left+=number;
            }else if (number==3||number==6||number==9){
                answer+="R";
                right+=number;
            }else {
                if((left.substring(left.length()-1).equals("*")&&right.substring(right.length()-1).equals("#"))
                ||Math.abs((number-Integer.parseInt(left.substring(left.length()-1))))==Math.abs(number-Integer.parseInt(right.substring(left.length()-1)))
                ||Math.abs((number-Integer.parseInt(left.substring(left.length()-1)))-(number-Integer.parseInt(right.substring(left.length()-1))))==2){
                    answer+=hand;
                }
                answer+="T";
            }
        }
        System.out.println(left);
        System.out.println(right);
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand="right";
        FirstLevel7 firstLevel7 = new FirstLevel7();
        System.out.println(firstLevel7.solution(a,hand));
    }
}
