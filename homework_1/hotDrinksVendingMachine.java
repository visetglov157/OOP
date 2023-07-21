package homework_1;

import java.util.ArrayList;
import java.util.List;

public class hotDrinksVendingMachine implements VendingMachine {

    private final List<hotDrink> list;

    public hotDrinksVendingMachine() {
        list = new ArrayList<>();
    }


    public void addProduct(product product) {
        list.add((hotDrink) product);
    }

    public product getProduct(String name) {
        for (product product : list) {
            if (name.equals(product.getName())){
                return product;
            }
        }
        return null;
    }

    public hotDrink getProduct(String name, Integer volume, Integer temp) {
        for (hotDrink product : list) {
            if (name.equals(product.getName())
                    && volume.equals(product.getVolume())
                    && temp.equals(product.getTemp()) ){
                return product;
            }
        }
        return null;
    }

}
