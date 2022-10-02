package week3ObserverPatterns.Second;

import week3ObserverPatterns.First.SubscriberTemplate;

import java.util.ArrayList;
import java.util.List;

public class Productt implements productionCentree {
    List<SubscriberTemplatee> subscribers = new ArrayList<>();
    double cost;

    public Productt(double cost) {
        this.cost = cost;
    }

    public void changeCost(double i){
        cost = i;
        notifyObserver();

    }


    @Override
    public void addSubscriber(SubscriberTemplatee sub) {
        this.subscribers.add(sub);

        notifyObserver();
    }

    @Override
    public void removeSubscriber(SubscriberTemplatee sub) {
        this.subscribers.remove(sub);
        notifyObserver();
    }


    @Override
    public void notifyObserver() {
        for(SubscriberTemplatee sub: subscribers)
        {
            sub.handleTheEmaill(this.cost);
        }

    }
}
