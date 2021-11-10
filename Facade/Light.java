package Facade;

public class Light implements HomeKit{
    @Override
    public void turnOn(){
        System.out.println("Light in the living room was turned on ");
    }
}