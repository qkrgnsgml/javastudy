package codingtest.firstlevel;

public class FirstLevel13 {
    public int[] solution(int[] answers) {
        int[] su1 = new int[answers.length];
        int[] su2 = new int[answers.length];
        int[] su3 = new int[answers.length];

        int[] su2s = new int[]{1,3,4,5};
        int[] su3s = new int[]{3,1,2,4,5};

        int i=0;
        int zzik=1;

        while (i<answers.length){
            su1[i]=zzik;
            zzik++;
            i++;
            if(zzik==6){
                zzik=1;
            }
        } //su1완성

        i=0;
        int j=0;
        while (i<answers.length) {
            if(i==0||i%2==0){
                su2[i]=2;
                i++;
                continue;
            }else{
                su2[i]=su2s[j];
                j++;
                if(j==4){
                    j=0;
                }
                i++;
            }
        } //su2생성

        i=0;
        j=0;
        while (i<answers.length) {
            if(i==0){
                su3[i]=su3s[0];
                i++;
                continue;
            }
            su3[i]=su3s[((i-(10*(i/10)))/2)];
            i++;
        }//su3완성

        i=0;
        int su1ct=0;
        int su2ct=0;
        int su3ct=0;
        for (int answer1 : answers) {
            if(answer1==su1[i]){
                su1ct++;
            }
            if(answer1==su2[i]){
                su2ct++;
            }
            if(answer1==su3[i]){
                su3ct++;
            }
            i++;
        }

        int firstMax = Math.max(su1ct, su2ct);
        int realMax = Math.max(firstMax, su3ct);

        if(realMax==su1ct&&realMax==su2ct&&realMax==su3ct){
            return new int[]{1,2,3};
        }else if(realMax==su1ct&&realMax==su2ct){
            return new int[]{1,2};
        } else if(realMax==su1ct&&realMax==su3ct){
            return new int[]{1,3};
        }else if(realMax==su2ct&&realMax==su3ct){
            return new int[]{2,3};
        }else if(realMax==su1ct){
            return new int[]{1};
        }else if(realMax==su2ct){
            return new int[]{2};
        }else if(realMax==su3ct){
            return new int[]{3};
        }

        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        FirstLevel13 firstLevel13 = new FirstLevel13();
        firstLevel13.solution(new int[20]);
    }
}
