package codingtest.secondlevel;

import java.util.ArrayList;

public class SecondLevel14 {
    public static int[] solution(int n, String[] words) {

        ArrayList<String> wordList = new ArrayList<>();
        int cnt = 0;
        int idx = 0;
        for (int i = 0; i < words.length; i++) {

            idx++;
            if (i == 0) {
                wordList.add(words[0]);
                cnt++;
                continue;
            }

            if (words[i].charAt(0) == wordList.get(i - 1).charAt(wordList.get(i - 1).length() - 1)) {
                if (wordList.contains(words[i])) {
                    return new int[]{idx, cnt / n + 1};
                }
                cnt++;
                wordList.add(words[i]);
                if (idx % n == 0) {
                    idx = 0;
                }
                continue;
            } else {
                return new int[]{idx, cnt / n + 1};
            }


        }


        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        System.out.println(solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}));
    }
}
