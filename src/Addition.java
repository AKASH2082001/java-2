import java.util.Scanner;
public class Addition {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Integer a,b,c;
            System.out.println("enter the value of a");
            a = input.nextInt();
            System.out.println("enter the value of b");
            b = input.nextInt();
            c = a+b;
            System.out.println(c);
        }
}
