import java.util.Scanner;
public class Oddno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number between ranges upto: ");
        Integer num=input.nextInt();
        System.out.println("enter the lower value: ");
        Integer lower = input.nextInt();
        for (int i = lower;i<=num;i++) {
            if (i % 2 != 0) {
                System.out.println(i + "");
            }
        }

    }
}
