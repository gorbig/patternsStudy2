package week3ObserverPatterns.First;

import java.util.List;

public class Subscriber implements SubscriberTemplate {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleTheEmail(List<String> macVacancies) {
        System.out.println("Dear "+name+", Thank you for wanting to work in the McDonald's network. You have been hired. We have these positions available: " + macVacancies);
    }
}
