import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka1, angka2, angka3;
        int terkecil;

        System.out.println("Program Menentukan Bilangan Terkecil dari Tiga Angka");

        System.out.print("Masukkan angka pertama: ");
        angka1 = sc.nextInt();

        System.out.print("Masukkan angka kedua: ");
        angka2 = sc.nextInt();

        System.out.print("Masukkan angka ketiga: ");
        angka3 = sc.nextInt();

        terkecil = angka1;
        if (angka2 < terkecil) {
            terkecil = angka2;
        }
        if (angka3 < terkecil) {
            terkecil = angka3;
        }

        int sama = 0;

        if (angka1 == terkecil) sama++;
        if (angka2 == terkecil) sama++;
        if (angka3 == terkecil) sama++;

        System.out.println("----------------------------");
        if (sama > 1) {
            System.out.print("Ada beberapa angka terkecil, yaitu: ");
            if (angka1 == terkecil) System.out.print(angka1 + " ");
            if (angka2 == terkecil && angka2 != angka1) System.out.print(angka2 + " ");
            if (angka3 == terkecil && angka3 != angka2) System.out.print(angka3 + " ");
            System.out.println();
        } else {
            System.out.println("Angka terkecil adalah: " + terkecil);
        }

        sc.close();
    }
}
