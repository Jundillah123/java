import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Masukan angka : ");
        int ini= scanner.nextInt();


        if (ini % 2==0) {
            System.out.printf(ini + "ini angka genap.");
        } else  {
            System.out.printf(ini + " ini angka ganjil. ");
        scanner.close();
        }
    }
}
