/**
 * Nama                 : Khaerul Adzkia Alamsyah
 * Nim                  : 23176005
 * Prodi                : Sistem Informasi / Semester 3
 * Mata Kuliah          : PBO 1 / Pertemuan 6 / Latihan 17 - Program Tunjangan
 * Deskripsi Program    : Menghitung total gaji seseorang berdasarkan gaji pokok dan status pernikahan.
                          Jika status pengguna adalah "Menikah", program akan menambahkan tunjangan
                          sebesar 35% dari gaji pokok ke dalam total gaji.
 * @author
 **/
package pertemuan.pkg6;
import java.util.Scanner;
public class Latihan17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input gaji pokok
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        // Input status menikah
        System.out.print("Status Anda? (Menikah/Belum): ");
        String statusMenikah = scanner.nextLine();

        // Menghitung tunjangan
        double tunjangan = 0;
        if (statusMenikah.equalsIgnoreCase("Menikah")) {
            tunjangan = 0.35 * gajiPokok;
        }

        // Menghitung total gaji
        double totalGaji = gajiPokok + tunjangan;

        // Output hasil
        System.out.println("==========Hasil Perhitungan Gaji Anda==========");
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
        System.out.println("Tunjangan  : Rp " + tunjangan);
        System.out.println("Total Gaji : Rp " + totalGaji);
        System.out.println("(Developed by : Khaerul Adzkia Alamsyah)");

        scanner.close();
    }
}

    



