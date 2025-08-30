import java.util.Scanner;

public class AVClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }

            String[] parts = line.split("\\s+");
            for (String word : parts) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }

        scanner.close();
    }
}
