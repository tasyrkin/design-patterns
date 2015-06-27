package decorator;

public abstract class Beverage{

    private final BeveragePrice beveragePrice;
    private final DrinkSize drinkSize;

    public Beverage(final DrinkSize drinkSize, final BeveragePrice beveragePrice){
        this.drinkSize = drinkSize;
        this.beveragePrice = beveragePrice;
    }

    public DrinkSize getDrinkSize(){
        return drinkSize;
    }

    public BeveragePrice getBeveragePrice(){
        return beveragePrice;
    }

    public abstract int getCost();

    public abstract String getDescription();

}
