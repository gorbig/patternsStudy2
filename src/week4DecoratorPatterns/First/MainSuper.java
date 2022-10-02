package week4DecoratorPatterns.First;

public class MainSuper {
    public static void main(String[] args) {
        SuperHero superHero = new SuperMan(new Flash(new Batman()));
        System.out.println(superHero.SavingTheWorld());
    }
}
