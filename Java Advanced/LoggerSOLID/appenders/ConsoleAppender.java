package LoggerSOLID.appenders;

import LoggerSOLID.layouts.Layout;
import LoggerSOLID.loggers.MessageLogger;

public class ConsoleAppender implements Appender {
    private Layout layout;

    public ConsoleAppender(Layout layout) {
        this.layout = layout;
    }
    @Override
    public void append(String timeStamp, MessageLogger.LogLevel logLevel, String message){
        System.out.println(layout.format(timeStamp, logLevel, message));
    }
}
