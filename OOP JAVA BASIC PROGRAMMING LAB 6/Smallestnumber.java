
import java.util.Scanner;

public class SmallestNumber {

    static double findSmallest(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double a = sc.nextDouble();

        System.out.print("Input the Second number: ");
        double b = sc.nextDouble();

        System.out.print("Input the third number: ");
        double c = sc.nextDouble();

        System.out.println("The smallest value is "
                + findSmallest(a, b, c));
    }
}
