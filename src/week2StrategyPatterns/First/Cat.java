package week2StrategyPatterns.First;

public class Cat implements Animal{

    @Override
    public void run() {
        System.out.println("week2StrategyPatterns.Cat running");
    }

    @Override
    public void eat() {
        System.out.println("week2StrategyPatterns.Cat eating");
    }

    @Override
    public void say() {
        System.out.println("week2StrategyPatterns.Cat meows");
    }
}
