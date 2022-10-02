package week2StrategyPatterns.First;

public class Dog implements Animal{

    @Override
    public void run() {
        System.out.println("week2StrategyPatterns.Dog running");
    }


    @Override
    public void eat() {
        System.out.println("week2StrategyPatterns.Dog eating");
    }

    @Override
    public void say() {
        System.out.println("week2StrategyPatterns.Dog barking");
    }
}
