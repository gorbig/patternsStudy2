package week3ObserverPatterns.Second;

import java.util.List;

public class Subscriber implements SubscriberTemplate {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }


    @Override
    public void handleTheEmail(double cost) {
        System.out.println("Dear "+ name +" there are big discounts in our JoyFull shop right now. We advise you to hurry and pick up the product in "+ cost +" dollars");
    }
}
