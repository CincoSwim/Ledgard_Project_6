import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int index;
        String inputString = "73 95 61 21 90 85 14 78";
        String arrayElement;

        arrayElement = "";

        Scanner input;
        input = new Scanner(System.in);

        int[] A;
        A = new int[8];

        index = 0;
        for (int j = 0; j <= inputString.length() - 1; j++) {
            if (Character.isDigit(inputString.charAt(j))) {
                arrayElement += inputString.charAt(j);
            } else{
                A[index] = Integer.parseInt(arrayElement);
                arrayElement = "";
                index++;

            }

        }

        System.out.println(A[1]);
        System.out.println(A[2]);
        System.out.println(A[3]);
        System.out.println(A[4]);

    }
}
