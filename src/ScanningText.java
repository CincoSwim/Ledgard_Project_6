import java.util.Scanner;

public class ScanningText {
    public static void main(String[] args) {
        String textLine;
        int charValue;
        int tokenCount;
        int charCount;
        int numberCount;
        int convertedValue;

        tokenCount = 0;
        numberCount= 0;

        char[] A;
        A = new char[26];

        Scanner input;
        input = new Scanner(System.in);

        System.out.println("Enter a single line of text:");
        textLine = input.nextLine();

        textLine = textLine.toLowerCase();
        charCount = textLine.length();

        for (int i = 0; i < textLine.length(); i++) {
            //System.out.println(Character.getNumericValue(textLine.charAt(i)) + " " + textLine.charAt(i));
            charValue = Character.getNumericValue(textLine.charAt(i));
            if ((charValue < 10) && (charValue != -1)){
                numberCount++;
            }else if (charValue != -1)
                A[(charValue - 10)]++;
            else {
                tokenCount++;
                charCount--;
            }
        }
        System.out.println("The line contains " + charCount + " letters.");
        System.out.println("The line contains " + tokenCount + " string tokens.");
        System.out.println("The line contains " + numberCount + " numbers.");
        System.out.println("The frequency of letters is ");

        for (int k = 0 ; k <= 25; k++){
            if (A[k] > 0){
                convertedValue = k + 65;
                System.out.println((char)convertedValue + " -- " + (int) A[k]);
            }
        }
    }
}
