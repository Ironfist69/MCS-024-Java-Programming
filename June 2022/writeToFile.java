import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class writeToFile {
    public static void main (String [] args) {
        String content="Lorem Ipsum";
        try {
            File file = new File("ignou.txt");
            FileWriter fileWriter=new FileWriter(file,false);
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("Successfully done!!");
        }
        catch (IOException e) {
            System.out.println("An error occured while writing to file"+e.getMessage());
            e.printStackTrace();
        }
    }
}