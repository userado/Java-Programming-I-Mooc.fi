import java.util.Scanner;

public class FirstWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inputLine = scanner.nextLine();
            if (inputLine.isEmpty()) {
                break;
            }

            String[] words = inputLine.trim().split("\\s+");
            if (words.length > 0) {
                System.out.println(words[0]);
            }
        }

        scanner.close();
    }
}

