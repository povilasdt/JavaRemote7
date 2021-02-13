package nested_classes;

public class Bicycle {
    private int maxSpeed;

    public Bicycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getmaxSpeed() {
        return maxSpeed;
    }

    //Nested classes
    public static class Mechanic{
        public void upgrade(Bicycle bicycle) {
    bicycle.maxSpeed *= 2;
        }
    }

}
