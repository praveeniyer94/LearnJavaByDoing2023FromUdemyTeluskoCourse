import java.util.Scanner;

public class SwitchCaseDemo {

    public static void main(String[] args) {

        System.out.println("Welcome user, Enter the valid choice from 1 to 7");

        Scanner s = new Scanner(System.in);

        int choice = s.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tueday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please choose a valid choice!");
                break;

        }

    }

}
