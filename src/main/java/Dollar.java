public class Dollar extends Money{

//    protected int amount;

    public Dollar(int amount) {
        this.amount= amount;
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);

    }




}
