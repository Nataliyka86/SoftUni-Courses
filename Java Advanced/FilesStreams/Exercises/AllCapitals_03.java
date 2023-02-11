package FilesStreams.Exercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AllCapitals_03 {
    public static void main(String[] args) throws IOException {

        String pathToFile = "C:\\Users\\choch0\\Desktop\\SoftUni\\Java Advanced\\Tasks\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        List<String> allLines = Files.readAllLines(Path.of(pathToFile));
        for (String line :allLines){
            writer.write(line.toUpperCase());
            writer.newLine();
        }
        writer.close();

    }
}
