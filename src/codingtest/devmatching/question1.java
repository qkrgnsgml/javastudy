package codingtest.devmatching;

public class question1 {
    public int solution(int[] grade) {
        int answer = 0;

        int[] newGrade = new int[grade.length];
        for(int i=0;i<grade.length;i++){
            newGrade[i] = grade[i];
        }

        for(int i=0;i<grade.length-1;i++){
            if(grade[i]>grade[i+1]){
                newGrade[i] = grade[i+1];
                for(int j=0;j<i;j++){
                    if(newGrade[j]>grade[i+1]){
                        newGrade[j]=grade[i+1];
                    }
                }
            }
        }

        for(int i=0;i<grade.length;i++){
            answer+=grade[i]-newGrade[i];
        }
        return answer;
    }
}
