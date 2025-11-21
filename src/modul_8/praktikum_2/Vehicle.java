package modul_8.praktikum_2;

public interface Vehicle {

    int MAX_SPEED = 200;

    static void displayMaxSpeed() {
    }

    void start();
    void stop();
    void accelerate(double speed);
    void brake();

    default void honk(){
        System.out.println("beep beep!");
    }

    static void displayMAXSPEED(){
        System.out.println("maximum speed for all vehicle: " + MAX_SPEED + "km/h");
    }
}
