package perpustakaan_v1;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        dataBuku data = new dataBuku();
        String dataBuku;
        int kodeBuku;

        System.out.println("Perpustakaan Universitas University");
        System.out.println("Database Inventaris Buku");
        System.out.println("====================================");
        System.out.println("Kategori buku :\n1) Teknologi\n2) Filsafat\n3) Sejarah\n4) Agama\n5) Psikologi\n6) Politik\n7) Fiksi");
        System.out.println();
        System.out.print("Silahkan masukkan nomor kategori buku yang anda cari : ");

        kodeBuku = scn.nextInt();

        dataBuku = data.getData(kodeBuku);
            System.out.println(dataBuku);
        }

}
