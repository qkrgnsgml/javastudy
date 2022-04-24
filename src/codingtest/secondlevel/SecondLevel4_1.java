package codingtest.secondlevel;

import java.util.*;

public class SecondLevel4_1 {
    public int solution(int[] scoville, int K) {
        PriorityQueue queue = new PriorityQueue();
        for (int i = 0; i < scoville.length; i++) {
            queue.add(scoville[i]);
        }
        int cnt = 0;
        while (!isAll(queue, K)) {
            if(queue.size()==1) {
                cnt = -1;
                break;
            }
            int one = (int) queue.poll();
            int two = (int) queue.poll();

            int spicy = calcu(one, two);
            queue.add(spicy);
            cnt++;
        }
        return cnt;
    }

    public int calcu(int a, int b) {
        int ans = 0;
        ans = a + (b * 2);
        return ans;
    }

    public boolean isAll(PriorityQueue sc, int k) {

        int cnt = (int)sc.peek();
        if(cnt >= k) {
            return true;
        }else {
            return false;
        }
    }
}
