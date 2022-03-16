import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer a;
        System.out.println("enter the number");
        a = input.nextInt();
        if (a%2 == 0){
            System.out.println("the given number is even");
        }
        else {
            System.out.println("the given number is odd");
        }
    }
}
