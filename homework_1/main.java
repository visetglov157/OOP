package homework_1;


public class main {
    public static void main(String[] args) {

        hotDrink hotTeaSmall = new hotTea("Dilmah", 109, 180, 80);
        hotDrink hotCoffeeMedium = new hotCoffee("Carte Noire", 154, 250, 75);
        hotDrink hotChocolateLarge = new hotChocolate("Elza", 189, 325, 70);

        VendingMachine hotDrinksVending = new hotDrinksVendingMachine();

        hotDrinksVending.addProduct(hotTeaSmall);
        hotDrinksVending.addProduct(hotCoffeeMedium);
        hotDrinksVending.addProduct(hotChocolateLarge);

        System.out.println(hotDrinksVending.getProduct("Carte Noire"));
        System.out.println(hotDrinksVending.getProduct("Elza", 325, 70));
    }
}