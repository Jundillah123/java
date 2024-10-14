import java.util.Scanner;

public class MotorSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("**Pilih Di Bawah Sini**\n");
        System.out.printf("**Type Motor** \n1. Kawasaki \n2. Honda\n");
        int motorChoice = scanner.nextInt();

        String motorType = (motorChoice == 1) ? "Kawasaki" : "Honda";
        String mesinType = "";
        String detailType = "";
        String harga = "";

        if (motorChoice == 1) { // Kawasaki
            System.out.printf("**Type Mesin Kawasaki** \n1. Manual\n2. Metic\n");
            int mesinChoice = scanner.nextInt();

            if (mesinChoice == 1) { // Manual
                System.out.printf("**Type Mesin Kawasaki Manual** \n1. Klx\n2. Ninja SS\n3. Ninja RR\n");
                int detailChoice = scanner.nextInt();
                switch (detailChoice) {
                    case 1: detailType = "Klx"; harga = "RP.34.000.000.000,-"; break;
                    case 2: detailType = "Ninja SS"; harga = "RP.40.000.000.000,-"; break;
                    case 3: detailType = "Ninja RR"; harga = "RP.35.000.000.000,-"; break;
                }
                mesinType = "Manual";
            } else {
                System.out.printf("Maaf, Kawasaki tidak mengeluarkan Type Mesin Matic");
                return; // Menghentikan program
            }
        } else { // Honda
            System.out.printf("**Type Mesin Honda** \n1. Manual\n2. Metic\n");
            int mesinChoice = scanner.nextInt();

            if (mesinChoice == 1) { // Manual
                System.out.printf("**Type Mesin Honda Manual** \n1. Supra X\n2. Revo\n3. Blade\n");
                int detailChoice = scanner.nextInt();
                switch (detailChoice) {
                    case 1: detailType = "Supra X"; harga = "RP.12.000.000.000,-"; break;
                    case 2: detailType = "Revo"; harga = "RP.15.000.000.000,-"; break;
                    case 3: detailType = "Blade"; harga = "RP.18.000.000.000,-"; break;
                }
                mesinType = "Manual";
            } else { // Metic
                System.out.printf("**Type Mesin Honda Metic** \n1. Beat\n2. Vario\n3. Scoopy\n");
                int detailChoice = scanner.nextInt();
                switch (detailChoice) {
                    case 1: detailType = "Beat"; harga = "RP.17.000.000.000,-"; break;
                    case 2: detailType = "Vario"; harga = "RP.20.000.000.000,-"; break;
                    case 3: detailType = "Scoopy"; harga = "RP.22.000.000.000,-"; break;
                }
                mesinType = "Metic";
            }
        }

        // Output detail
        System.out.printf("**Detail**\nType Motor: %s\nType Mesin: %s\nType Mesin %s: %s\nHarga: %s",
                motorType, mesinType, motorType, detailType, harga);

        scanner.close();
    }
}
