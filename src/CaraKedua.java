import java.util.Scanner;

public class CaraKedua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("KalkulatorSederhana");

        System.out.println("Masukan Angka Pertama:");
        double angka4 = scanner.nextDouble();

        System.out.println(" Pilih operasi:");
        System.out.println("1. pertambahan");
        System.out.println("2. pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. pembagian");
        int Scanner = scanner.nextInt();

        System.out.println("Masukan Angka Kedua:");
        double angka5 = scanner.nextDouble();





        double result;
        switch (Scanner) {
            case 1:
                result = angka4+ angka5;
                System.out.println("pertambahan:" + result);
                break;
            case 2:
                result = angka4 - angka5;
                System.out.println("pengurangan:" + result);
                break;
            case 3:
                result = angka4 * angka5;
                System.out.println("perkalian:" + result );
                break;
            case 4:
                result = angka4  / angka5;
                System.out.println("pembagian" + result);

                if (result !=0) {
                    result = angka4 / angka5;
                    System.out.println("Hasil pembagian" + result);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;

            default:
                System.out.println( "Pilihan tidak valid.");
                scanner.close();
        }
    }
}