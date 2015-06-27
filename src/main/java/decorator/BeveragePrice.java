package decorator;

import com.google.common.base.Preconditions;
import util.Pair;

import java.util.EnumMap;
import java.util.Map;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkState;

public class BeveragePrice{

    private final Map<DrinkSize, Integer> prices = new EnumMap<DrinkSize, Integer>(DrinkSize.class);

    public BeveragePrice(int smallSizePrice, int mediumSizePrice, int largeSizePrice){
        prices.put(DrinkSize.SMALL, smallSizePrice);
        prices.put(DrinkSize.MEDIUM, mediumSizePrice);
        prices.put(DrinkSize.LARGE, largeSizePrice);
    }

    public BeveragePrice(Pair<DrinkSize, Integer>... prices){
        Preconditions.checkArgument(prices != null, "Prices are missing");

        for(Pair<DrinkSize, Integer> price : prices){
            this.prices.put(price.getFirst(), price.getSecond());
        }
    }

    public int getPrice(DrinkSize drinkSize){

        checkArgument(drinkSize != null, "Drink size is missing");

        final Integer price = prices.get(drinkSize);

        checkState(price != null, "Price is missing for size [%]", drinkSize);

        return price.intValue();
    }
}
