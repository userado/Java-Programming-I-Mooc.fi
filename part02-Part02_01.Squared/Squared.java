
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int valueInt = Integer.valueOf(scanner.nextLine());
        int result = valueInt * valueInt;
        System.out.println(result);
    }
}
