package pl.zajavka._warsztaty.w7.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.zajavka._warsztaty.w7.logback.logger1.Logger1;
import pl.zajavka._warsztaty.w7.logback.logger2.Logger2;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        log.trace("logging trace in {}", Main.class.getName());
        log.debug("logging debug in {}", Main.class.getName());
        log.info("logging info in {}", Main.class.getName());
        log.warn("logging warn in {}", Main.class.getName());
        log.error("logging error in {}", Main.class.getName());

        System.out.println("run Logger1");
        Logger1.log1();
        System.out.println("run Logger2");
        Logger2.log1();
    }
}
