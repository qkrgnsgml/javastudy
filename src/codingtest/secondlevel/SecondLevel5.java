package codingtest.secondlevel;


import java.util.Arrays;

public class SecondLevel5 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length; i++) {

            if (i == 0) {
                if (phone_book[i + 1].startsWith(phone_book[i])) {
                    return false;
                }
            } else if (i == phone_book.length - 1) {
                if (phone_book[i - 1].startsWith(phone_book[i])) {
                    return false;
                }
            } else {
                if (phone_book[i + 1].startsWith(phone_book[i]) || phone_book[i - 1].startsWith(phone_book[i])) {
                    return false;
                }
            }
        }
        return answer;
    }
}
