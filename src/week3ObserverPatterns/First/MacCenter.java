package week3ObserverPatterns.First;

import java.util.ArrayList;
import java.util.List;

public class MacCenter implements MacObserved {
    List<String> vacancies = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();


    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        notifyObserver();
    }
    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObserver();


    }
    @Override
    public void addSubscriber(Observer observer) {
        this.subscribers.add(observer);
        notifyObserver();
    }

    @Override
    public void removeSubscriber(Observer observer) {
        this.subscribers.remove(observer);
        notifyObserver();
    }
    @Override
    public void notifyObserver() {
        for(Observer observer: subscribers)
        {
            observer.handleTheEmail(this.vacancies);
        }
    }
}
