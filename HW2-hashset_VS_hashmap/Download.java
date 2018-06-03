import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.net.*;
import java.io.*;

public class Download{
    public static void main(String[] args){
        try{
            URL website = new URL("http://venus.cs.qc.cuny.edu/~mfried/cs313/hw/english_words.txt");
            URL website2 = new URL("http://venus.cs.qc.cuny.edu/~mfried/cs313/hw/french_words.txt");
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream("english_words.txt");
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        }catch(MalformedURLException exURL){
            System.out.println("issue with website call");
        }
        catch(IOException exStream){
            System.out.println("issue with Stream call");
        }
        
        try{
            URL website = new URL("http://venus.cs.qc.cuny.edu/~mfried/cs313/hw/french_words.txt");
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream("french_words.txt");
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        }catch(MalformedURLException exURL){
            System.out.println("issue with website call");
        }
        catch(IOException exStream){
            System.out.println("issue with Stream call");
        }
    }
}