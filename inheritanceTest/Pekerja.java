package inheritanceTest;
import java.time.LocalDate;

public class Pekerja extends Manusia {

    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahunMasuk, int bulanMasuk, int tanggalMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.tahunMasuk = LocalDate.of(tahunMasuk, bulanMasuk, tanggalMasuk);
        this.jumlahAnak=jumlahAnak;
        this.gaji = gaji;
    }

    public void setGaji(double gaji) { 
        this.gaji = gaji; 
    }
    public double getGaji() { 
        return gaji; 
    }
    public void setTahunMasuk(LocalDate tahunMasuk) { 
        this.tahunMasuk = tahunMasuk; 
    }
    public LocalDate getTahunMasuk() { 
        return tahunMasuk; 
    }

    public void setJumlahAnak(int jumlahAnak) { 
        this.jumlahAnak = jumlahAnak; 
    }
    public int getJumlahAnak() { 
        return jumlahAnak; 
    }

    public double getBonus() {
        int tahunBekerja = LocalDate.now().getYear() - tahunMasuk.getYear();

        double bonus = 0;
        if (tahunBekerja <= 5 && tahunBekerja >= 0) {
            return gaji * 0.05;
        } else if (tahunBekerja <= 10) {
            return gaji * 0.10;
        } else if (tahunBekerja > 10){
            return gaji * 0.15;
        } else {
            return 0;
        }
    }

    public double getPendapatan() {
        return super.getPendapatan() + getGaji() + getBonus() + (getJumlahAnak() * 20);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTahun Masuk\t: " + tahunMasuk.getYear() + "\nJumlah Anak\t: " + jumlahAnak + "\nGaji\t\t: " + getGaji();
    }

}
