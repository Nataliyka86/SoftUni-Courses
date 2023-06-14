package LoggerSOLID.loggers;

import LoggerSOLID.appenders.Appender;

import java.util.Map;

public class MessageLogger implements Logger{

    public enum LogLevel{
        INFO,
        WARNING,
        ERROR,
        CRITICAL,
        FATAL;
    }
    private Map<Appender, LogLevel> appendersWithLevels;

    public MessageLogger(Map<Appender, LogLevel> appendersWithLevels) {
        this.appendersWithLevels = appendersWithLevels;
    }

    @Override
    public void logInfo(String timeStamp, String message) {
        logToAllAppenders(timeStamp, LogLevel.INFO, message);
    }

    @Override
    public void logWarning(String timeStamp, String message) {
        logToAllAppenders(timeStamp, LogLevel.WARNING, message);
    }

    @Override
    public void logError(String timeStamp, String message) {
        logToAllAppenders(timeStamp, LogLevel.ERROR, message);
    }

    @Override
    public void logCritical(String timeStamp, String message) {
        logToAllAppenders(timeStamp, LogLevel.CRITICAL, message);
    }

    @Override
    public void logFatal(String timeStamp, String message) {
        logToAllAppenders(timeStamp, LogLevel.FATAL, message);
    }
    private void logToAllAppenders(String timeStamp, LogLevel logLevel, String message){
        for (var entry : appendersWithLevels.entrySet()) {
            Appender appender = entry.getKey();
             LogLevel appenderLevel = entry.getValue();
             if (appenderLevel.ordinal() >= logLevel.ordinal()){
            appender.append(timeStamp, logLevel, message);

             }


        }
    }
}
