package week4DecoratorPatterns.First;

public class SuperHeroDecorator implements SuperHero{
    SuperHero superHero;

    public SuperHeroDecorator(SuperHero superHero) {
        this.superHero = superHero;
    }

    @Override
    public String SavingTheWorld() {
        return superHero.SavingTheWorld();
    }
}
