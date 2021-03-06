package codingtest.firstlevel;

public class FirstLevel26 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0;i<n;i++){
            String s = Integer.toBinaryString(arr1[i] | arr2[i]);
            //s = String.format("%" + n + "s", s);
            while(s.length()<n){
                s = "0"+s;
            }
            s=s.replaceAll("1","#");
            s=s.replaceAll("0"," ");
            answer[i]=s;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] solution = solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }
}
