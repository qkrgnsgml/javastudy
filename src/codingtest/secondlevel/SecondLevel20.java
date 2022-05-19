package codingtest.secondlevel;

import java.util.ArrayList;
import java.util.List;

public class SecondLevel20 {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int a = brown + yellow;
        List<Integer> b = new ArrayList<>();
        for(int i=1;i<=a;i++){
            if(a%i==0){
                b.add(i);
            }
        }

        for(int i=0; i<b.size();i++){
            if((b.get(i)-2)*(b.get(b.size()-1-i)-2)==yellow){
                answer[0] = b.get(b.size()-1-i);
                answer[1] = b.get(i);
                break;
            }
        }

//        if(b.size()%2==0){
//            answer[0] = b.get(b.size()/2);
//            answer[1] = b.get(b.size()/2-1);
//        }else{
//            answer[0] = b.get(b.size()/2);
//            answer[1] = b.get(b.size()/2);
//        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(8,1));
    }
}
