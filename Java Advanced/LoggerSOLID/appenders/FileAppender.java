package LoggerSOLID.appenders;

import LoggerSOLID.layouts.Layout;
import LoggerSOLID.loggers.MessageLogger;
import LoggerSOLID.utilities.File;

public class FileAppender implements Appender{
    private Layout layout;
    private File file;

    public FileAppender(Layout layout, File file) {
        this.layout = layout;
        this.file = file;
    }

    @Override
    public void append(String timeStamp, MessageLogger.LogLevel logLevel, String message) {
        file.write(layout.format(timeStamp, logLevel, message));
    }
}
