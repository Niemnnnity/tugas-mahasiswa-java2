import java.util.Scanner;

// Main class - terpisah dari class Mahasiswa
public class Main {

    public static void main(String[] args) {

        // Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Array untuk menyimpan 5 objek Mahasiswa
        Mahasiswa[] daftar = new Mahasiswa[5];

        // Mengisi array dengan data mahasiswa
        daftar[0] = new Mahasiswa("Arif Pratama",    "667894312", "Teknik Industri",    3.50);
        daftar[1] = new Mahasiswa("Amy Wong",        "663498115", "Manajemen",          4.00);
        daftar[2] = new Mahasiswa("Kiel Wijaya",     "669987231", "Teknik Kimia",       3.85);
        daftar[3] = new Mahasiswa("Leon Sinaga",     "661134598", "Sastra Inggris",     3.60);
        daftar[4] = new Mahasiswa("Charlotte Winata","662357138", "Teknik Informatika", 4.00);

        // Menampilkan seluruh data menggunakan loop
        System.out.println("=== Data Mahasiswa ===\n");
        for (int i = 0; i < daftar.length; i++) {
            daftar[i].tampilkanInfo();
            daftar[i].cekKelulusan();
            System.out.println();
        }

        // Input NIM mahasiswa yang ingin diupdate
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String nimCari = scanner.nextLine();

        // Input IPK baru
        System.out.print("Masukkan IPK baru: ");
        double ipkBaru = scanner.nextDouble();

        // Cari mahasiswa berdasarkan NIM dan update IPK
        boolean ditemukan = false;
        for (int i = 0; i < daftar.length; i++) {
            if (daftar[i].getNim().equals(nimCari)) {
                daftar[i].updateIpk(ipkBaru);
                ditemukan = true;
                System.out.println("Data berhasil diperbarui!\n");

                // Tampilkan data mahasiswa yang diupdate
                System.out.println("=== Data Mahasiswa ===");
                daftar[i].tampilkanInfo();
                daftar[i].cekKelulusan();
                break;
            }
        }

        // Jika NIM tidak ditemukan
        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan!");
        }

        scanner.close();
    }
}