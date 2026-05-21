import java.util.ArrayList;
import java.util.Scanner;

public class MarketSimulation {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 1. STUDENT TASK: Create the ArrayList and add MarketItems
        ArrayList<MarketItem> market = new ArrayList<>();
        market.add(new MarketItem("Bitcoin", 42000, 0.12));
        market.add(new MarketItem("Telsa", 190, 0.07));
        market.add(new MarketItem("Gold", 2100, 0.02));
        market.add(new MarketItem("Apple", 170, 0.04));
        
        System.out.print("How many days should the simulation run? ");
        int days = input.nextInt();
        
        
        System.out.println("\n--------------------------------------------");
        System.out.printf("%-12s %-12s %-12s\n", "ASSET", "DAY", "PRICE");
        System.out.println("--------------------------------------------");


        // 2. THE MAIN LOOP
        for (int i = 1; i <= days; i++) {
            for (MarketItem item : market) {
                item.updatePrice();
            System.out.printf("%-12s %-12d $%.2f\n", item.getName(), i, item.getPrice());
        }
        System.out.println();
     }
        
    input.close();
    }
        
}
