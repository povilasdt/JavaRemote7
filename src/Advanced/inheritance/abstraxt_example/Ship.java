package Advanced.inheritance.abstraxt_example;

public class Ship extends Vehicle{
    public Ship(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public int vehicleMaxSpeed() {
        return maxSpeed * 2;
    }
}
