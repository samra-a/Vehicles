package vehicles.air;

import vehicles.IVehicle;

public interface IAirVehicle extends IVehicle {
    public int getFlyHours();
    public void setFlyHours(int hours);
}
