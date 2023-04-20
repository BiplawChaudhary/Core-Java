import java.io.IOException;

import java.io.FileOutputStream;

public class OutputStreamFile{
    public static void main(String[] args){
        // Every file handling must have a try and catch to handle the file exception
        try{
            // Initializing the file handler
            FileOutputStream fileOutputStream = new FileOutputStream("first.txt");
            // Text to be written in file
            String text = "Hello This i a text";
            // COnverting text in the sequence of bytes and storing it in array b
            byte[] b = text.getBytes();

            // Now finally witing the converted bytes to the file
            fileOutputStream.write(b);
            // DClosing the file
            fileOutputStream.close();


        }
        // Every file handling must handle IOException
        catch(IOException err){
            err.printStackTrace();
        }
    }
}
