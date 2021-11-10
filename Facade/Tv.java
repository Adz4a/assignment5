package Facade;

public class Tv implements HomeKit {

    @Override
    public void turnOn() {
        System.out.println("Tv in the living room was turned on");
    }
}
