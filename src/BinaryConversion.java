import java.util.Scanner;

public class BinaryConversion {
    public static void main(String[] args) {
        String binaryString;
        int decimalNumber;

        binaryString = "0";
        Scanner input = new Scanner(System.in);

        while (!(binaryString.equals("-1"))) {
            System.out.print("Enter a binary number: ");
            binaryString = input.next();

            if (binaryString.equals("-1")) {
                System.out.println("All Set!");
                System.exit(0);
            } else if (binaryString.matches("[01]+")) {
                decimalNumber = binaryToDecimal(binaryString);
                System.out.println("Conversion to decimal:  " + decimalNumber);
            } else
                System.out.println("You have not entered a binary number.");
        }

    }

    public static int binaryToDecimal(String binaryString) {
        int decimalNumber;
        int exponent;
        double numberAdded;
        int base;

        base = 2;
        decimalNumber = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                exponent = binaryString.length() - 1 - i;
                numberAdded = Math.pow((double) base, (double) exponent);
                decimalNumber += numberAdded;

            }
        }

        return decimalNumber;
    }
}
