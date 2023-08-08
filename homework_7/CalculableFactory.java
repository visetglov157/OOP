public class CalculableFactory implements iCalculableFactory {
    public calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}