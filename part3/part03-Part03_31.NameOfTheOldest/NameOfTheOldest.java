import java.util.Scanner;

public class NameOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldestName = "";
        int maxAge = -1;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            if (parts.length == 2) {
                String name = parts[0].trim();
                try {
                    int age = Integer.parseInt(parts[1].trim());
                    if (age > maxAge) {
                        maxAge = age;
                        oldestName = name;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid age format: " + parts[1]);
                }
            } else {
                System.out.println("Invalid input format. Use: name,age");
            }
        }

        System.out.println("Name of the oldest: " + oldestName);
        scanner.close();
    }
}
