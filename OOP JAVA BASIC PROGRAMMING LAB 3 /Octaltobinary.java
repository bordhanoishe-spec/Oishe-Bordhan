import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input any octal number: ");
        String octal = sc.next();

        int decimal = Integer.parseInt(octal, 8);

        System.out.println("Equivalent binary number: "
                + Integer.toBinaryString(decimal));
    }
}
