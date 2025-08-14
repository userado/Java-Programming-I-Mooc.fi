
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int valueOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int valueTwo = Integer.valueOf(scanner.nextLine());
        int addRes = valueOne + valueTwo;
        int subRes = valueOne - valueTwo;
        int multipRes = valueOne * valueTwo;
        double divRes = (double) valueOne / valueTwo;
        System.out.println(valueOne + " + " + valueTwo + " = " + addRes);
        System.out.println(valueOne + " - " + valueTwo + " = " + subRes);
        System.out.println(valueOne + " * " + valueTwo + " = " + multipRes);
        System.out.println(valueOne + " / " + valueTwo + " = " + divRes);

    }
}
