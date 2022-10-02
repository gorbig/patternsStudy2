package week4DecoratorPatterns.Second;

public class SecondNumber extends SumDecorator{

    public SecondNumber(TotalSum totalSum) {
        super(totalSum);
    }
    @Override
    public int getSum()
    {
        return totalSum.getSum() + 15;
    }
}
