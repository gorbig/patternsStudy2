package week4DecoratorPatterns.First;

public class SuperMan extends Flash{
    public SuperMan(SuperHero superHero) {
        super(superHero);
    }
    public String defeatsTheVillain()
    {
        return " Defeats the supervillain.";

    }

    @Override
    public String SavingTheWorld(){
        return superHero.SavingTheWorld() + defeatsTheVillain();
    }
}
