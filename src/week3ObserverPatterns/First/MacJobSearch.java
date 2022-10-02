package week3ObserverPatterns.First;

public class MacJobSearch {
    public static void main(String[] args) {
        MacCenter macCenter = new MacCenter();
        macCenter.addVacancy("Cashier");
        macCenter.addVacancy("cook");
        macCenter.addVacancy("receptionist");

        SubscriberTemplate firstSubscriber = new Subscriber("Pokemon Begenov");
        SubscriberTemplate secondSubscriber = new Subscriber("Rio Primo");

        macCenter.addSubscriber(firstSubscriber);
        macCenter.addSubscriber(secondSubscriber);

        macCenter.addVacancy("helper");

    }


}
