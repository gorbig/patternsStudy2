package week2StrategyPatterns.First;

public class AnimalInTheBush {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void eatt()
    {
        animal.eat();
    }
    public void runn()
    {
        animal.run();
    }

    public void sayy()
    {
        animal.say();
    }
}
