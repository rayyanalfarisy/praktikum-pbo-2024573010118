package modul_6.praktikum_2;

public class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand,int speed){
        this.brand =  brand;
        this.speed = speed;
    }

    public void start(){
        System.out.println("vehicle is starting...");
    }
    public void displayInfo(){
        System.out.println("Brand "+ brand);
        System.out.println("speed "+ speed + "km/h");
    }
}
