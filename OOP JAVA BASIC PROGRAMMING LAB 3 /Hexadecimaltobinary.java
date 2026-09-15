import java.util.Scanner;

public class HexadecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a hexadecimal number: ");
        String hex = sc.next();

        int decimal = Integer.parseInt(hex, 16);

        System.out.println("Equivalent binary number: "
                + Integer.toBinaryString(decimal));
    }
}
