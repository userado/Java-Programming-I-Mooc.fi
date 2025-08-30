import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int totalYears = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            if (parts.length == 2) {
                String name = parts[0].trim();
                try {
                    int birthYear = Integer.parseInt(parts[1].trim());
                    totalYears += birthYear;
                    count++;

                    if (name.length() > longestName.length()) {
                        longestName = name;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid birth year format: " + parts[1]);
                }
            } else {
                System.out.println("Invalid input format. Use: name,birthYear");
            }
        }

        if (count > 0) {
            double averageYear = (double) totalYears / count;
            System.out.println("Longest name: " + longestName);
            System.out.println("Average of the birth years: " + averageYear);
        }

        scanner.close();
    }
}
