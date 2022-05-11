package codingtest.secondlevel;


public class SecondLevel16 {
    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;
        int cntHigh =0;
        int cntLow=0;
        for(int i=length;i>0;i--){
            cntHigh = 0;
            cntLow=0;
            for (int citation : citations) {
                if(citation>=i){
                    cntHigh++;
                }else {
                    cntLow++;
                }
            }
            if(cntHigh>=i&&cntLow<=i){
                return i;
            }
        }
        return answer;
    }
}
