package behavioural.strategy;

public class BlackAndWhite implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Filtering Black And White");
    }
}
