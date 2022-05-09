import java.util.Scanner;
import java.util.ArrayList;

public class Large {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter words, then I will tell you how many words were in your list. hehe");

        while (true){
            String userInput = scanner.nextLine();
                    if (userInput.isEmpty()){
                        System.out.println("The total amount of items in the list was: " + list.size());
                    }else{
                        list.add(userInput);
                        
                    }
    }
}
}