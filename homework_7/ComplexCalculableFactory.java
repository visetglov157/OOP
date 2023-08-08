public class ComplexCalculableFactory implements iComplexCalculableFactory {
    private iComplex logger;

    // Конструктор
    public ComplexCalculableFactory(iComplex logger) {
        this.logger = logger;
    }

    @Override
    public iComplexCalculable create(double a, double b) {
        return new ComplexCalculator(create(a, b), logger);
    }

}