public class FareCalculator {

    public Euros calculateByDistance(Kilometers kms) {
        if (kms.hasNoDistance())
            return new Euros(1f);

        return new Euros(Math.ceil(kms.getDistance() * 2));
    }
}
