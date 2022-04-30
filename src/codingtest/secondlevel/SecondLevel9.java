package codingtest.secondlevel;

public class SecondLevel9 {
    public int solution(int[] arr) {
        int answer = 0;
        int count = 0;
        while(true){
            answer++;
            count=0;
            for(int i=0;i<arr.length;i++){
                if(answer%arr[i]==0){
                    count++;
                }
            }
            if(count == arr.length){
                return answer;
            }
        }
        //return answer;
    }
}
