package FilesStreams.Exercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo {
    public static void main(String[] args) throws IOException {

        //writers - пишем във файловете
        String pathToFile = "C:\\Users\\choch0\\Desktop\\SoftUni\\Java Advanced\\Tasks\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\demo.txt";
        File file = new File(pathToFile);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("This is a demo");
        fileWriter.close();

    }
}
