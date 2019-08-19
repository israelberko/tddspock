public class Dollar extends Money{

//    protected int amount;

    public Dollar(int amount) {
        this.amount= amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);

    }




}
