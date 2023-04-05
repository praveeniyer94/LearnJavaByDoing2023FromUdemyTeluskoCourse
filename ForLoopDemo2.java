public class ForLoopDemo2 {

    public static void main(String[] args) {
        int i, j;

        for (i = 1; i < 8; i++) {
            System.out.println("The day is: " + i);

            for (j = 0; j <= 24; j++) {
                System.out.println("The number of hours starts from : " + j + " in a day" + i);

            }
            System.out.println("Total hours in a day: " + j);

        }

    }

}
