package vehicles.air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;


// what does components e.g. radar mean?    NEED HELP!!!
// Implement instances of the concrete classes you produced, using composition????????
// When i extend an interface using IVehcile- why don't the methods defined in IVehicle show??

public class Helicopter extends Vehicle implements IAirVehicle, IMotorised {
    private int flyHours;
    private IMotorised engine;

    public Helicopter(float weight, int maxSpeed, IProduct baseProduct, int flyHours) {
        super(weight, maxSpeed, baseProduct);
        this.flyHours = flyHours;
    }

    @Override
    public void startEngine() {
        this.engine.startEngine();
    }

    @Override
    public void stopEngine() {
        this.engine.stopEngine();
    }

    @Override
    public int getHp() {
        return this.engine.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.engine.setHp(hp);

    }

    @Override
    public int getFuel() {
        return this.engine.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.engine.setFuel(fuel);

    }

    @Override
    public int getFlyHours() {
        return this.getFlyHours();
    }

    @Override
    public void setFlyHours(int hours) {
        this.flyHours = hours;
    }
}
