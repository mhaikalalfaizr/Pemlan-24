package polymorphismTest;

class KuePesanan extends Kue {
    
    private double berat;

    public KuePesanan(String nama, double harga, double berat){
        super(nama, harga);
        this.berat = berat;
    }

    @Override
    public double hitungHarga(){
        return harga * berat;
    }

    public double getBerat(){
        return this.berat;
    }

}
