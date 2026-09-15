import java.util.Scanner;

public class HexadecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a hexadecimal number: ");
        String hex = sc.next();

        int decimal = Integer.parseInt(hex, 16);

        System.out.println("Equivalent octal number: "
                + Integer.toOctalString(decimal));
    }
}
