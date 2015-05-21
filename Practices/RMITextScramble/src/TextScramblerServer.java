import java.net.*;
import java.rmi.*;

public class TextScramblerServer {
  public static void main(String args[]) {
    try {
      TextScramblerServerImplementation textScramblerServer = new TextScramblerServerImplementation();
      Naming.rebind("TextScramblerServerInterface", textScramblerServer);
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}