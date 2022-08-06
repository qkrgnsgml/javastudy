package codingtest.toss;

import java.util.*;

public class test5 {
    public int solution(int[] tasks) {
        int answer = 0;
        List<Integer> task = new ArrayList<>();
        for (int i : tasks) {
            task.add(i);
        }
        while(true){
            int before = task.size();
            if(task.get(0)==null){
                return answer;
            }
            if(Collections.frequency(task,task.get(0))>=3){
                for(int i=0;i<3;i++){
                    task.remove(Integer.valueOf(task.get(0)));
                }
                answer++;
            }else if(Collections.frequency(task,task.get(0))==2){
                for(int i=0;i<2;i++){
                    task.remove(Integer.valueOf(task.get(0)));
                }
                answer++;
            }else{
                if(answer==0){
                    return -1;
                }
                return answer;
            }

        }

    }
}
