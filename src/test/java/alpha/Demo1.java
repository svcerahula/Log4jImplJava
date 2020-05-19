package alpha;

import org.apache.logging.log4j.*;

public class Demo1 {
    private static  Logger log = LogManager.getLogger(Demo1.class.getName());

    public static void main(String args[]) {
        log.debug("In debug mode in Demo1");

        if(5>4) {
            log.info("in info mode in Demo1");
        }
        log.error("in error mode in Demo1");
        log.fatal("in fatal mode ");
    }
}
