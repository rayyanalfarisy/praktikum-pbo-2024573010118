package modul_6.praktikum_2;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String brand,int speed,int numberOfDoors){
        super(brand,speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start(){
        super.start();
        System.out.println("car engine is running smoothly");
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("number of doors:" + numberOfDoors);
    }
    public  void Honk(){
        System.out.println("Beep beep!");
    }
}
