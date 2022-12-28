package pl.zajavka._warsztaty.w7.logback.logger2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.zajavka._warsztaty.w7.logback.logger1.Logger1;

public class Logger2 {
    private static final Logger log = LoggerFactory.getLogger(Logger2.class);
    public static void log1() {
        log.trace("logging trace in {}", Logger2.class.getName());
        log.debug("logging debug in {}", Logger2.class.getName());
        log.info("logging info in {}",Logger2.class.getName());
    }
}
