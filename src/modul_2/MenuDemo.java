package modul_2;
import java.util.Scanner;

public class MenuDemo {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);

        System.out.println("=== MENU PILIHAN ===");
        System.out.println("1. hitung luas persegi");
        System.out.println("2. hitung luas lingkaran");
        System.out.println("3. hitung luas lingkaran");
        System.out.println("4.keluar");

        System.out.print("pilihan menu(1-4): ");
        int pilihan =input.nextInt();

        switch (pilihan){
            case 1:
                System.out.print("masukkan sisi persegi:");
                double sisi =input.nextDouble();
                double luaspersegi=sisi + sisi;
                System.out.println("luas persegi:" + luaspersegi);
                break;

            case 2:
                System.out.print("masukkan jari-jari lingkaran:");
                double jarijari =input.nextDouble();
                double luaslingkaran=Math.PI * jarijari * jarijari;
                System.out.println("luas lingkaran:" + luaslingkaran);
                break;

            case 3:
                System.out.print("masukkan alas segitiga:");
                double alas =input.nextDouble();
                System.out.print("masukkan tinggi segitiga:");
                double tinggi=input.nextDouble();
                double luassegitiga=0.5 * alas *tinggi;
                System.out.println("luas segitiga:" + luassegitiga);
                break;

            case 4:
                System.out.println("Terima kasih");
                break;

            default:
                System.out.println("pilihan tidak valid");
        }
        input.close();
    }
}
