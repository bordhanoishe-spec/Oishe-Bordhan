import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int a = input.nextInt();

        System.out.print("Input second number: ");
        int b = input.nextInt();

        int product = a * b;

        System.out.println(a + " x " + b + " = " + product);

        input.close();
    }
}
