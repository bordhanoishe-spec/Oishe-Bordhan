import java.util.Scanner;

public class BinaryMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first binary number: ");
        String a = sc.next();

        System.out.print("Input the second binary number: ");
        String b = sc.next();

        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);

        int product = num1 * num2;

        System.out.println("Product of two binary numbers: "
                + Integer.toBinaryString(product));
    }
}
