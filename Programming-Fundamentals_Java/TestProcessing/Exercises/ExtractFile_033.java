package TestProcessing.Exercises;

import java.util.Scanner;

public class ExtractFile_033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int length = input.lastIndexOf("\\");
        String result = input.substring(length + 1);
        String name = result.split("\\.")[0];
        String extension = result.split("\\.")[1];
        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);
    }
}
