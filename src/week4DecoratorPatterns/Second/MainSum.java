package week4DecoratorPatterns.Second;

public class MainSum {
    public static void main(String[] args) {
        TotalSum thirthNumber = new ThirthNumber(new SecondNumber(new FirtstNumber()));
        System.out.println(thirthNumber.getSum());
    }
}
