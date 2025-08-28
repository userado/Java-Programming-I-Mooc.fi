
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();  // Moves to next line
    }

    public static void printSpaces(int number) {
        int i=0;
        while (i<number){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);  // already includes a newline
        }
    }

    public static void christmasTree(int height) {
        // Tree top
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
        }

        // Tree base (2 rows of 3 stars)
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(4);
        christmasTree(4);
        christmasTree(10);
    }
}