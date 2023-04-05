public class NestedWhileLoopDemo {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {

            System.out.println("Hello!! Welcome to NestedWhileLoopConcept!!!" + "Value of i is: " + i);

            int j = 1;
            while (j <= 5) {
                System.out.println("Inner While Loop " + "Hi Alliens Focus On The Lessons!!" + "Value of j is: " + j);
                j++;
                System.out.println("Value of j after incrementing everytime: " + j);
            }
            i++;

            System.out.println("Value of i after incrementing everytime: " + i);
        }
    }

}
