import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Shopping {

    public static Scanner scanInt = new Scanner(System.in);
    public static Scanner scanStr = new Scanner(System.in);

    public static void main(String[] args) {

        Map<Integer, String> order = new HashMap<>();
        order.put(1, "How many kilos of bananas do you want to buy?");
        order.put(2, "How many kilos of oranges do you want to buy?");
        order.put(3, "How many kilos of strawberries do you want to buy?");
        order.put(4, "How many kilos of apricots do you want to buy?");
        order.put(5, "How many kilos of watermelon do you want to buy?");

        String[] products = {"banana", "orange", "strawberry", "apricot", "watermelon"};
        Double[] price = {12.5, 3.45, 7.99, 6.34, 2.25};
        int[] stock = {3, 6, 14, 5, 7};
        double totalCost = 0;
        String continuation = "yes";

        while (continuation.equalsIgnoreCase("yes")) {
            System.out.println("\t1- Banana\n\t2- Orange\n\t3- Strawberry\n\t4- Apricot\n\t5- Watermelon\nWhat do you want to buy? : ");
            int selection1 = scanInt.nextInt();
            System.out.println(order.get(selection1));
            int selection2 = scanInt.nextInt();

            if (selection2 > stock[selection1 - 1])
                System.out.println("Not enough stock available!");
              else
                totalCost += selection2 * price[selection1 - 1];

            System.out.println("Do you want to continue to shopping?\nYES or NO : ");
            continuation = scanStr.nextLine();
            if (continuation.equalsIgnoreCase("no"))
                continuation = "no";
        }
        System.out.println("\tYour total payment amount is  = " + totalCost + "\u001B[32m"+"\n\t > HAVE A NİCE SHOPPİNG <");
    }
}
