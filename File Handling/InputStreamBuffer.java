///-----------Correction on comment remaining
import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedInputStream;

public class InputStreamBuffer {
    public static void main(String[] args){
        try{
            FileInputStream fileInputStream = new FileInputStream("second.txt");

            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            // Initializing the reader from starting postion
            int i = 0;

            // The EOF index is -1. So, reading each byte till the EOF. 
            while((i=bufferedInputStream.read()) != -1){
                // Since the read data is in byte, converting it to characters and printing it
                System.out.println((char)i);
            }
            // Closing the file Stream
            bufferedInputStream.close();
            fileInputStream.close();
        }
        // Every file handling must handle IOException
        catch(IOException err){
            err.printStackTrace();
        }
    }
}
