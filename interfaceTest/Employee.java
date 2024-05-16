package interfaceTest;

public class Employee implements Payable {
    
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices){
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices =  invoices;
    }

    double payableAmount = 0;

    @Override
    public double getPayableAmount(){
        for(Invoice invoice : invoices){
            payableAmount += invoice.getPayableAmount();
        }
        return payableAmount;
    }

    public double getFinalSalary() {
        return salaryPerMonth - getPayableAmount();
    }

    public void invoiceDetail(){
        System.out.println("=== Struk Tagihan Belanja ===");
        double totalHarga = 0;
        for(Invoice invoice : invoices){
            totalHarga += invoice.getPayableAmount();
            System.out.println("Produk\t\t: " + invoice.productName + 
                                "\nJumlah\t\t: " + invoice.quantity +
                                "\nHarga\t\t: Rp. " + invoice.pricePerItem +
                                "\nTotal Harga\t: Rp. " + invoice.getPayableAmount());
        }
        System.out.println("\nTotal Harga Seluruh Barang\t: Rp. " + totalHarga);
    }

    public void employeeDetail(){
        System.out.println("=== Info Pegawai ===" +
                            "\nNomor Registrasi\t: " + registrationNumber +
                            "\nNama\t\t\t: " + name +
                            "\nGaji per Bulan\t\t: Rp. " + salaryPerMonth);
    }
    
}
