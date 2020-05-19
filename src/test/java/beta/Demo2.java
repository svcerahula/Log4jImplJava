package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo2 {
    private static  Logger log = LogManager.getLogger(Demo2.class.getName());

    public static void main(String args[]) {
        log.debug("In debug mode Demo2");

        if(5>4) {
            log.info("in info mode Demo2");
        }
        log.error("in error mode Demo2");
        log.fatal("in fatal mode Demo2");
    }
}
