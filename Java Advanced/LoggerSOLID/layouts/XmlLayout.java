package LoggerSOLID.layouts;

import LoggerSOLID.loggers.MessageLogger;

public class XmlLayout implements Layout{
    @Override
    public String format(String timeStamp, MessageLogger.LogLevel logLevel, String message) {
        return String.format("<log>%n" +
                "   <date>%s</date>%n" +
                "   <level>%s</level>%n" +
                "   <message>%s%n" +
                "</log>%n", timeStamp, logLevel, message);
    }
}
