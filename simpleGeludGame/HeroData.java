package simpleGeludGame;

public class HeroData {
    
    private String namaKarakter;
    private double healthPoint;
    private double poinSerangan;
    private double poinPertahanan;
    private double serang;

    public HeroData(){
    }

    public HeroData(String namaKarakter, double healthPoint, double poinSerangan, double poinPertahanan){
        this.namaKarakter = namaKarakter;
        this.healthPoint = healthPoint;
        this.poinSerangan = poinSerangan;
        this.poinPertahanan = poinPertahanan;
    }

    public void setNama(String namaKarakter){
        this.namaKarakter = namaKarakter;
    }

    public String getNama(){
        return namaKarakter;
    }

    public void setHP(double healthPoint){
        this.healthPoint = healthPoint;
    }

    public double getHP(){
        return healthPoint;
    }

    public void setSerangan(double poinSerangan){
        this.poinSerangan = poinSerangan;
    }

    public double getSerangan(){
        return poinSerangan;
    }

    public void setPertahanan(double poinPertahanan){
        this.poinPertahanan = poinPertahanan;
    }

    public double getPertahanan(){
        return poinPertahanan;
    }

    public void serang(HeroData hero) {
        double damage = this.poinSerangan - hero.poinPertahanan;
        if (damage < 0) {
            damage = 0;
        }
        hero.healthPoint -= damage;
    
        if (hero.healthPoint < 0){
            hero.healthPoint = 0;
        }
    }

}
