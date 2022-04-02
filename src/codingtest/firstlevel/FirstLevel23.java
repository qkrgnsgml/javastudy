package codingtest.firstlevel;

public class FirstLevel23 {
    public long solution(int price, int money, int count) {
        for(int i=1;i<=count;i++){
            money-=(price*i);
        }

        if(money>=0){
            return 0;
        }else{
            return -(money);
        }


    }
}
