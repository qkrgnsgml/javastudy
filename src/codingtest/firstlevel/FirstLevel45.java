package codingtest.firstlevel;

public class FirstLevel45 {
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        if(arr.length==1){
            return new int[]{-1};
        }
        int min = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int j=0;
        for(int i=0;i<answer.length;i++){
            if(arr[j]!=min){
                answer[i]=arr[j];
                j++;
            }else{
                j++;
                i--;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{8,7,6,9}));
    }
}
