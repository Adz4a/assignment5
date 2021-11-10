package Facade;

public class LivingRoomFacade {
    private HomeKit tv;
    private HomeKit light;
    private HomeKit airFresher;

    public LivingRoomFacade() {
        tv = new Tv();
        light = new Light();
        airFresher = new AirFresher();
    }

    public void turnOnTv(){
        tv.turnOn();
    }
    public void turnOnLight(){
        light.turnOn();
    }
    public void turnOnAirFresher(){
        airFresher.turnOn();
    }
}
