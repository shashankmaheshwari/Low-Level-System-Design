import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ILogger logger= LoggerFactory.creation(LogLevel.INFO);
        logger.log("this is the log");

    }
}