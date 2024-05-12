import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyingTextContentToAnotherFile {
    public static void main (String[] args) throws IOException {
        FileReader in=new FileReader("read.txt");
        FileWriter out=new FileWriter("write.txt");
        int c;
        while((c=in.read())!=-1) {
            out.write(c);
        }
        in.close();
        out.close();
        System.out.println("Successfully copied!!!");
    }
}