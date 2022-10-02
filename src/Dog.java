public class Dog implements Animal{

    @Override
    public void running() {
        System.out.println("Dog running");
    }


    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    @Override
    public void say() {
        System.out.println("Dog barking");
    }
}
