public class FareCalculator {
    public float calculateByDistance(float kms) {
        if (kms == 0)
            return 1;
        return kms * 2;
    }
}
