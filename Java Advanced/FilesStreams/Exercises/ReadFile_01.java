package Advanced.FilesAndStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile_01 {
    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\Nataliya.Yordanova.ELANDO\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try (InputStream inputStream = new FileInputStream(filePath)){
            int readByte = inputStream.read();
            while (readByte>= 0){
                System.out.print(Integer.toBinaryString(readByte) + " ");
                readByte = inputStream.read();
            }

        }   catch (IOException e) {
            throw  new RuntimeException(e);
        }

    }
}
