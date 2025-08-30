
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.print("Search for:");
        String search = scanner.nextLine();
        if (list.contains(search)) {
            System.out.println(search + " was found on the list!");
        } else {
            System.out.println(search + " was not found on the list!");
        }
    }
}
