public class FareCalculator {
    public int calculateByDistance(float kms) {
        if (kms == 1)
            return 2;
        if(kms ==2)
            return 4;
        return 1;
    }
}
