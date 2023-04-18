
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class OutputStreamBuffer{
    public static void main(String[] args){
        // Every file handling must have a try and catch to handle the file exception
        try{
            // Initializing the file handler
            FileOutputStream fileOutputStream = new FileOutputStream("second.txt");
            // As the buffer works on file, so inializing the buffer to the file
            BufferedOutputStream bufferOutputStream = new BufferedOutputStream(fileOutputStream);
            // Text to be written in file
            String text = "Hello This i a text";
            // COnverting text in the sequence of bytes and storing it in array b
            byte[] b = text.getBytes();

            // Now finally witing the converted bytes to the buffer
            bufferOutputStream.write(b);
            // Maybe this is flusing to the file
            bufferOutputStream.flush();
            // Closing all the opened Streams
            bufferOutputStream.close();
            fileOutputStream.close();

            // DClosing the file
            fileOutputStream.close();


        }
        // Every file handling must handle IOException
        catch(IOException err){
            err.printStackTrace();
        }
    }
}
