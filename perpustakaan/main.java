package perpustakaan;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
        dataBuku data = new dataBuku();
        Scanner scn = new Scanner(System.in);
        int kodeBuku;

        System.out.println("Perpustakaan Universitas University");
        System.out.println("Database Inventaris Buku");
        System.out.println("====================================");
        System.out.println("Kategori buku :\n1) Teknologi\n2) Filsafat\n3) Sejarah\n4) Agama\n5) Psikologi\n6) Politik\n7) Fiksi");
        System.out.println();
        System.out.print("Silahkan masukkan nomor kategori buku yang anda cari : ");

        kodeBuku = scn.nextInt();

        String dataBuku = data.getData(kodeBuku);
            System.out.println(dataBuku);
        }

}
