package factorymethod;

public abstract class Creator {
    protected abstract Product factoryMethod(ProductType productType);

    public void performLogic(ProductType productType){

        final Product product = factoryMethod(productType);

        product.performOperation();
    }
}
