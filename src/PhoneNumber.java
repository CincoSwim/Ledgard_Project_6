import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        boolean quitCondition;
        boolean areaCode;

        quitCondition = false;
        Scanner input = new Scanner(System.in);

        while (!quitCondition) {
             String phoneNumber = input.next();
            //https://stackoverflow.com/questions/22835472/how-can-i-check-if-a-user-entered-string-matches-a-specific-format
            Pattern format1 = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
            Matcher matcher1 = format1.matcher(phoneNumber);
            Pattern format2 = Pattern.compile("\\(\\d{3}\\)\\d{3}-\\d{4}");
            Matcher matcher2 = format2.matcher(phoneNumber);
            Pattern format3 = Pattern.compile("\\d{3}-\\d{4}");
            Matcher matcher3 = format3.matcher(phoneNumber);

            if (matcher1.matches() || matcher2.matches()) {
                System.out.println("Pattern Match");
                quitCondition = true;
                areaCode = true;

            } else if (matcher3.matches()) {
                System.out.println("Matches, but you will need to provide an area code for lookup.");
                quitCondition = true;
                areaCode = false;
            } else {
                System.out.println("Nope, doofus.");
            }


            //Get back to this after making the string parser.
        /*Map<String, String> map = new HashMap<String, String>();

        map.put("dog", "is an animal");

        System.out.println(map.get("dog"));*/
        }
    }
}
