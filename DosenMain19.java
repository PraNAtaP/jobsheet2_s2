public class DosenMain19
 {
    public static void main(String[] args) {
        Dosen19
         dosen1 = new Dosen19();
        dosen1.idDosen = "WKWK01";
        dosen1.nama = "Pranata Putrandana S.Tr.S.I.B M.Kom";
        dosen1.bidangKeahlian = "Cyber Security";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2030;
        dosen1.tampilInformasi();

        dosen1.ubahKeahlian("Artificial Intelligence");
        dosen1.tampilInformasi();
        
        Dosen19
         dosen2 = new Dosen19
        ("WKWK02", "Dimas Adit Thalia Putra S.Tr.S.I.B. M.T", "Software Development", true, 2031);
        dosen2.tampilInformasi();
        
        Dosen19
         dosen3 = new Dosen19
        ("WKWK03", "Yosep Bima Aprillian S.Tr.S.I.B. M.Kom", "Data Science", true, 2032);
        dosen3.tampilInformasi();

        dosen3.setStatusAktif(false);
        dosen3.tampilInformasi();

        int tahunSekarang = 2039;
        System.out.println(dosen1.nama + " memiliki masa kerja " + dosen1.hitungMasaKerja(tahunSekarang) + " tahun.");
        System.out.println(dosen2.nama + " memiliki masa kerja " + dosen2.hitungMasaKerja(tahunSekarang) + " tahun.");
        System.out.println(dosen3.nama + " memiliki masa kerja " + dosen3.hitungMasaKerja(tahunSekarang) + " tahun.");
    }
}