package water;


import products.IProduct;
import vehicles.Vehicle;
import vehicles.IMotorised;

public class SpeedBoat extends Vehicle implements IWaterVehicle, IMotorised{

   private String hullType;
   private IMotorised motor;

    public SpeedBoat(float weight, int maxSpeed, IProduct baseProduct, String hullType, IMotorised motor) {
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
        this.motor = motor;
    }

    @Override
    public String getHullType() {
        return this.hullType; //need trainer for this
    }

    @Override
    public void setHullType(String type) {
         this.hullType = type;
    }

    @Override
    public void startEngine() {
        System.out.println("Motor started");

    }

    @Override
    public void stopEngine() {
        System.out.println("motor stopped");
    }

    @Override
    public int getHp() {
        return this.motor.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.motor.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.motor.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.motor.setFuel(fuel);
    }
}
