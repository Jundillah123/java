import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("**Pilih Di Bawah Sini**\n");

        System.out.printf("**Type Motor** \n1.Kawasaki \n2.Honda\n");
        int Hasil = scanner.nextInt();
        switch (Hasil) {
            case 1:
                System.out.printf("**Type Mesin Kawasaki** \n1.Manual\n2.Metic\n");
                int Manualkawasaki = scanner.nextInt();

                switch (Manualkawasaki) {
                    case 1:
                        System.out.printf("**Type Mesin Kawasaki Manual** \n1.klx\n2.Ninja SS\n3.Ninja RR\n");
                        int detailKawasaki = scanner.nextInt();
                        switch (detailKawasaki) {
                            case 1:
                                System.out.printf("**Detail**\nType Motor: Kawasaki\nType Mesin: Manual\nType Mesin Kawasaki Manual: Klx\nHarga: RP.34.000.000.000-,");
                                break;
                            case 2:
                                System.out.printf("**Detail**\nType Motor: Kawasaki\nType Mesin: Manual\nType Mesin Kawasaki Manual: Ninja SS\nHarga: RP.40.000.000.000-,");
                                break;
                            case 3:
                                System.out.printf("**Detail**\nType Motor: Kawasaki\nType Mesin: Manual\nType Mesin Kawasaki Manual: Ninja RR\nHarga: RP.35.000.000.000-,");
                                break;
                        }break;
                    case 2:
                        System.out.printf("Maaf Kawasaki Tidak! Mengeluarkan Type Mesin Matic");
                        break;

                        }break;
            case 2:
                System.out.printf("**Type Mesin Honda** \n1.Manual\n2.Metic\n");
                int ManualHonda = scanner.nextInt();
                switch (ManualHonda) {
                    case 1:
                    System.out.printf("**Type Mesin Honda Manual** \n1.Supra X\n2.Revo\n3.Blade\n");
                    int detailHonda =scanner.nextInt();
                    switch (detailHonda) {
                        case 1:
                            System.out.printf("**Detail**\nType Motor: Honda\nType Mesin: Manual\nType Mesin Honda Manual: Supra X\nHarga: RP.12.000.000.000-,");
                            break;
                        case 2:
                            System.out.printf("**Detail**\nType Motor: Honda\nType Mesin: Manual\nType Mesin Honda Manual: Revo\nHarga: RP.15.000.000.000-,");
                            break;
                        case 3:
                            System.out.printf("**Detail**\nType Motor: Honda\nType Mesin: Manual\nType Mesin Honda Manual: blade\nHarga: RP.18.000.000.000-,");
                            break;
                    }break;
                    case 2:
                        System.out.printf("**Type Mesin Honda Metic** \n1.Beat\n2.Vario\n3.Scoopy\n");
                        int MeticHonda = scanner.nextInt();
                        switch (MeticHonda) {
                            case 1:
                                System.out.printf("**Detail**\nType Motor: Honda\nType Mesin: Metic\nType Mesin Honda Metic Beat\nHarga: RP.17.000.000.000-,");
                                break;
                            case 2:
                                System.out.printf("**Detail**\nType Motor: Honda\nType Mesin: Meticl\nType Mesin Honda Metic: Vario\nHarga: RP.20.000.000.000-,");
                                break;
                            case 3:
                                System.out.printf("**Detail**\nType Motor: Honda\nType Mesin: Meticl\nType Mesin Honda Metic: Vario\nHarga: RP.22.000.000.000-,");
                                break;
                        }break;
                }
                break;
        }

        }
    }

