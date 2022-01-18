public class FareCalculator {

    public float calculateByDistance(Kilometers kms) {
        if (kms.hasNoDistance())
            return 1;

        return  (float) Math.ceil(kms.getDistance()*2);
    }
}
