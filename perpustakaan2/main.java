package perpustakaan2;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        dataBuku data = new dataBuku();
        String dataBuku;
        int kodeBuku;
        String konfirmasiKeluar;

        do {
            System.out.println("Perpustakaan Universitas University");
            System.out.println("Database Inventaris Buku");
            System.out.println("====================================");
            System.out.println("Kategori buku :\n1) Teknologi\n2) Filsafat\n3) Sejarah\n4) Agama\n5) Psikologi\n6) Politik\n7) Fiksi");
            System.out.println();
            System.out.print("Silahkan masukkan nomor kategori buku yang anda cari : ");

            kodeBuku = scn.nextInt();

            dataBuku = data.getData(kodeBuku);
                System.out.println(dataBuku);
            
            System.out.println("Apakah anda ingin mencari kategori lain lagi? (Ya / Tidak)");
            konfirmasiKeluar = scn.next();

        } while(konfirmasiKeluar.equalsIgnoreCase("ya"));
            if (konfirmasiKeluar.equalsIgnoreCase("tidak")) {
                System.out.println("oh gt, ok ywd.");
            }

        }

}
