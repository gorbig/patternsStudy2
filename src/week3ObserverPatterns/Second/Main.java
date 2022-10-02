package week3ObserverPatterns.Second;

public class Main {
    public static void main(String[] args) {
        SubscriberTemplatee firstSub = new Subscriberr("Pika Rico");
        SubscriberTemplatee SecondSub = new Subscriberr("Sinior Pink");
        Productt product = new Productt(40);
        product.addSubscriber(firstSub);
        product.addSubscriber(SecondSub);
        product.changeCost(25);

    }
}
