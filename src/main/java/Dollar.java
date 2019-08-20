public class Dollar extends Money{

//    protected int amount;

    Dollar(int amount, String currency) {
        super(amount, currency);
    }


    String currency() {
        return "USD";
    }

    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);

    }




}
