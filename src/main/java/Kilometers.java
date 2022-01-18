public class Kilometers {
    private float distance;

    public Kilometers(float distance) {
        this.distance = distance;
    }

    public boolean hasNoDistance(){
        return distance == 0;
    }

    public float getDistance() {
        return distance;
    }
}
