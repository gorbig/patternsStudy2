package week3ObserverPatterns.Second;

import week3ObserverPatterns.First.SubscriberTemplate;

public interface productionCentree {


    void addSubscriber(SubscriberTemplatee sub);

    void removeSubscriber(SubscriberTemplatee sub);

    public void notifyObserver();
}
