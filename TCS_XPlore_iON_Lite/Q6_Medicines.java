package TCS_XPlore_iON_Lite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q6_Medicines {
    public static void main(String[] args) {
        Medicine[] medicine = new Medicine[4];
        String search;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < medicine.length; i++) {
            String medicineName = sc.nextLine();
            String batchNo = sc.nextLine();
            String disease = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            medicine[i] = new Medicine(medicineName, batchNo, disease, price);
        }

        search = sc.nextLine();
        Integer[] price = medicinePriceForGivenDisease(medicine, search);

        for (int i = 0; i < price.length; i++) {
            System.out.println(price[i]);
        }
    }

    public static Integer[] medicinePriceForGivenDisease(Medicine[] medicine, String disease) {
        //method logic
        //code to find price, sort and return the sorted array.
        List<Integer> list = new ArrayList<>();
        for (Medicine m : medicine) {
            if (disease.equalsIgnoreCase(m.disease))
                list.add(m.price);
        }
        Collections.sort(list);
        Integer[] prices = new Integer[list.size()];
        for (int i = 0; i < list.size(); i++)
            prices[i] = list.get(i);

        return prices;
    }
}


class Medicine {
    //code to build Medicine class
    String medicineName;
    String batchNo;
    String disease;
    int price;

    public Medicine(String medicineName, String batchNo, String disease, int price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.disease = disease;
        this.price = price;
    }

}
