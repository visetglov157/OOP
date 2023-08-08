public class ComplexCalculator implements iComplexCalculable {
    private iComplexCalculable decorated;
    private iComplex logger;

    // Конструктор
    public ComplexCalculator(iComplexCalculable decorated, iComplex logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    // Метод для вычисления суммы
    @Override
    public iComplexCalculable sum(Calculator c) {
        double a = decorated.getA();
        double b = decorated.getB();
        logger.log(String.format("Первое значение калькулятора %f + %f i. Начало вызова метода sum с параметром %f", a,
                b, c));
        iComplexCalculable result = decorated.sum(c);
        logger.log(String.format("Вызов метода sum произошел"));
        return result;
    }

    // Метод для вычисления произведения
    @Override
    public iComplexCalculable multi(Calculator c) {
        double a = decorated.getA();
        double b = decorated.getB();
        logger.log(String.format("Первое значение калькулятора %f + %f i. Начало вызова метода multi с параметром %f",
                a, b, c));
        iComplexCalculable result = decorated.multi(c);
        logger.log(String.format("Вызов метода multi произошел"));
        return result;
    }

    // Метод для вычисления частного
    @Override
    public iComplexCalculable division(Calculator c) {
        double a = decorated.getA();
        double b = decorated.getB();
        logger.log(String.format(
                "Первое значение калькулятора %f + %f i. Начало вызова метода division с параметром %f", a, b, c));
        iComplexCalculable result = decorated.division(c);
        logger.log(String.format("Вызов метода division произошел"));
        return result;
    }

    // Метод для вызова действительной части
    @Override
    public double getA() {
        return decorated.getA();
    }

    // Метод для вызова мнимой части
    @Override
    public double getB() {
        return decorated.getB();
    }

    // Метод для вызова результата
    public iComplexCalculable getResult() {
        double result1 = decorated.getA();
        double result2 = decorated.getB();
        logger.log(String.format("Получение результата %f + %f i", result1, result2));
        return decorated;
    }

}