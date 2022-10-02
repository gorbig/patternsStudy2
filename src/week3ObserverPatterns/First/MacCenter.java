package week3ObserverPatterns.First;

import java.util.ArrayList;
import java.util.List;

public class MacCenter implements MacObserved {
    List<String> vacancies = new ArrayList<>();

    List<SubscriberTemplate> subscribers = new ArrayList<>();


    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        notifyObserver();
    }
    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObserver();


    }
    @Override
    public void addSubscriber(SubscriberTemplate observer) {
        this.subscribers.add(observer);
        notifyObserver();
    }

    @Override
    public void removeSubscriber(SubscriberTemplate observer) {
        this.subscribers.remove(observer);
        notifyObserver();
    }
    @Override
    public void notifyObserver() {
        for(SubscriberTemplate observer: subscribers)
        {
            observer.handleTheEmail(this.vacancies);
        }
    }
}
