import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int usia;
        double hr;

        System.out.print("Masukkan usia (tahun): ");
        usia = input.nextInt();

        System.out.print("Masukkan HR saat latihan (denyut/menit): ");
        hr = input.nextDouble();

        if (usia < 10 || usia > 100 || hr <= 0) {
            System.out.println("\nInput tidak valid! Usia harus antara 10-100 dan HR harus positif.");
        } else {
            double mhr = 220 - usia;
            double persenMHR = (hr / mhr) * 100;
            int persenBulat = (int) Math.round(persenMHR);

            String kategori, saran;

            if (persenMHR < 50) {
                kategori = "Sangat ringan";
                saran = "Pemanasan, manfaat minimal.";
            } else if (persenMHR < 60) {
                kategori = "Ringan";
                saran = "Peningkatan dasar kebugaran.";
            } else if (persenMHR < 70) {
                kategori = "Sedang";
                saran = "Zona aerobik nyaman.";
            } else if (persenMHR <= 85) {
                kategori = "Kuat";
                saran = "Meningkatkan kapasitas kardiorespirasi.";
            } else {
                kategori = "Sangat berat";
                saran = "Berisiko bagi pemula, batasi durasi.";
            }

            System.out.println("\n--- Hasil Evaluasi ---");
            System.out.println("MHR        : " + mhr);
            System.out.println("%MHR       : " + persenBulat + "%");
            System.out.println("Kategori   : " + kategori);
            System.out.println("Saran      : " + saran);
        }
    }
}
