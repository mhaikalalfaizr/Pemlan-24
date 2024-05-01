package polymorphismTest;

public class main {
    public static void main(String[] args) {
        
        Kue[] kumpulanKue = new Kue[20];

        kumpulanKue[0] = new KuePesanan("Nastar", 50000, 1);
        kumpulanKue[1] = new KuePesanan("Bika Ambon", 55000, 1);
        kumpulanKue[2] = new KuePesanan("Putri Salju", 40000, 1);
        kumpulanKue[3] = new KuePesanan("Lidah Kucing", 45000, 1);
        kumpulanKue[4] = new KuePesanan("Kue Lapis", 60000, 1);
        kumpulanKue[5] = new KuePesanan("Asmara Spikoe", 99999, 1);
        kumpulanKue[6] = new KuePesanan("Kue Lumpur", 5000, 1);
        kumpulanKue[7] = new KuePesanan("Rangi", 2500, 1);
        kumpulanKue[8] = new KuePesanan("Kue Cucur", 10000, 1);
        kumpulanKue[9] = new KuePesanan("Wajik", 5000, 1);

        kumpulanKue[10] = new KueJadi("Onde-Onde", 2000, 2);
        kumpulanKue[11] = new KueJadi("Dadar Gulung", 2000, 7);
        kumpulanKue[12] = new KueJadi("Putu Ayu", 1000, 5);
        kumpulanKue[13] = new KueJadi("Getuk", 1500, 9);
        kumpulanKue[14] = new KueJadi("Apem", 1500, 3);
        kumpulanKue[15] = new KueJadi("Nagasari", 1000, 2);
        kumpulanKue[16] = new KueJadi("Cenil", 1500, 1);
        kumpulanKue[17] = new KueJadi("Klepon", 2000, 1);
        kumpulanKue[18] = new KueJadi("Ongol-Ongol", 2000, 4);
        kumpulanKue[19] = new KueJadi("Serabi", 5000, 6);

        System.out.println("\t=== Daftar Kue ===\n");

        for (int i = 0; i < 20; i++){
            if (i < 10) {
                System.out.println(kumpulanKue[i].toString() +
                                    "\nJenis Kue\t: Kue Pesanan\n");
            }
            else if (i >= 10) {
                System.out.println(kumpulanKue[i].toString() +
                                    "\nJenis Kue\t: Kue Jadi\n");
            }
        }

        System.out.println("==================================================\n");

        double totalHarga = 0;
        for (int i = 0; i < 20; i++){
            totalHarga += kumpulanKue[i].hitungHarga();
        }

        double totalHargaKueP = 0;
        double totalBeratKueP = 0;
        for (int i = 0; i < 10; i++){
            if (kumpulanKue[i] instanceof KuePesanan) {
                KuePesanan kueP = (KuePesanan) kumpulanKue[i];
                totalHargaKueP += kueP.hitungHarga();
                totalBeratKueP += kueP.getBerat();
            }
        }

        double totalHargaKueJ = 0;
        double totalJumlahKueJ = 0;
        for (int i = 10; i < 20; i++){
            if (kumpulanKue[i] instanceof KueJadi) {
                KueJadi kueJ = (KueJadi) kumpulanKue[i];
                totalHargaKueJ += kueJ.hitungHarga();
                totalJumlahKueJ += kueJ.getJumlah();
            }
        }

        Kue kueTermahal = null;
        double hargaTertinggi = 0;
        for (int i = 0; i < 20; i++) {
            if (kumpulanKue[i].hitungHarga() > hargaTertinggi) {
                hargaTertinggi = kumpulanKue[i].hitungHarga();
                kueTermahal = kumpulanKue[i];
            }
        }

        System.out.println("Total harga semua jenis kue\t: Rp. " + totalHarga);
        System.out.println("\nTotal harga kue pesanan\t\t: Rp. " + totalHargaKueP +
                            "\nTotal berat kue pesanan\t\t: " + totalBeratKueP + " kg");
        System.out.println("\nTotal harga kue jadi\t\t: Rp. " + totalHargaKueJ +
                            "\nTotal jumlah kue jadi\t\t: " + totalJumlahKueJ);
        System.out.println("\n==================================================\n");
        System.out.println("Kue dengan harga akhir terbesar :\n" + kueTermahal.toString() + "\nJenis Kue\t: " + kueTermahal.getClass().getSimpleName());

    }
}
