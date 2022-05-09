import java.util.ArrayList;
import java.util.Scanner;

public class Last {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> inputStrings = new ArrayList<String>();

        System.out.println("Enter more words. The last item you want to enter should be no word (just hit 'enter' on keyboard)");

        while (true) {
            String input = in.nextLine();

            if (input == "") {
                break;
            } else {
                inputStrings.add(input);
            }
        }

        String last = inputStrings.get(inputStrings.size() - 1);
        System.out.println("The last item in the list is: " + last);

        in.close();
    }
}