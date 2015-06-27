package decorator;

public class Espresso extends Beverage {

    public Espresso(final DrinkSize drinkSize, final BeveragePrice beveragePrice) {
        super(drinkSize, beveragePrice);
    }

    @Override
    public int getCost() {
        return getBeveragePrice().getPrice(getDrinkSize());
    }

    public String getDescription() {
        return "Espresso";
    }
}