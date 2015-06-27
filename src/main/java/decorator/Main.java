package decorator;

public class Main {
    public static void main(String[] args) {

        final Beverage customerBaseBeverage = new Espresso(DrinkSize.MEDIUM, new BeveragePrice(90, 100, 110));

        final Beverage customerBeverage = new Mocha(customerBaseBeverage, new BeveragePrice(10, 15, 20));

        System.out.println(String.format("Beverage [%s] costs [%s] cents",
                customerBeverage.getDescription(), customerBeverage.getCost()));
    }
}
