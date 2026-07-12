public class LogLevels {

    public static String message(String logLine) {
        String message = logLine.substring(logLine.indexOf(":") + 2).trim();
        return message;
    }

    public static String logLevel(String logLine) {
        String[] logLevels = new String[]{"INFO", "WARNING", "ERROR"};
        String output = "";
        for (String logLevel : logLevels) {
            if (logLine.contains(logLevel)) {
                output = logLevel.toLowerCase();
            }
        }
        return output;
    }

    public static String reformat(String logLine) {
        String logLevel = logLevel(logLine);
        String message = message(logLine);
        return message + "(" + logLevel + ")";
    }
}
