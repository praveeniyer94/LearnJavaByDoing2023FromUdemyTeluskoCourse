public class ForLoopDemo3 {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            System.out.println("Day is : " + i);

            for (int j = 1; j <= 9; j++) {
                if (j == 1)
                    System.out.println("Starting to office!");
                System.out.println("Hours is: " + (j + 8) + "--------to--------" + (j + 9));
                if (j == 9)
                    System.out.println("Leaving from office!");
            }
        }

    }

}
