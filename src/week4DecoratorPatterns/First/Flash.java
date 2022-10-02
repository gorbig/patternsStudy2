package week4DecoratorPatterns.First;

public class Flash extends SuperHeroDecorator {
    public Flash(SuperHero superHero) {
        super(superHero);
    }

    public String getsToTheVillain() {
        return " Gets to the villain.";
    }

    @Override
    public String SavingTheWorld(){
        return superHero.SavingTheWorld() + getsToTheVillain();
    }
}
