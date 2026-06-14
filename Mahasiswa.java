// Class Mahasiswa - terpisah dari Main class
public class Mahasiswa {

    // Atribut private (enkapsulasi)
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    // Constructor untuk menginisialisasi data mahasiswa
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama    = nama;
        this.nim     = nim;
        this.jurusan = jurusan;
        this.ipk     = ipk;
    }

    // Getter methods
    public String getNama()    { return nama; }
    public String getNim()     { return nim; }
    public String getJurusan() { return jurusan; }
    public double getIpk()     { return ipk; }

    // Setter untuk ipk
    public void setIpk(double ipk) { this.ipk = ipk; }

    // Method menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: "    + nama);
        System.out.println("NIM: "     + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: "     + ipk);
    }

    // Method cekKelulusan - IPK >= 3.00 Lulus, < 3.00 Belum Lulus
    public void cekKelulusan() {
        if (ipk >= 3.00) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Belum Lulus");
        }
    }

    // Method updateIpk - memperbarui IPK mahasiswa
    public void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
    }
}