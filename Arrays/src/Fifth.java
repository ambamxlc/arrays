import java.util.ArrayList;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        ArrayList<String> inputStrings = new ArrayList<String>();

        System.out.println("Enter at least 5 words. The last item you want to enter should be no word (just hit 'enter' on keyboard)");

        while (true) {
            String input = in.nextLine();

            if (input == "") {
                break;
            } else {
                inputStrings.add(input);
            }
        }

        System.out.println("The fifth item in the list of words you entered was: " + inputStrings.get(4));

        in.close();
    }
}