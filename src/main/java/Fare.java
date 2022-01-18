public class Fare {
    private float distance;

    private Fare(float distance) {
        this.distance = distance;
    }

    public static Fare noDistance() {
        return new Fare(0);
    }

    public Euros fare() {
        if (distance == 0)
            return new Euros(1f);
        return new Euros(Math.ceil(distance * 2));
    }

    public static Fare buildByKms(float distance){
        return  new Fare(distance);
    }
}
