package week3ObserverPatterns.Second;

import week3ObserverPatterns.First.SubscriberTemplate;

public interface productionCentre {
    public void addSubscriber(SubscriberTemplate observer);

    public void removeSubscriber(SubscriberTemplate observer);

    public void notifyObserver();
}
