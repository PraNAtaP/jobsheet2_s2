public class MataKuliah19 {
    String kodeMK, nama;
    int sks, jumlahJam;

    public MataKuliah19() {

    }

    public MataKuliah19(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("\n=== Informasi Mata Kuliah ===");
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("=============================");
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS mata kuliah " + nama + " diubah menjadi " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam untuk mata kuliah " + nama + " berhasil ditambah, jumlah jam sekarang : " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam matkul " + nama + " berhasil dikurangi, jumlah jam sekarang : " + jumlahJam);
        } else {
            System.out.println("Pengurangan Jam gagal, jumlah jam tidak cukup.");
        }
    }
}