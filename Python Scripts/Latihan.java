import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        float hargaAwal, jumlahBarang, diskon, hasil;

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Harga Awal ");
        hargaAwal = scan.nextFloat();
        System.out.println("Masukkan Diskon% ");
        diskon = scan.nextFloat();
        System.out.println("Masukkan Jumlah Barang ");
        jumlahBarang = scan.nextFloat();


        hasil = (hargaAwal-(hargaAwal*diskon/100))*jumlahBarang;
        System.out.println("Harga Akhir Adalah :" +hasil);

    }
}
