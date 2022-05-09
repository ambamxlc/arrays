import java.util.ArrayList;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter as many whole, positive numbers as you'd like. When done, enter 0 as the final number in your list.");

        while (true){
            int userInput = scanner.nextInt();
                    if (userInput == 0){
                        for (int i = 0; i <list.size()-1; i++)
                                System.out.print(list.get(i) +  ", ");
                            System.out.print("and " + list.get(list.size()-1)+ " were the items in the list. ");
                            int sum = 0;
                            for(int i = 0; i <list.size(); i ++)
                            sum += list.get(i);
                            System.out.print("The sum of that list is:"+ sum);
                    }else{
                        list.add(userInput);
                    }
    }
        }
}