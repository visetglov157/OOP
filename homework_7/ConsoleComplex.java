public class ConsoleComplex implements iComplex {
    @Override
    public void log(String message) {
        System.out.println("LOG:" + message);
    }
}