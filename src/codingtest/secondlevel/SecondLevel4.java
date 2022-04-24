package codingtest.secondlevel;

import java.util.ArrayList;
import java.util.Collections;


public class SecondLevel4 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        ArrayList<Integer> sco = new ArrayList<>();
        for (int i : scoville) {
            sco.add(i);
        }

        while(true){
            if(sco.get(0)>=K){
                break;
            }
            if(sco.size()==1){
                return -1;
            }
            answer++;
            int newFood = sco.get(0) + sco.get(1) * 2;
            sco.remove(1);
            sco.remove(0);
            sco.add(newFood);
            Collections.sort(sco);
        }
        return answer;
    }
}
