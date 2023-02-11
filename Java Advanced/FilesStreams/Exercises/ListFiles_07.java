package Advanced.FilesAndStreams;

import java.io.File;

public class ListFiles_07 {
    public static void main(String[] args) {

        String folderPath = "C:\\Users\\Nataliya.Yordanova.ELANDO\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File file = new File(folderPath);

        File[] nestedFiles = file.listFiles();

        for (File nestedFile : nestedFiles){
            if (nestedFile.isFile()){
                System.out.printf("%s: [%d]%n", nestedFile.getName(), nestedFile.length());
            }
        }
    }
}
