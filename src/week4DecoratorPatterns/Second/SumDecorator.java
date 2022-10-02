package week4DecoratorPatterns.Second;

public class SumDecorator implements TotalSum {
    TotalSum totalSum;

    public SumDecorator(TotalSum totalSum) {
        this.totalSum = totalSum;
    }


    @Override
    public int getSum() {
        return totalSum.getSum();
    }
}
