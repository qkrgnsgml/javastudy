package codingtest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FirstLevel2 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int max=0;
        int min=0;

        Set<Integer> win = new HashSet<>();
        for (int win_num : win_nums) {
            win.add(win_num);
        } //로또 번호  set에 저장

        //아예 같을때
        for (int lotto : lottos) {
            if(lotto==0){
                max++;
                continue;
            }
            if(win.contains(lotto)){
                max++;
                min++;
            }
        }

        switch (max){
            case 0:answer[0]=6;break;
            case 1:answer[0]=6;break;
            case 2:answer[0]=5;break;
            case 3:answer[0]=4;break;
            case 4:answer[0]=3;break;
            case 5:answer[0]=2;break;
            case 6:answer[0]=1;break;
        }
        switch (min){
            case 0:answer[1]=6;break;
            case 1:answer[1]=6;break;
            case 2:answer[1]=5;break;
            case 3:answer[1]=4;break;
            case 4:answer[1]=3;break;
            case 5:answer[1]=2;break;
            case 6:answer[1]=1;break;
        }
        return answer;
    }

    public static void main(String[] args) {
        FirstLevel2 firstLevel2 = new FirstLevel2();
        int[] a = {44, 1, 2, 3, 0, 25};
        int[] b = {44, 1, 2, 3, 32, 25};
        int[] solution = firstLevel2.solution(a, b);
        System.out.println(solution[0]);
        System.out.println(solution[1]);

    }
}
