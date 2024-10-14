import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Membuat Akun Awal
        System.out.println("Berapa banyak jumlah pelanggan yang anda ingin masukan?...");
        int n =scanner.nextInt();
        BangDetail C[]=new BangDetail[n];
        for (int i = 0; i< C.length; i++){
            C[i] = new BangDetail();
            C[i].openAcunt();
        }
        //Pengulangan Berjaln sampai angka 5 tidak di tekan untuk keluar
        int ch;
        do {
            System.out.println("\n***Aplikasi Sistem Perbangka***\n");
            System.out.println("1.Tampilkan Semua Akun \n 2.Cari Berdasarkan Nomor Rekening\n 3.Setor Tunai\n 4.Tarik Tunai\n 5.Keluar");
            System.out.println("Masukan Pilihan Anda");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < C.length; i++){
                        C[i].showAkun();
                    }
                    break;
                case 2:
                    System.out.print("Masukan Nomber Rekening Yang Anda Cari: ");
                    String ac_no = scanner.next();
                    boolean found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].serch(ac_no);
                        if (found) {
                            break;
                        }
                    } if (!found) {
                    System.out.println("Pencarian gagal !! Akun Tidak Di Ketahui..!!");
                }break;
                case 3:
                    System.out.print("Masukan Nomor Rekening: ");
                    ac_no=scanner.next();
                    found = false;
                    for (int i = 0; i < C.length;i++){
                        found =C[i].serch(ac_no);
                        if (found){
                            C[i].deposit();
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Pencairan gagal!Akun tidak ada!!");
                    }
                    break;
                case 4:
                    System.out.print("Masukan Nomer Rekening");
                    ac_no=scanner.next();
                    found = false;
                    for (int i = 0; i<C.length;i++){
                        found = C[i].serch(ac_no);
                        if (found){
                            C[i].penarikan();
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Pencarian Gagal Akun Tidak Di ketahui!!");
                    }
                    break;
                case 5:
                    System.out.println("Sampai Jumpa Kembali");
                    break;

            }
        }
        while (ch!=5);
    }
}
