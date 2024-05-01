package polymorphismTest;

abstract class Kue {
    
    protected String nama;
    protected double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungHarga();

    @Override
    public String toString(){
        return "Nama Kue \t: " + this.nama + "\nHarga \t\t: Rp. " + this.harga;
    }

}