package week3ObserverPatterns.Second;

import week3ObserverPatterns.First.Subscriber;
import week3ObserverPatterns.First.SubscriberTemplate;

import java.util.ArrayList;
import java.util.List;

public class Product implements productionCentre {
    List<SubscriberTemplate> subscribers = new ArrayList<>();
    double cost;

    public Product(double cost) {
        this.cost = cost;
    }

    public void changeCost(double i){
        cost = i;
        notifyObserver();

    }

    @Override
    public void addSubscriber(SubscriberTemplate sub) {
        this.subscribers.add(sub);

        notifyObserver();
    }

    @Override
    public void removeSubscriber(SubscriberTemplate sub) {
        this.subscribers.remove(sub);
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for(SubscriberTemplate sub: subscribers)
        {
            sub.handleTheEmail(this.cost);
        }

    }
}
