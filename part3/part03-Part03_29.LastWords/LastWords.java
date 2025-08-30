import java.util.Scanner;

public class LastWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inputLine = scanner.nextLine();
            if (inputLine.isEmpty()) {
                break;
            }

            String[] words = inputLine.trim().split("\\s+");
            if (words.length > 0) {
                System.out.println(words[words.length - 1]);
            }
        }

        scanner.close();
    }
}
