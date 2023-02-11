package Advanced.FilesAndStreams;

import java.io.*;

public class CopyBytes_03 {
    public static void main(String[] args) {

        String basePath = "C:\\Users\\Nataliya.Yordanova.ELANDO\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\03_output.txt";

        try (InputStream inputStream = new FileInputStream(inputPath);
             OutputStream outputStream = new FileOutputStream(outputPath)) {
            int readByte = inputStream.read();

            while (readByte >= 0) {
                if (readByte == 10 || readByte == 32) {
                    outputStream.write(readByte);
                } else {
                    String number = String.valueOf(readByte);
                    for (int i = 0; i < number.length(); i++) {

                        outputStream.write(number.charAt(i));
                    }
                }
                readByte = inputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
