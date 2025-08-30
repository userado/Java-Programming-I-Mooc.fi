import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] words = input.trim().split("\\s+");
            for (String word : words) {
                System.out.println(word);
            }
        }

        scanner.close();
    }
}
