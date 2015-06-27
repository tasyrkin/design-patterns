package decorator;

import com.google.common.base.Preconditions;
import javafx.util.Pair;

import java.util.EnumMap;
import java.util.Map;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkState;

public class BeveragePrice{

    private Map<DrinkSize, Integer> prices = new EnumMap<DrinkSize, Integer>(DrinkSize.class);

    BeveragePrice(int smallSizePrice, int mediumSizePrice, int largeSizePrice){
        prices.put(DrinkSize.SMALL, smallSizePrice);
        prices.put(DrinkSize.MEDIUM, mediumSizePrice);
        prices.put(DrinkSize.LARGE, largeSizePrice);
    }

    public int getPrice(DrinkSize drinkSize){

        checkArgument(drinkSize != null, "Drink size is missing");

        final Integer price = prices.get(drinkSize);

        checkState(price != null, "Price is missing for size [%]", drinkSize);

        return price.intValue();
    }
}
