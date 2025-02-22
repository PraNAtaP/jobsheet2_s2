public class MataKuliahMain19 {
    public static void main(String[] args) {
        MataKuliah19 matkul1 = new MataKuliah19();
        matkul1.kodeMK  = "SIB242002";
        matkul1.nama    = "Analisis Proses Bisnis";
        matkul1.sks     = 2;
        matkul1.jumlahJam = 3;
        matkul1.tampilInformasi();

        matkul1.ubahSKS(3);
        matkul1.tambahJam(1);

        matkul1.tampilInformasi();

        MataKuliah19 matkul2 = new MataKuliah19("SIB748695", "Praktikum Basis Data", 2, 6);
        matkul2.kurangiJam(15);
        matkul2.tampilInformasi();

        MataKuliah19 matkul3 = new MataKuliah19("SIB3458321", "PSI", 2, 6);
        matkul3.kurangiJam(2);
        matkul3.tampilInformasi();
    }
}