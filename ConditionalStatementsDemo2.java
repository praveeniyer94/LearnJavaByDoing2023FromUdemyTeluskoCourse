import java.util.Scanner;

public class ConditionalStatementsDemo2 {

    public static void main(String[] args) {
        int year;

        System.out.println(" Enter the year   : ");
        Scanner scanner = new Scanner(System.in);

        year = scanner.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + "is a leap year!");

        } else {
            System.out.println(year + "is not a leap year! ");
        }

    }

}
