import java.io.File;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5); //리스트생성
        Stream<Integer> intStream = list.stream(); //스트림생성
        //intStream.forEach(System.out::println); //최종연산

        String[] arr = new String[]{"a", "b", "c"};//배열생성
        Stream<String> strStream = Stream.of(arr); //스트림생성

        //위 두줄을 아래와 같이 만들 수 있다.
        Stream<String> strStream2 = Stream.of("a", "b", "c");//가변인자
        Stream<String> strStream3 = Stream.of(new String[]{"a", "b", "c"});
        Stream<String> strStream4 = Arrays.stream(new String[]{"a", "b", "c"});

        //strStream.forEach(System.out::println); //최종연산

        IntStream intStream2 = IntStream.rangeClosed(1,10); //1,2,3,4
        IntStream intStream3 = IntStream.rangeClosed(1,10);//1~10
        //intStream3.filter(i->i%2==0).forEach(System.out::println); //짝수만 호출
        //intStream3.filter(i->i%2==0).filter(i->i%4==0).forEach(System.out::println); //짝수중 4의 배수만 호출

        Stream<File> fileStream = Stream.of(new File("Ex1.java"),new File("Ex1"),
                new File("Ex1.bak")); //File타입 스트림생성
        Stream<String> filenameStream = fileStream.map(File::getName); //File타입을 String타입으로 변환
        filenameStream.forEach(System.out::println);//출력

        String str = "abc";
        Optional<String> optVal1 = Optional.of(str); // 감싸기
        Optional<String> optVal2 = Optional.of("abc"); // 감싸기
        Optional<String> optVal3 = Optional.of(new String("abc")); // 감싸기

        String str1 = optVal1.get(); // 값 가져오기
    }

}
