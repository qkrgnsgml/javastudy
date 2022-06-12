package codingtest.SKTIntern;

import java.util.Arrays;

public class first {
    public static int[] solution(int[] p) {
        int[] answer = new int[p.length];
        int tempNum = 0;
        int[] temp = new int[p.length];
        int i1=0;
        for(int i=0; i<p.length;i++){
            temp[i] = p[i];
        }
        Arrays.sort(temp);
        for(int i=0; i<p.length;i++){
            i1=0;
            for(int j=0;j<p.length;j++){
                if(temp[i] == p[j]){
                    i1=j;
                    break;
                }
            }
            tempNum = p[i];
            p[i] = p[i1];
            p[i1] = tempNum;
            answer[i1]++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,5,3,1,4}));
    }
}

