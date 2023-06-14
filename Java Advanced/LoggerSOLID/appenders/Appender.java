package LoggerSOLID.appenders;

import LoggerSOLID.loggers.MessageLogger;

public interface Appender {

    void append(String timeStamp, MessageLogger.LogLevel logLevel, String message);
}
