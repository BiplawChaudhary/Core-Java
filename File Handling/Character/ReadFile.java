import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args){
        try{
            FileReader fileReader = new FileReader("file.txt");
            
            int i = 0;

            while((i=fileReader.read())!= -1){
                System.out.printf("%c", (char) i);
            }
            fileReader.close();
            System.out.println("Done");
        }
        catch(IOException err){
            err.printStackTrace();
        }
    }
}
