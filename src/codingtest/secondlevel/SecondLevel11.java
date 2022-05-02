package codingtest.secondlevel;

public class SecondLevel11 {
    public static int solution(int n) {
        int answer = 0;
        int cnt =0;
        int nCnt=0;
        String s2 = Integer.toBinaryString(n);
        String[] split1 = s2.split("");
        for (String s : split1) {
            if(s.equals("1")){
                nCnt++;
            }
        }
        while(true){
            cnt=0;
            n++;
            String s = Integer.toBinaryString(n);
            String[] split = s.split("");
            for (String s1 : split) {
                if(s1.equals("1")){
                    cnt++;
                }
            }
            if(cnt==nCnt){
                return n;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(15));

    }
//    public static int solution(int n) {
//        int answer = 0;
//        int cnt =0;
//        int nCnt = Integer.bitCount(n);
//        while(true){
//            cnt=0;
//            n++;
//            cnt = Integer.bitCount(n);
//            if(cnt==nCnt){
//                return n;
//            }
//        }
//    }
}
