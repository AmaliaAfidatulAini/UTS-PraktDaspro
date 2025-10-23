import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double omzet;
        int rating;
        String sertifikasi;

        System.out.print("Masukkan omzet (Rp): ");
        omzet = input.nextDouble();
        System.out.print("Masukkan rating (1-100): ");
        rating = input.nextInt();
        System.out.print("Apakah memiliki sertifikasi (ya/tidak): ");
        sertifikasi = input.next();
        System.out.println();

        if (omzet < 0 || rating < 1 || rating > 100) {
            System.out.println("Input tidak valid! Omzet harus ≥ 0 dan rating 1-100.");
        } else {
            double persenKomisi = 0;
            double bonusSertifikasi = 0;
            double totalKomisi;

            if (rating < 70) {
                persenKomisi = 0;
            } else {
                if (omzet < 50000000) {
                    persenKomisi = 1;
                } else if (omzet < 100000000) {
                    persenKomisi = 2;
                } else {
                    persenKomisi = 3;
                }

                if (rating >= 90) {
                    persenKomisi += 1;
                }

                if (sertifikasi.equalsIgnoreCase("ya")) {
                    bonusSertifikasi = 500000;
                }
            }

            double jumlahKomisi = (persenKomisi / 100) * omzet;
            totalKomisi = jumlahKomisi + bonusSertifikasi;

            System.out.println("--- Rincian Komisi Penjualan ---");
            System.out.println("Omzet             : Rp " + omzet);
            System.out.println("Rating            : " + rating);
            System.out.println("Sertifikasi       : " + sertifikasi);
            System.out.println("Persentase Komisi : " + persenKomisi + "%");
            System.out.println("Jumlah Komisi     : Rp " + jumlahKomisi);
            System.out.println("Bonus Sertifikasi : Rp " + bonusSertifikasi);
            System.out.println("Total Komisi      : Rp " + totalKomisi);
        }
    }
}
