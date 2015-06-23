package observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.setState(10);

        subject.unregisterObserver(observer2);
        subject.unregisterObserver(observer1);
    }
}
