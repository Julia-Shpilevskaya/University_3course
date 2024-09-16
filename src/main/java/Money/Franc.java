package Money;

public class Franc extends Money {
    public int amount;
    public Franc(int amount) {
        this.amount = amount;
    }

   public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass(). equals(money.getClass());
    }
}
