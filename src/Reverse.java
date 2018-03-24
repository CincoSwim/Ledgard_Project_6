import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int index;
        String inputString;
        String arrayElement;

        arrayElement = "";
        index = 0;

        Scanner input;
        input = new Scanner(System.in);

        int[] A;
        A = new int[8];

        System.out.print("Please enter 8 positive integers: ");
        inputString = input.nextLine();

        //Parses numbers in inputString, then makes them elements in the array.
        for (int j = 0; j <= inputString.length() - 1; j++) {
            if (Character.isDigit(inputString.charAt(j))) {
                arrayElement += inputString.charAt(j);
            } else {
                A[index] = Integer.parseInt(arrayElement);
                arrayElement = "";
                index++;

            }

        }
        A[index] = Integer.parseInt(arrayElement);

        reverse(A);

    }

    public static void reverse(int[] A) {
        int sum;
        sum = 0;

        System.out.println("The values in reverse order are");
        for (int i = 7; i >= 0; i--) {
            System.out.print("     " + A[i]);
            sum += A[i];
        }
        System.out.println();
        System.out.println("The average is " + sum + "/8 = " + (float) sum / 8);
    }
}
