import java.util.Scanner;

public class AverageThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double average = (a + b + c) / 3;

        System.out.println("Average = " + average);
    }
}
