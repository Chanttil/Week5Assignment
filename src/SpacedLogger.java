public class SpacedLogger implements Logger {

    public SpacedLogger() {
    }

    public void Log(String tree) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < tree.length(); i++) {
            result.append(" ");

            result.append(tree.charAt(i));
        }
        System.out.println(result);
    }

    public void Error(String tree){
        System.out.print("ERROR: ");
        this.Log(tree);
    }
}
