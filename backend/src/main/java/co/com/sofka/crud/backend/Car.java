package co.com.sofka.crud.backend;

public class Car {
    private int numberCar;
    private String colorCar;
    protected void setNumberCar (int numberCar){
        this.numberCar = numberCar;
    }
    protected void setColorCar(String colorCar){
        this.colorCar = colorCar;
    }
    protected int showNumber(){
        return this.numberCar;
    }
}
