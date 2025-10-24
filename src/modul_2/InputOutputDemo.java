package modul_2;
import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        //membuat objek scanner
        Scanner input = new Scanner(System.in);

        //membuat input string
        System.out.print("masukkan nama anda: ");
        String nama=input.nextLine();

        //membaca input integer
        System.out.print("masukkan umur anda: ");
        int umur=input.nextInt();

        //membaca input double
        System.out.print("masukkan tinggi anda (cm): ");
        double tinggi = input.nextDouble();

        //menampilkan output
        System.out.println("\n=== DATA ANDA ===");
        System.out.println("Nama :" + nama);
        System.out.println("Umur :" + umur + "tahun");
        System.out.println("Tinggi :" + tinggi + "cm");

        //menutup Scanner
        input.close();
    }
}
