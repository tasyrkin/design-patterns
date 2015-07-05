package factorymethod;

public class Main {
    public static void main(String[] args) {
        final Creator creator = new ConcreteCreator();

        creator.performLogic(ProductType.TYPE_B);
    }
}
