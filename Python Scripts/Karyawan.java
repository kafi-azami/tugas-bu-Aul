import java.util.Scanner;
public class Karyawan {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Jumlah jam Kerja: ");
        int jamKerja = scan.nextInt();

        System.out.println("Tarif per jam: ");
        int tarifPerjam = scan.nextInt();

        int gajiAwal = jamKerja *tarifPerjam;
        double potonganPajak = gajiAwal * 0.10;
        double gajiBersih = gajiAwal - potonganPajak;

        System.out.println("Gaji Awal: "+ gajiAwal);
        System.out.println("Potongan Pajak: "+ potonganPajak);
        System.out.println("Gaji bersih: "+ gajiBersih);

    }
}
