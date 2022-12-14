package week3ObserverPatterns.First;

public interface MacObserved {
    public void addSubscriber(SubscriberTemplate observer);

    public void removeSubscriber(SubscriberTemplate observer);

    public void notifyObserver();


}
