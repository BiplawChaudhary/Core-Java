
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class BufferWriter {
    public static void main(String[] args){
        try{
            FileWriter fileWriter = new FileWriter("file1.txt");
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
            bufferWriter.write("This is the wayhhdfdjkahfdj.");
            bufferWriter.close();
            fileWriter.close();
            System.out.println("Done");
        }
        catch(IOException err){
            err.printStackTrace();
        }
    }
}

