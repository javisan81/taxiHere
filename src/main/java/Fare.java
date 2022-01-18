public class Fare {
    private static final Integer MINIMUM_DISTANCE_PRICE=1;

    private float distance;
    private float minutes;

    private Fare(float distance, float minutes) {
        this.distance=distance;
        this.minutes=minutes;
    }

    public static Fare noDistance() {
        return new Fare(0, 0);
    }

    public static Fare buildByKmsAndMinutes(float distance , float minutes) {
        return new Fare(distance, minutes);
    }

    public Euros fare() {
        if(distance==0)
            return new Euros(Math.ceil(minutes)+MINIMUM_DISTANCE_PRICE);

        return new Euros(Math.ceil(distance * 2) + Math.ceil(minutes));
    }

}
