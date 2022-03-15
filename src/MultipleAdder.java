import java.util.Scanner;

public class MultipleAdder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("정수 몇개 더함? ");
        int n = input.nextInt();

        System.out.print(n+"개 정수 입력 ");
        input.nextLine();
        String inputNum = input.nextLine();
        String[] Num = inputNum.split(" ");

        int i;
        int sum =0;
        for(i=0;i<n;i++)
            sum = sum + Integer.parseInt(Num[i]);

        System.out.println("sum = " + sum);

        input.close();
    }
}
