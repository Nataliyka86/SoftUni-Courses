package FilesStreams.Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumBytes_02 {
    public static void main(String[] args) throws IOException {

        String pathToFile = "C:\\Users\\choch0\\Desktop\\SoftUni\\Java Advanced\\Tasks\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> allLines = Files.readAllLines(Path.of(pathToFile));

        long sum = 0;

        for (String line : allLines){
            for (char symbol : line.toCharArray()){
                sum+= (int) symbol;
            }
        }
            System.out.println(sum);
//
//        byte[] allBytes = Files.readAllBytes(Path.of(pathToFile));
//        for (byte ascii : allBytes){
//            if (ascii != 10 && ascii != 13){
//            sum+=ascii;
//            }
//        }
//        System.out.println(sum);
    }
}
