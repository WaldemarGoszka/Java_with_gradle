package pl.zajavka._warsztaty.w7.slf4j.StackTrace;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstExample {
    private static final Logger LOGGER = LoggerFactory.getLogger(FirstExample.class);
    public static void main(String[] args) {
        LOGGER.trace("Hello zajavka!, parametr: {}", 123);
        LOGGER.debug("Hello zajavka!, parametr: {}", 123);
        LOGGER.info("Hello zajavka!, parametr: {}", 123);
        LOGGER.warn("Hello zajavka!, parametr: {}", 123);
        LOGGER.error("Hello zajavka!, parametr: {}", 123);

    }
}
