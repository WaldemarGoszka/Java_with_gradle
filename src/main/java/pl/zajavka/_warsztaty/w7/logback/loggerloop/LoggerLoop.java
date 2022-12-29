package pl.zajavka._warsztaty.w7.logback.loggerloop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class LoggerLoop {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerLoop.class);

    private static final Map<Integer, Consumer<Integer>> ACTIONS = Map.of(
            0, i -> LOGGER.debug("some debug message, counter: {}", i),
            1, i -> LOGGER.info("some info message, counter: {}", i),
            2, i -> LOGGER.warn("some warn message, counter: {}", i),
            3, i -> LOGGER.error("some error message, counter: {}", i)
    );

    public static void log() {
        IntStream.rangeClosed(0, 5_000_000)
                .map(i -> i % 4)
                .forEach(key -> Optional.ofNullable(ACTIONS.get(key))
                        .orElseThrow(() -> new RuntimeException("Case not handled"))
                        .accept(key));
    }

}
