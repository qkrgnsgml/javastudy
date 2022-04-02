package codingtest.firstlevel;

public class FirstLevel10 {
    public int solution(int[] nums) {
        int answer = 0;
        int first=0;
        int second=0;
        int third=0;
        int sosu = 0;
        boolean isit = true;

        for(int i=0;i<nums.length;i++){
            first = nums[i];
            for(int j=i+1;j<nums.length;j++){
                second=nums[j];
                for (int k=j+1;k<nums.length;k++){
                    third=nums[k];
                    sosu=first+second+third;
                    isit=true;
                    for(int l=2;l<sosu;l++){
                        if(sosu%l==0){
                            isit=false;
                            break;
                        }
                    }
                    if(isit){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FirstLevel10 firstLevel10=new FirstLevel10();
        int[] a={1,2,7,6,4};
        System.out.println(firstLevel10.solution(a));
    }
}
