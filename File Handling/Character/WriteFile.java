import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args){
        try{
            FileWriter fileWriter = new FileWriter("file.txt");
            fileWriter.write("This is the way.");
            fileWriter.close();
            System.out.println("Done");
        }
        catch(IOException err){
            err.printStackTrace();
        }
    }
}
