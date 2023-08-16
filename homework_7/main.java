public class Main {
    public static void main(String[] args) {

        iComplexCalculableFactory complexFactory = new ComplexCalculableFactory(new ConsoleComplex());
        ViewCalculator view1 = new ViewCalculator(complexFactory);
        view1.run();
    }
}