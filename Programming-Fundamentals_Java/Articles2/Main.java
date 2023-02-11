package Articles2;

import Article.Article;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String title = input.split(", ")[0];
        String content = input.split(", ")[1];
        String author = input.split(", ")[2];
        int n = Integer.parseInt(scanner.nextLine());
        Articles2 articles2 = new Articles2(title, content, author);

        for (int i = 1; i <=n ; i++) {
            String command = scanner.nextLine();
            String[] commandArr = command.split(": ");
            switch (commandArr[0]){
                case "Edit":
                    String newContent = commandArr[1];
                    articles2.edit(newContent);
                    break;
                case "ChangeAuthor":
                    String newAuthor = commandArr[1];
                    articles2.changeAuthor(newAuthor);
                    break;
                case "Rename":
                    String newTitle = commandArr[1];
                    articles2.rename(newTitle);
                    break;
            }
        }
        System.out.println(articles2.toString());
    }
}
