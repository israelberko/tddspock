public class Dollar {

    public int amount = 10;

    public Dollar(int amount) {
        this.amount= amount;
    }

    void times(int multiplier) {
        amount= amount * multiplier;
    }

}
