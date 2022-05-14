package codingtest.secondlevel;

import java.util.*;

public class SecondLevel18 {
    //이 문제를 간단하게 요약하면 전체 배열 중 특정 수를 음수로 바꿔 타갯을 찾는 것.
    //특정 수만 음수로 바꾼 전체 합은 전체 합 - (음수로 바꿀 수 * 2)가 성립함
    //따라서 전체 합에서 차례대로 index를 탐색하며 수를 하나씩 빼본다. ->partSum이라고 하자.
    //만약 partSum이 target보다 작다면 다른 수를 더 빼도 target보다 항상 작으므로 이 경우 찾고자 하는 경우를 만족하지 못한다.
    //만약 partSum이 target과 같다면 더이상 다른 수를 뺄 필요 없이 경우의 수를 하나 찾았으며 이 경우 추가 탐색은 필요없다.
    //만약 partSum이 target보다 크다면 뺀 수의 다음 인덱스들을 하나씩 다시 뺴본다. (재귀함수로 구현)
    //이전에 뺀 인덱스의 다음만 탐색하는것은 어떤 수를 뺴는데 있어 순서가 고려되지 않기때문.
    //(3번째 인덱스와 1번쨰 인덱스를 빼는 경우는 순서를 고려하지 않은 1가지 경우의 수)
    static int getTarget(ArrayList<Integer> numbers, int subIndex, int Sum, int Target, int cnt){
        int partcnt = 0;
        for(int i = subIndex; i<numbers.size(); i++){
            int prevSum = Sum;
            ArrayList<Integer> newNumbers = new ArrayList<Integer>();
            newNumbers.addAll(numbers);
            prevSum = prevSum-(newNumbers.get(i) * 2);
            if(prevSum < Target)
                continue;
            else if(prevSum == Target)
                cnt+= 1;
            else {
                newNumbers.remove(i);
                if(newNumbers.size() == 1)
                    continue;
                cnt += getTarget(newNumbers, i, prevSum, Target, partcnt);

            }
        }
        return cnt;
    }
    public static int solution(int[] numbers, int target) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int sum = 0;
        int cnt = 0;
        for(int i = 0; i<numbers.length; i++) {
            array.add(i, numbers[i]);
            sum+= numbers[i];
        }
        cnt = getTarget(array, 0, sum, target, cnt);

        return cnt;
    }
}
