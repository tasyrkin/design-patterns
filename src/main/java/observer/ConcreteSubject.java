package observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;

import static com.google.common.base.Preconditions.checkArgument;

public class ConcreteSubject implements Subject {

    private static Logger logger = LogManager.getLogger(ConcreteSubject.class);

    private LinkedList<Observer> observers = new LinkedList<Observer>();

    public void registerObserver(Observer observer) {

        checkArgument(observer != null, "Observer is missing");

        if(!observers.contains(observer)){
            observers.add(observer);
            logger.debug("Registered observer {}", observer);
        }
    }

    public void unregisterObserver(Observer observer) {

        checkArgument(observer != null, "Observer is missing");

        observers.remove(observer);

        logger.debug("Unregistered observer {}", observer);
    }

    public void notifyObservers() {

        logger.debug("Notifying observers...");

        for(Observer observer : observers){
            observer.update();
        }
    }
}
