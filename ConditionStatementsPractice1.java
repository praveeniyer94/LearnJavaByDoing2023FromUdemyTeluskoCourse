import java.util.Scanner;

public class ConditionStatementsPractice1 {

    public static void main(String[] args) {

        int qty;
        int priceperqty = 100;
        double discount = 0.1;

        System.out.println("Enter the qty you had purchased from the shop!");

        Scanner s = new Scanner(System.in);

        qty = s.nextInt();

        double totalamtafterdiscount = (qty * priceperqty - discount * (qty * priceperqty));
        double totalamtwithoutdiscount = (qty * priceperqty);

        if ((qty * priceperqty) > 1000) {
            System.out.println("Total amount to be paid by the user after discount: " + totalamtafterdiscount);
        } else {
            System.out.println("Total amount to be paid by the user: " + totalamtwithoutdiscount);
        }

    }
}
