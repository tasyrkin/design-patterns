package factorymethod;

import com.google.common.base.Preconditions;

import static com.google.common.base.Preconditions.checkArgument;
import static java.lang.String.format;

public class ConcreteCreator extends Creator {
    @Override
    protected Product factoryMethod(ProductType productType) {

        checkArgument(productType != null, "Missing product type");

        switch (productType) {
            case TYPE_A:
                return new ProductA();
            case TYPE_B:
                return new ProductB();
            case TYPE_C:
                return new ProductC();
        }

        throw new IllegalArgumentException(format("Unrecognized product type [%s]", productType));
    }
}
