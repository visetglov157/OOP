public class CalculableFactory implements iCalculableFactory {
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}