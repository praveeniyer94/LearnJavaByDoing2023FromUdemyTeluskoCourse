import java.util.Scanner;

class Calculator {

    public int add(int n1, int n2) {

        System.out.println("Inside calculator class and in add method!");
        int sum = n1 + n2;

        return sum;
    }

    public int sub(int n1, int n2) {
        System.out.println("Inside the calculator calss and inside the sub methods!");

        int diff = n1 - n2;
        return diff;
    }

    public int mul(int n1, int n2) {

        System.out.println("Inside calculator class and in multiplication method!");
        int product = n1 * n2;

        return product;
    }

    public int div(int n1, int n2) {

        System.out.println("Inside calculator class and in divison method!");
        int quo = n1 / n2;

        return quo;
    }

    public int mod(int n1, int n2) {

        System.out.println("Inside calculator class and in modulus  method!");
        int rem = n1 % n2;

        return rem;
    }

}

public class Demo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");

        int num1 = scan.nextInt();

        System.out.println("Enter the second number: ");

        int num2 = scan.nextInt();

        Calculator cal = new Calculator();

        // int result = num1 + num2;
        // System.out.println(result);
        int res_sum = cal.add(num1, num2);
        int res_diff = cal.sub(num1, num2);
        int res_mul = cal.mul(num1, num2);
        int res_div = cal.div(num1, num2);
        int res_mod = cal.mod(num1, num2);

        System.out.println("The sum of the numbers are : " + res_sum);
        System.out.println("The difference of the numbers are : " + res_diff);
        System.out.println("The product of the numbers are : " + res_mul);

        System.out.println("The quotient of the numbers divided are : " + res_div);

        System.out.println("The remainder obtained from modulus operation are : " + res_mod);

    }

}
