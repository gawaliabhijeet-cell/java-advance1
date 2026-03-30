// URL connection less code
import java.net.*;
import java.io.*;

public class Demo1 {
    public static void main(String arg[]) throws Exception {
        URL url = new URL("https://www.google.com");
        URLConnection cn = url.openConnection();

        InputStream in = cn.getInputStream();
        int i;

        while ((i = in.read()) != -1) {
            System.out.print((char) i);
        }
    }
}