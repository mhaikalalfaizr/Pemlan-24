package inheritanceTest;
import java.time.LocalDate;

public class Main {
    
    public static void main(String[] args) {
        
        Manusia lakiLakiMenikah = new Manusia("Akbar Faisal", "4348339700295696", true, true);
        Manusia perempuanMenikah = new Manusia("Anita Maxwin", "3451245829438160", false, true);
        Manusia belumMenikahKasihan = new Manusia("Jones Sujono", "7274439684305611", true, false);

        MahasiswaFILKOM mahasiswaIPKKurang = new MahasiswaFILKOM("23515040011023", 2.99, "Gibran Wahyumarsing Wahyu", "5629585540919624", true, false);
        MahasiswaFILKOM mahasiswaIPKSedang = new MahasiswaFILKOM("23515040011023", 3.01, "Slamet Dunia Akhirat", "6239336918498517", true, false);
        MahasiswaFILKOM mahasiswaIPKTinggi = new MahasiswaFILKOM("23515040011023", 3.99, "Riska Cuekyawati", "3723075310973055", false, false);

        Pekerja pekerjaBaru = new Pekerja(800, 2022, 4, 20, 2, "Slamet Kopling", "1296944159894951", true, true);
        Pekerja pekerjaSedang = new Pekerja(3000, 2015, 4, 20, 0, "Samsul Arip", "7732522589323362", true, false);
        Pekerja pekerjaSepuh = new Pekerja(10000, 2004, 4, 20, 10, "Gogon Tunjang", "7814339655602808", true, true);

        Manager bos = new Manager("Kebersihan", 7500, 2009, 4, 20, 0, "Don Don", "9824699178391424", true, false);


        System.out.println("=== Manusia ===");
        System.out.println(lakiLakiMenikah + "\n---\n" + perempuanMenikah + "\n---\n" + belumMenikahKasihan + "\n");

        System.out.println("=== Mahasiswa FILKOM ===");
        System.out.println(mahasiswaIPKKurang + "\n---\n" + mahasiswaIPKSedang + "\n---\n" + mahasiswaIPKTinggi + "\n");

        System.out.println("=== Pekerja ===");
        System.out.println(pekerjaBaru + "\n---\n" + pekerjaSedang + "\n---\n" + pekerjaSepuh + "\n");

        System.out.println("=== Manager ===");
        System.out.println(bos);
        
    }

}
