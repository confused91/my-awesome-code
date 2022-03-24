package classtraining;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
    public static void main(String[] args) {

//        Logging logging = new Logging();
       Logger logger= LogManager.getLogger(Logger.class);
       logger.info("");
    }
}
