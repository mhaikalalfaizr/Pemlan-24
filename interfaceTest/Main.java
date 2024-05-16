package interfaceTest;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan nomor registrasi pegawai\t: ");
        int registrationNumber = scn.nextInt();
        scn.nextLine();

        System.out.print("Masukkan nama pegawai\t\t\t: ");
        String name = scn.nextLine();

        System.out.print("Masukkan gaji pegawai per bulan\t\t: ");
        int salaryPerMonth = scn.nextInt();
        scn.nextLine();

        System.out.print("\n=== [KOPERASI KARYAWAN] ===");
        System.out.print("\nMasukkan jumlah barang\t\t\t: ");
        int stuffCount = scn.nextInt();
        scn.nextLine();

        Invoice[] invoices = new Invoice[stuffCount];

        for(int i = 0; i < stuffCount; i++){
            System.out.print("\n=====================" +
                            "\nInvoice " + (i + 1) +
                            "\n=====================" +
                            "\nMasukkan nama barang\t: ");

            String productName = scn.nextLine();

            System.out.print("\nMasukkan jumlah barang\t: ");
            int quantity = scn.nextInt();
            scn.nextLine();

            System.out.print("\nMasukkan Harga Barang\t: ");
            int pricePerItem = scn.nextInt();
            scn.nextLine();

            invoices[i] = new Invoice(productName, quantity, pricePerItem);
        }

        Employee pegawai = new Employee(registrationNumber, name, salaryPerMonth, invoices);

        pegawai.employeeDetail();
        System.out.println();
        pegawai.invoiceDetail();
        System.out.println("\nTotal Gaji Setelah dikurangi Tagihan : Rp. " + pegawai.getFinalSalary());

    }
    
}
