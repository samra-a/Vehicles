package water;

import products.IProduct;
import vehicles.Vehicle;
import water.IWaterVehicle;

public class Kayak extends Vehicle implements IWaterVehicle {
   private String hullType;

    public Kayak(float weight, int maxSpeed, IProduct baseProduct, String hullType) {
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
    }

    @Override
    public String getHullType() {
        return this.hullType;
    }

    @Override
    public void setHullType(String type) {
         this.hullType = type;
    }
}
