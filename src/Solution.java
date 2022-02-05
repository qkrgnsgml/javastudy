import java.util.ArrayList;
import java.util.Arrays;

class Solution
{
    public static int solution(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        for (; i < j; --j) {
            if (people[i] + people[j] <= limit)
                ++i;
        }
        return people.length - i;
    }
    public static void main(String args[]) throws Exception
    {
        int[] list = {10,30,30,40,90};
        int a = 100;
        int b = solution(list,a);
        System.out.println(b);
    }
}