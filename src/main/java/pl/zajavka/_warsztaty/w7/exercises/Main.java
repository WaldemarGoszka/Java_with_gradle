package pl.zajavka._warsztaty.w7.exercises;

//Napisz konfigurację Logback, w której określisz, że:
//        1. W konsoli chcesz logować wszystkie zdarzenia i logujesz je z poziomem INFO
//        2. Do tego chcesz skonfigurować logowanie do plików.
//        Pliki mają się rollować się przy rozmiarze 20MB.
//        Jeżeli pliki z logami przekroczą rozmiar 10GB, mamy zacząć usuwać najstarsze z nich.
//        Pliki z logami mają być przetrzymywane przez 50 dni.
//        Logowanie do plików ma mieć poziom INFO.
//        Logi w plikach mają być zapisywane w katalogu my-logs.
//        Pliki archiwalne mają byćumiejscowione w katalogu my-logs/archived.
//        Najświeższy plik z logami ma mieć nazwę newest.log.
//        Pliki archiwalne mają mieć nazwę, np. rolled.{data}.{numer_porządkowy}.log.
//        Do plików mamy logować zdarzenia z całej aplikacji, czyli z jej głównej paczki, np. pl.zajavka.
public class Main {
//    1.
//    <?xml version="1.0" encoding="UTF-8"?>
//        <configuration>
//
//            <appender name="ZAJAVKA" class="ch.qos.logback.core.ConsoleAppender">
//                <encoder>
//                    <pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n</pattern>
//                </encoder>
//            </appender>
//
//            <root level="info">
//                <appender-ref ref="ZAJAVKA"/>
//            </root>
//        </configuration>

//2.
//
//    <?xml version="1.0" encoding="UTF-8"?>
//<configuration>
//
//    <property name="HOME_LOG_ROLLING" value="${user.dir}/my-logs/newest.log"/>
//
//
//    <appender name="FILE-ROLLING" class="ch.qos.logback.core.rolling.RollingFileAppender">
//        <file>${HOME_LOG_ROLLING}</file>
//
//        <rollingPolicy class="ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy">
//            <fileNamePattern>my-logs/archived/rolled.%d{yyyy-MM-dd}.%i.log</fileNamePattern>
//            <maxFileSize>20MB</maxFileSize>
//            <totalSizeCap>10GB</totalSizeCap>
//            <maxHistory>50</maxHistory>
//        </rollingPolicy>
//
//        <encoder>
//            <pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n</pattern>
//        </encoder>
//    </appender>
//
//    <logger name="pl.zajavka" level="info" additivity="false">
//        <appender-ref ref="FILE-ROLLING"/>
//    </logger>
//
//
//    <root level="error">
//        <appender-ref ref="CONSOLE"/>
//        <appender-ref ref="FILE-ROLLING"/>
//
//    </root>

}
