
import java.net.*;
public class Demo {

    public static void main(String arg[]) throws Exception {

        URL url =new URL("http://www.gethub.com:80/abhi.html");
        System.out.println("protocol:"+url.getProtocol());
        System.out.println("host:"+url.getHost());
        System.out.println("file name:"+url.getFile());
        System.out.println("port number:"+url.getPort());
    }
}