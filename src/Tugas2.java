import java.util.Scanner;

public class Tugas2 {
    //Method untuk menjumlahkan dua angka
    public static int tambah(int a, int b) {
        return a + b;
    }
    public static int kurang(int a, int b){
        return a - b;
    }
    public static int kali(int a, int b ){
        return a * b;
    }
    public static double bagi(int a, int b){
        if (b == 0 ) {
            System.out.printf("Angka nol tidak bisa di bagi");
            return 0;
        }
        return(double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner (System.in);
        System.out.printf("Masukan angka pertama tidak boleh kosong: ");
        int angka1 = scanner.nextInt();

        System.out.printf("Masukan angka kedua tidak boleh kosong ya: ");
        int angka2 = scanner.nextInt();


        System.out.printf("Hasil penjumlahan"+ tambah(angka1,angka2));
        System.out.printf("Hasil pengurangan"+ kurang(angka1,angka2));
        System.out.printf("Hasil perkalian"+ kali(angka1,angka2));
        System.out.printf("Hasil pembagian"+ bagi(angka1,angka2));



        scanner.close();

    }
}
