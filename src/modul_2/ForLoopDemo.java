package modul_2;

public class ForLoopDemo {
    public static void main(String[]args){
        //contoh 1:menampilkan angka 1-10
        System.out.println("===Angka 1-10===");
        for(int i=1; i<= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        //contoh 2:menampilkan angka genap
        System.out.println("\n=== Angka Genap 2-20===");
        for(int i=2; i<=20; i+=2){
            System.out.print(i + " ");
        }

        //contoh 3:countdown
        System.out.println("\n=== coundown====");
        for(int i=10; i>=1; i--){
            System.out.print(i + " ");
        }
        System.out.println("start!");

        //contoh 4:tabel perkalian
        System.out.println("\n=== tabel perkalian 5===");
        for (int i =1; i<=10; i++){
            System.out.println("5 x " + i + " = " + (5*i));
        }
    }
}
