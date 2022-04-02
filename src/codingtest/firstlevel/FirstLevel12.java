package codingtest.firstlevel;

import java.util.ArrayList;
import java.util.List;

public class FirstLevel12 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> a = new ArrayList<>();


        for(int i=0; i<commands.length;i++){
            a.clear();
            for(int j=commands[i][0]-1;j<commands[i][1];j++){
                a.add(array[j]);
            }

            a.sort(Integer::compareTo);
            answer[i]=a.get(commands[i][2]-1);
        }

        return answer;
    }

    public static void main(String[] args) {
        FirstLevel12 firstLevel12 = new FirstLevel12();
        int[] a = {1, 5, 2, 6, 3, 7, 4};
        int[][] b = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
        System.out.println(firstLevel12.solution(a,b));
    }

}
