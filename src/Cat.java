public class Cat implements Animal{

    @Override
    public void running() {
        System.out.println("Cat running");
    }

    @Override
    public void eat() {
        System.out.println("Cat eating");
    }

    @Override
    public void say() {
        System.out.println("Cat meows");
    }
}
