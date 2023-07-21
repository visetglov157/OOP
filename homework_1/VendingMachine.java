package homework_1;

public interface VendingMachine {

    void addProduct(product product);

    product getProduct(String name);

    product getProduct(String name, Integer volume, Integer temp);

}
