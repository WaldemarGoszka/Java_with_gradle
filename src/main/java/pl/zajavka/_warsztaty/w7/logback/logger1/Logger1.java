package pl.zajavka._warsztaty.w7.logback.logger1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.zajavka._warsztaty.w7.logback.logger2.Logger2;


public class Logger1 {
    private static final Logger log = LoggerFactory.getLogger(Logger1.class);
    public static void log1() {
        log.trace("logging trace in {}", Logger1.class.getName());
        log.debug("logging debug in {}", Logger1.class.getName());
        log.info("logging info in {}",Logger1.class.getName());
    }
}
