package modul_2;
public class VariabelDemo {
    public static void main(String[] args) {
        //deklarasi dan inisialisasi variabel
        int umur = 20;
        double tinggi = 175.5;
        char grade = 'A';
        boolean lulus = true;
        String nama = "john doe";

        //menampilkan nilai variabel
        System.out.println("Nama    :" + nama);
        System.out.println("Umur    :" + umur);
        System.out.println("Tinggi  :" + tinggi);
        System.out.println("Grade   :" + grade);
        System.out.println("Lulus   :" + lulus);

        int a = 10;
        int b = 3;

        System.out.println("\n=== Operasi Aritmatika ===");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("a + b :" + (a + b));
        System.out.println("a + b :" + (a - b));
        System.out.println("a + b :" + (a * b));
        System.out.println("a + b :" + (a / b));
        System.out.println("a + b :" + (a % b));

        System.out.println("\n=== Casting Tipe Data");
        double nilaiDouble = 9.8;
        int nilaiInt = (int) nilaiDouble;

        System.out.println("nilai double:" + nilaiDouble);
        System.out.println("setelah casting ke int:" + nilaiInt);

        //automatic promotion
        byte byteVar = 50;
        short shortVar = 100;
        int hasil = byteVar + shortVar;
        System.out.println("byte + short =" + hasil + "(tipe: int)");
    }
}
