package observer;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConcreteObserver2 implements Observer {
    private static Logger logger = LogManager.getLogger(ConcreteObserver2.class);

    public void update() {
        logger.debug("{} was notified", this);
    }
}
