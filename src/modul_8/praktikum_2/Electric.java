package modul_8.praktikum_2;

public interface Electric {
    void charge();
    int getBatteryLevel();
    void setBatteryInfo(int level);

    default void displayBatteryInfo(){
        System.out.println("bettery level: " + getBatteryLevel() + "%");
    }
}
