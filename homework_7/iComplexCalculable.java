public interface iComplexCalculable {
    iComplexCalculable sum(Calculator arg);

    iComplexCalculable multi(Calculator arg);

    iComplexCalculable division(Calculator arg);

    double getA();

    double getB();
}