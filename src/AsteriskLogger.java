public class AsteriskLogger implements Logger {

    public AsteriskLogger(){

    }
        public void Log(String tree){
            System.out.println("***" + tree + "***");

    }

    public void Error(String trunk){
        String error = "Error: " + trunk;
        System.out.println("*******************");
        this.Log(error);
        System.out.println("*******************");
    }
}
