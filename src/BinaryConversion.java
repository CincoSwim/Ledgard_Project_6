import java.util.Scanner;

/*
  EECS 1510 Object-Oriented Programming
  Project 6 Part 2
  Written by Christopher Pucko
  Prompts a user to enter a binary number string. If a binary string is entered, it is then converted to
  a decimal number. If it is not a binary number, the user is prompted again. If "-1" is entered, the program ends.
*/

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
    //Takes the binary string entered and converts it to decimal, returning the decimal amount.
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
