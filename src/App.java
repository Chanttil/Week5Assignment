public class App {
    public static void main(String[] args) {
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        asteriskLogger.Log("Hello");
        System.out.println();
        spacedLogger.Log("Hello");
        System.out.println();
        spacedLogger.Error("Hello");
        System.out.println();
        asteriskLogger.Error("Hello");
    }
}