package codingtest.secondlevel;

import java.util.ArrayList;

public class SecondLevel13 {
    public static int solution(String s)
    {
        char[] chars;
        ArrayList<Character> list;
        int count=0;
        int cnt=0;
        String st="";
        while(true){
            st="";
            chars = s.toCharArray();
            list = new ArrayList<>();
            for (char aChar : chars) {
                list.add(aChar);
            }
            cnt++;
            for(int i=0;i<list.size();i++) {
                if(i==list.size()-1){
                    break;
                }
                if(list.get(i)==list.get(i+1)){
                    list.remove(i+1);
                    list.remove(i);
                    count++;
                    break;
                }
            }
            for (Character character : list) {
                st+=character;
            }
            s=st;
            if(list.size()==0){
                return 1;
            }
            if(count!=cnt){
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("baabaa"));
    }
}
