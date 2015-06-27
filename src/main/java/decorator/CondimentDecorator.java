package decorator;

public abstract class CondimentDecorator extends Beverage {

    private final Beverage beverage;
    private final BeveragePrice condimentPrice;

    public CondimentDecorator(final Beverage beverage, final BeveragePrice condimentPrice) {
        super(beverage.getDrinkSize(), beverage.getBeveragePrice());

        this.beverage = beverage;
        this.condimentPrice = condimentPrice;
    }

    public Beverage getBeverage(){
        return beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() + condimentPrice.getPrice(beverage.getDrinkSize());
    }
}
