package TCS_XPlore_iON_Lite;

import java.util.*;


public class Q12_Bill {
    public static void main(String[] args) {
//code to read values
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Bill[] bills = new Bill[count];
        for (int i = 0; i < bills.length; i++) {
            int billNo = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine().trim();
            String connectionType = sc.nextLine().trim();
            double billAmt = sc.nextDouble();
            boolean status = sc.nextBoolean();
            bills[i] = new Bill(billNo, name, connectionType, billAmt, status);
        }
        boolean targetStatus = sc.nextBoolean();
        sc.nextLine();
        String targetConnectionType = sc.nextLine().trim();

//code to call required method
        Bill[] BillWithMaxBillAmountBasedOnStatus = findBillWithMaxBillAmountBasedOnStatus(bills, targetStatus);

        int countWithTypeOfConnection = getCountWithTypeOfConnection(bills, targetConnectionType);

//code to display the result

        //DISPLAY BillWithMaxBillAmountBasedOnStatus

        if (BillWithMaxBillAmountBasedOnStatus != null) {
            for (Bill b : BillWithMaxBillAmountBasedOnStatus)
                System.out.println(b.billNo + "#" + b.name);

        } else
            System.out.println("There are no bill with the given status");

        //DISPLAY CountWithTypeOfConnection
        if (countWithTypeOfConnection > 0) System.out.println(countWithTypeOfConnection);
        else System.out.println("There are no bills with given type of connection");


    }

    
    public static Bill[] findBillWithMaxBillAmountBasedOnStatus(Bill[] bills, boolean status) {
//method logic
        List<Bill> list = Arrays.asList(bills);

        Comparator<Bill> billAmountComparator = (a, b) -> {
            if (a.billAmount < b.billAmount) return -1;
            else if (a.billAmount > b.billAmount) return 1;
            return 0;
        };

        List<Bill> filteredBillsBasedOnStatus = new LinkedList<>();
        for (Bill b : list) {
            if (b.status == status)
                filteredBillsBasedOnStatus.add(b);
        }

        if (filteredBillsBasedOnStatus.isEmpty()) return null;

        double maxBillAmount = Collections.max(filteredBillsBasedOnStatus, billAmountComparator).billAmount;

        List<Bill> filteredBills = new LinkedList<>();
        for (Bill b : filteredBillsBasedOnStatus) {
            if (b.billAmount == maxBillAmount)
                filteredBills.add(b);
        }
        if (filteredBills.isEmpty()) return null;

        Collections.sort(filteredBills, Comparator.comparingInt(a -> a.billNo));
        return filteredBills.toArray(new Bill[filteredBills.size()]);

    }


    public static int getCountWithTypeOfConnection(Bill[] bills, String connectionType) {
//method logic
        int count = 0;
        for (Bill b : bills) {
            if (b.typeOfConnection.equalsIgnoreCase(connectionType))
                count++;
        }
        return count;
    }
}

class Bill {
    //code to build the class
    int billNo;
    String name;
    String typeOfConnection;
    double billAmount;
    boolean status;

    public Bill(int billNo, String name, String typeOfConnection, double billAmount, boolean status) {
        this.billNo = billNo;
        this.name = name;
        this.typeOfConnection = typeOfConnection;
        this.billAmount = billAmount;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billNo=" + billNo +
                ", name='" + name + '\'' +
                ", typeOfConnection='" + typeOfConnection + '\'' +
                ", billAmount=" + billAmount +
                ", status=" + status +
                '}';
    }
}

