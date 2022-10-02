public class Cat
{
    private Strategy strategy;

    public Cat(Strategy strategy) {
        this.strategy = strategy;
    }
    public void do0(){
        strategy.doSmth();
    }
}
