package Facade;

public class AirFresher implements HomeKit {

    @Override
    public void turnOn() {
        System.out.println("AirFresher in the living room was turned on");
    }
}
