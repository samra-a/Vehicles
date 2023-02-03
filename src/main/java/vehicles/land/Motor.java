package vehicles.land;

import vehicles.IMotorised;

public class Motor implements IMotorised {
    private int hp;
    private int fuel;
    
    //contract 
    //if something implements an interface, it has to have all the methods that are defined in the interface

    public Motor(int hp, int fuel) {
        this.hp = hp;
        this.fuel = fuel;
        
    }

    @Override
    public void startEngine() {
        System.out.println("motor started");
    }

    @Override
    public void stopEngine() {
        System.out.println("engine stopped");

    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;;

    }

    @Override
    public int getFuel() {
        return this.fuel;
    }

    @Override
    public void setFuel(int level) {
        this.setFuel(level);

    }
}
