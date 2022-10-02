public class Main {
    public static void main(String[] args) {
        Jump jump = new Jump();
        Cat cat = new Cat(jump);
        cat.do0();

        Run run = new Run();
        Cat cat1 = new Cat(run);
        cat1.do0();

    }
}
