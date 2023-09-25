public class LoggerFactory {

     public static  ILogger creation(LogLevel logLevel){
         switch (logLevel){
             case DEBUG:
                 return new  DebuggerLogger();
             case INFO:
                 return new InfoLogger();
             case ERROR:
                 return new ErrorLogger();
             default:
                 return null;
         }
    }

}
