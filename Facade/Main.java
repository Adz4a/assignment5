package Facade;


public class Main {

    public static void main(String[] args) {
        LivingRoomFacade livingRoomButton = new LivingRoomFacade();

        livingRoomButton.turnOnLight();
        livingRoomButton.turnOnAirFresher();
        livingRoomButton.turnOnTv();
    }
}
