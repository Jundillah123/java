import java.util.InputMismatchException;
import java.util.Scanner;

public class BangDetail {
    private String akun;
    private String nama;
    private String type_akun;
    private long balance;
    Scanner scanner = new Scanner(System.in);

    //Metode untuk membuka akun baru

    public void openAcunt() {
        System.out.print("Masukan Nomer Rekening:");
        akun = scanner.next();
        System.out.print("Masukan Akun:");
        type_akun = scanner.next();
        System.out.println("Masukan Nama:");
        nama = scanner.next();
        System.out.println("Masukan Balance:");
        balance = scanner.nextLong();
    }

    //Metode Untuk Menampilkan Akun
    public void showAkun() {
        System.out.println("Nama pengguna:" + nama);
        System.out.println("Nomber Rekening Pengguna:" + akun);
        System.out.println("Akun Pengguna:" + type_akun);
        System.out.println("Balance:" + balance);
    }

    //Metode Untuk Menyetor Uang
    public void deposit() {
        long amt;
        System.out.println("Masukan Jumlah Yang ingin Di setor:");
        amt = scanner.nextLong();
        balance = balance + amt;
    }

    //Metode Penarikan Uang
    public void penarikan() {
        long amt;
        System.out.println("Masukan Jumlah Yang Ingin Di Tarik");
        try {
            amt= scanner.nextLong();
            //Validasi
            if (amt <=0) {
                System.out.printf("Jumlah penarikan harus lebih besar dari 0.");
                return;
            }
            if (balance >= amt) {
                balance = balance - amt;
                System.out.printf("Sisa Saldo: "+ balance);
            }else {
                System.out.printf("Saldo Anda Kurang Dari" + amt + "\t Transakasi Gagal!!!");
            }
        }catch (InputMismatchException e) {
            System.out.printf("Input tidak valid. Harap masukan angka.");
            scanner.next();
        }
//        amt = scanner.nextLong();
//        if (balance >= amt) {
//            balance = balance - amt;
//            System.out.println("Sisa Saldo" + balance);
//        } else {
//            System.out.println("Saldo anda kurang dari" + amt + "\t Transaksi Gagal..!");
//        }
    }

    //Metode Untuk Mencari Akun
    public boolean serch(String ac_no){
        if (akun.equals(ac_no)) {
            showAkun();
            return (true);
        }
        return (false);
    }
}
