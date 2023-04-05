import java.util.Scanner;

public class SwitchCaseDemo2 {

    public static void main(String[] args) {

        System.out.println("Please enter valid choice from 1 to 12");

        Scanner s = new Scanner(System.in);

        int month = s.nextInt();

        switch (month) {

            case 1:
                System.out.println("Januray");
                break;

            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");

                break;
            case 5:
                System.out.println("May");

                break;
            case 6:
                System.out.println("June");

                break;
            case 7:
                System.out.println("July");

                break;
            case 8:
                System.out.println("Aug");

                break;
            case 9:
                System.out.println("Sep");

                break;
            case 10:
                System.out.println("Oct");

                break;
            case 11:
                System.out.println("Nov");

                break;
            case 12:
                System.out.println("Dec");
                break;

            default:
                System.out.println("Invalid choice, Month out of Calendar!");
                break;

        }

    }

}
