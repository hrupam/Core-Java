package TCS_XPlore_iON_Lite;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Q10_Inventory {
    public static void main(String[] args) {
//code to read values
        try (Scanner sc = new Scanner(System.in)) {
            int count = 4;
            Inventory[] inventories = new Inventory[count];
            for (int i = 0; i < count; i++) {
                String id = sc.next();
                int maxQty = sc.nextInt();
                int currQty = sc.nextInt();
                int threshold = sc.nextInt();
                inventories[i] = new Inventory(id, maxQty, currQty, threshold);
            }
            int limit = sc.nextInt();
//code to call required method
            Inventory[] arr = replenish(limit, inventories);
//code to display the results
            for (var x : arr) {
                System.out.print(x.inventoryId + " ");
                if (x.threshold >= 75) System.out.println("Critical Filling");
                else if (x.threshold >= 74 && x.threshold <= 50) System.out.println("Moderate Filling");
                else System.out.println("Non-Critical Filling");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Inventory[] replenish(int limit, Inventory[] inventory) {
//method logic
        List<Inventory> list = new LinkedList<>();
        for (var iv : inventory) {
            if (iv.threshold <= limit)
                list.add(iv);
        }
        return list.toArray(new Inventory[list.size()]);
    }
}

class Inventory {
    //code to build Inventory class
    String inventoryId;
    int maximumQuantity;
    int currentQuantity;
    int threshold;

    public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }
}
