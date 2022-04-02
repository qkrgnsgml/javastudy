package codingtest.firstlevel;

public class FirstLevel6 {
    public int solution(int[] absolutes, boolean[] signs) {
        int i =0;
        int sum=0;
        for (boolean sign : signs) {
            if(!sign){
                absolutes[i] *=-1;
            }
            sum+=absolutes[i];
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        FirstLevel6 firstLevel6 = new FirstLevel6();
        int[] a = {4,7,12};
        boolean[] b = {true,false,true};
        System.out.println(firstLevel6.solution(a,b));
    }
}
