public class Main {
    public static void main(String[] args) {
        AnimalInTheBush animalInTheBush = new AnimalInTheBush();
        animalInTheBush.setAnimal(new Cat());
        animalInTheBush.runn();
        animalInTheBush.eatt();
        animalInTheBush.sayy();

        animalInTheBush.setAnimal(new Dog());

        animalInTheBush.runn();
        animalInTheBush.eatt();
        animalInTheBush.sayy();


    }
}
