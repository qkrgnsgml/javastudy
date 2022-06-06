package codingtest.secondlevel;

public class SecondLevel30 {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        long n = 0;
        long count=0;
        for (int i=0;i<numbers.length;i++){
            long number = numbers[i];
            n = number;
            String bit = Long.toBinaryString(number);
            while(true){
                n++;
                String abit = Long.toBinaryString(n);
                long l = Long.parseLong(bit) ^ Long.parseLong(abit);
                String s = String.valueOf(l);
                for(int k=0;k<s.length();k++){
                    if(s.indexOf(k)==1){
                        count++;
                    }
                    if(count>3){
                        break;
                    }
                }
                if(count<=2){
                    answer[i]=n;
                }
            }
        }

        return answer;
    }
}
