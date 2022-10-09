package While.Loop.Exercises;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String books = scanner.nextLine();
        int countBooks = 0;
        boolean isFounded = false;

        while (!books.equals("No More Books")) {
            if (books.equals(text)) {
                isFounded = true;
                break;
            }
            countBooks++;
            books = scanner.nextLine();
        }
        if (isFounded) {
            System.out.printf("You checked %d books and found it.", countBooks);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countBooks);
        }
    }
}
