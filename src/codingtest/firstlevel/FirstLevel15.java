package codingtest.firstlevel;

import java.util.HashSet;
import java.util.Set;

public class FirstLevel15 {
    public int solution(int[] nums) {
        int answer = 0;
        int maxCount = nums.length/2;
        Set<Integer> poketmon = new HashSet<>();
        int i=0;
        for (int num : nums) {
            poketmon.add(num);
            if(poketmon.stream().count()==maxCount){
                break;
            }
            i++;
        }
        answer = (int) poketmon.stream().count();

        return answer;
    }
}
