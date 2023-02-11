package FilesStreams.Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class SumLines_01 {
    public static void main(String[] args) throws IOException {

        String pathToFile = "C:\\Users\\choch0\\Desktop\\SoftUni\\Java Advanced\\Tasks\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> allLines = Files.readAllLines(Path.of(pathToFile));

        for (String line : allLines){
            int sum = 0;
            for (char symbol : line.toCharArray()){
                sum+= (int) symbol;
            }
            System.out.println(sum);
        }

//        allLines.stream().map( line -> line.toCharArray()).forEach( arr -> {
//            int sum = 0;
//            for (char symbol : line.toCharArray()){
//                sum+= (int) symbol;
//            }
//            System.out.println(sum);
//        });
    }
}
