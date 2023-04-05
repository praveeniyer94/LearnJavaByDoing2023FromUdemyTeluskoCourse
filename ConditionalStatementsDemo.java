import javax.lang.model.util.ElementScanner14;

public class ConditionalStatementsDemo {

    public static void main(String[] args) {

        int x = 2200;
        int y = 280;
        int z = 1000;

        if (x > y && x > z)
            System.out.println("Hello X is greaterr than Y");

        else if (y > z)
            System.out.println("Y is greater than X");

        else {
            System.out.println("Z is greater than both X and Y");
        }

    }

}
