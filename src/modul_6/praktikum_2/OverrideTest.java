package modul_6.praktikum_2;

public class OverrideTest {
    public static void main(String []args){
        Car Car = new Car("toyota",180,4);

        Car.start();
        Car.displayInfo();
        Car.Honk();

        Vehicle Vehicle = new Car("Honda",200,2);
        Vehicle.start();
        Vehicle.displayInfo();
    }
}
