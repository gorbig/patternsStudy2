package week4DecoratorPatterns.Second;

public class ThirthNumber extends SumDecorator {
    public ThirthNumber(TotalSum totalSum) {
        super(totalSum);
    }
    @Override
    public int getSum()
    {
        return totalSum.getSum() + 85;
    }
}
