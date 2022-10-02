package week3ObserverPatterns.Second;

public class Subscriberr implements SubscriberTemplatee {
    String name;

    public Subscriberr(String name) {
        this.name = name;
    }


    @Override
    public void handleTheEmaill(double cost) {
        System.out.println("Dear "+ name +" there are big discounts in our JoyFull shop right now. We advise you to hurry and pick up the product in "+ cost +" dollars");
    }
}
