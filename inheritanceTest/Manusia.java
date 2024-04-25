package inheritanceTest;
import java.time.LocalDate;

public class Manusia {
    
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama,  String nik, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
        }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setJenisKelamin(boolean jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }

    public boolean getJenisKelamin(){
        return jenisKelamin;
    }

    public void setNIK(String nik){
        this.nik = nik;
    }

    public String getNIK(){
        return nik;
    }

    public void setMenikah(boolean menikah){
        this.menikah = menikah;
    }

    public boolean getMenikah(){
        return menikah;
    }
    
    public double getTunjangan(){
        if (menikah) {
            return jenisKelamin ? 25 : 20;
        } else {
            return 15;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        return "Nama\t\t: " + nama + "\nNIK\t\t: " + nik + "\nJenis Kelamin\t: " + (jenisKelamin ? "Laki-laki" : "Perempuan") + "\nPendapatan\t: " + getPendapatan();
    }

}
