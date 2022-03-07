package codingtest;

public class FirstLevel4 {
    public String solution(String new_id) {

        String[] del = {"~","!","@","#","$","%","^","&","*","(",")","=","+","[","{","]","}",":","?",",","<",">","/"};
        new_id = first(new_id);
        new_id = second(new_id, del);
        new_id = third(new_id);
        new_id = forth(new_id);
        new_id = fifth(new_id);
        new_id = sixth(new_id);
        new_id = seventh(new_id);
        return new_id;
    }

    private String seventh(String new_id) {
        String lastIndex;
        if(new_id.length()<=2){
            lastIndex = new_id.substring(new_id.length()-1);
            while (new_id.length()<3){
                new_id = new_id +lastIndex;
            }
        }
        return new_id;
    }

    private String sixth(String new_id) {
        if(new_id.length()>=16){
            new_id=new_id.substring(0,15);
        }
        while (new_id.endsWith(".")){
            new_id = new_id.substring(0, new_id.length()-1);
        }
        return new_id;
    }

    private String fifth(String new_id) {
        if(new_id.equals("")){
            new_id ="a";
        }

        return new_id;
    }

    private String forth(String new_id) {
        while (new_id.startsWith(".")){
            new_id = new_id.substring(1);
        }
        while (new_id.endsWith(".")){
            new_id = new_id.substring(0, new_id.length()-1);
        }
        return new_id;
    }

    private String third(String new_id) {
        while (new_id.contains("..")){
            new_id = new_id.replace("..", ".");
        }
        return new_id; //3단계
    }

    private String second(String new_id, String[] del) {
        for(int i = 0; i< new_id.length(); i++){
            for(int j = 0; j< del.length; j++){
                if(new_id.indexOf(del[j])>=0){
                    new_id = new_id.replace(del[j], "");
                }
            }
        } //2단계
        return new_id;
    }

    private String first(String new_id) {
        new_id = new_id.toLowerCase(); //1단계
        return new_id;
    }

    public static void main(String[] args) {
        FirstLevel4 firstLevel4 = new FirstLevel4();
        firstLevel4.solution("abcdefghijklmn.p");

    }
}
