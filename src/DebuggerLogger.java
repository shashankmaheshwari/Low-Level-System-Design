public class DebuggerLogger implements ILogger{
    @Override
    public void log(String msg) {
        System.out.println("DEBUG "+msg);
    }
}
