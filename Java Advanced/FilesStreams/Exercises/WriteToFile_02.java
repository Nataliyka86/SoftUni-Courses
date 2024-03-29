package Advanced.FilesAndStreams;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WriteToFile_02 {
    public static void main(String[] args) throws IOException {

        String basePath = "C:\\Users\\Nataliya.Yordanova.ELANDO\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\output.txt";

        List<Character> punctuation = new ArrayList<>();
        Collections.addAll(punctuation, ',', '.', '!', '?');

        OutputStream outputStream = new FileOutputStream(outputPath);

        try (InputStream inputStream = new FileInputStream(inputPath)) {
            int readByte = inputStream.read();
            while (readByte >= 0) {
                if (!punctuation.contains((char) readByte)) {
                    outputStream.write(readByte);
                }

                readByte = inputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        outputStream.close();
    }
}
