import java.io.File;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
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

        IntStream intStream2 = IntStream.range(1, 5); //1,2,3,4
        IntStream intStream3 = IntStream.rangeClosed(1, 10);//1~10
        //intStream3.skip(3).limit(5).forEach(System.out::println);
        //intStream3.filter(i->i%2==0).forEach(System.out::println); //짝수만 호출
        //intStream3.filter(i->i%2==0).filter(i->i%4==0).forEach(System.out::println); //짝수중 4의 배수만 호출

        Stream<Integer> evenStream = Stream.iterate(0, n -> n + 2); // 0,2,4,6...
        Stream<Double> randomStream = Stream.generate(Math::random); // 랜덤값
        Stream<Integer> oneStream = Stream.generate(() -> 1); // 1

        Stream emtyStream = Stream.empty();

        Stream<File> fileStream = Stream.of(new File("Ex1.java"), new File("Ex1"),
                new File("Ex1.bak")); //File타입 스트림생성
        Stream<String> filenameStream = fileStream.map(File::getName); //File타입을 String타입으로 변환
        filenameStream.forEach(System.out::println);//출력

        String str = "abc";
        Optional<String> optVal1 = Optional.of(str); // 감싸기
        Optional<String> optVal2 = Optional.of("abc"); // 감싸기
        Optional<String> optVal3 = Optional.of(new String("abc")); // 감싸기

        String str1 = optVal1.get(); //null이면 에러 발생
        String str2 = optVal1.orElse(""); //null이면 ""반환

        Optional<String> optVal4 = Optional.of(null); // nullPointException 발생
        Optional<String> optVal5 = Optional.ofNullable(null);



        Stream<String> strStream7 = Stream.of(new String[]{"a", "b", "c"});
        Stream<String> strStream8 = Stream.of(new String[]{"d", "e", "f"});
        Stream<String> strStream7Plus8 = Stream.concat(strStream7, strStream8); //두 스트림 연결


        List<Integer> list2 = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);
        Stream<Integer> intStream10 = list.stream();
        //intStream10.distinct().forEach(System.out::println); //1,2,3,4,5

        Stream<String> strStream10= Stream.of(new String[]{"d","B","a", "e","C", "f"});
        strStream10.sorted(); // 기본정렬 대문자 A~Z > 소문자 a~z
        strStream10.sorted(Comparator.reverseOrder()); // 소문자 z~a, 대문자Z~A
        strStream10.sorted(String.CASE_INSENSITIVE_ORDER); // 대소문자 관계없이 a~z
        strStream10.sorted(String.CASE_INSENSITIVE_ORDER.reversed());// 대소문자 관계없이 z~a

        Stream<String[]> strArrStrm = Stream.of(new String[]{"abc","def"},new String[]{"ghj","qwe"});
        strArrStrm.flatMap(Arrays::stream); //문자열하나하나 쪼개진 스트림
    }

}
