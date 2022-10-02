package week3ObserverPatterns.First;

public interface MacObserved {
    public void addSubscriber(Observer observer);

    public void removeSubscriber(Observer observer);

    public void notifyObserver();


}
