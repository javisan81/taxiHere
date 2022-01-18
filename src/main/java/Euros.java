import java.util.Objects;

public class Euros {
    private float amount;

    public Euros(float amount) {
        this.amount = amount;
    }

    public Euros(double ceil) {
        this((float) ceil);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Euros money = (Euros) o;
        return Float.compare(money.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
