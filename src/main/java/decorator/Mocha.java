package decorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage, BeveragePrice condimentPrice) {
        super(beverage, condimentPrice);
    }

    @Override
    public String getDescription() {
        return String.format("%s with %s", getBeverage().getDescription(), "Mocha");
    }
}
