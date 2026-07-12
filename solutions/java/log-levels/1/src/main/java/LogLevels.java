public class LogLevels {

    private enum LogLevel {
        INFO ("INFO"),
        WARNING ("ERROR"),
        ERROR ("ERROR"),
    }

    public static String message(String logLine) {
        String message = logLine.substring(logLine.indexOf(":") + 2).trim();
        return message;
    }

    public static String logLevel(String logLine) {
        String logLevel = "";
        if (logLine.contains(LogLevel.INFO.toString())) {
            logLevel = LogLevel.INFO.toString();
        } else if (logLine.contains(LogLevel.WARNING.toString())) {
            logLevel = LogLevel.WARNING.toString();
        } else if (logLine.contains(LogLevel.ERROR.toString())) {
            logLevel = LogLevel.ERROR.toString();
        }
        return logLevel.toLowerCase();
    }

    public static String reformat(String logLine) {
        String logLevel = logLevel(logLine);
        String message = message(logLine);
        return message + "(" + logLevel + ")";
    }
}
