package simpleGeludGame;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("===============================================" +
        "\nSimple Gelud Game" +
        "\nSebuah game battle sederhana antara 2 karakter." +
        "\n===============================================\n");

        HeroData hero1 = new HeroData();

        System.out.println("Player 1 : Silahkan masukkan data hero anda!" + 
                            "\n(Untuk bagian HP, Serangan dan Pertahanan, masukkan angka antara 0 - 500)"+ 
                            "\n------------------------------------------------------------------------");

        System.out.print("Nama Hero\t\t: ");
        hero1.setNama(scn.nextLine());
        System.out.print("Health Point\t\t: ");
        hero1.setHP(scn.nextDouble());
        System.out.print("Kemampuan Serangan\t: ");
        hero1.setSerangan(scn.nextDouble());
        scn.nextLine();
        System.out.print("Kemampuan Pertahanan\t: ");
        hero1.setPertahanan(scn.nextDouble());
        scn.nextLine();

        System.out.println();

        System.out.println("Player 2 : Silahkan masukkan data hero anda!" + 
                            "\n(Untuk bagian HP, Serangan dan Pertahanan, masukkan angka antara 0 - 500)"+ 
                            "\n------------------------------------------------------------------------");
        
        System.out.print("Nama Hero\t\t: ");
        String namaHero2 = scn.next();
        System.out.print("Health Point\t\t: ");
        double hpHero2 = scn.nextDouble();
        System.out.print("Kemampuan Serangan\t: ");
        double seranganHero2 = scn.nextDouble();
        scn.nextLine();
        System.out.print("Kemampuan Pertahanan\t: ");
        double pertahananHero2 = scn.nextDouble();
        scn.nextLine();

        HeroData hero2 = new HeroData(namaHero2, hpHero2, seranganHero2, pertahananHero2);

        int ronde = 1;
        while (hero1.getHP() > 0 && hero2.getHP() > 0) {

            System.out.println("============================================================");
            System.out.println("Ronde " + ronde + "\n");
        
            hero1.serang(hero2);
            System.out.println(hero1.getNama() + " menyerang " + hero2.getNama() + "\n");

            System.out.println(hero1.getNama() + " menyerang sebesar " + hero1.getSerangan());
            System.out.println(hero2.getNama() + " memiliki pertahanan sebesar " + hero2.getPertahanan());
            System.out.println("HP " + hero2.getNama() + " saat ini " + hero2.getHP() + "\n");

            hero2.serang(hero1);
            System.out.println(hero2.getNama() + " menyerang " + hero1.getNama() + "\n");

            System.out.println(hero2.getNama() + " menyerang sebesar " + hero2.getSerangan());
            System.out.println(hero1.getNama() + " memiliki pertahanan sebesar " + hero1.getPertahanan());
            System.out.println("HP " + hero1.getNama() + " saat ini " + hero1.getHP());
            System.out.println("============================================================");

            ronde++;

        }

        if (hero1.getHP() <= 0) {
            System.out.println("\nGelud telah selesai!");
            System.out.println(hero1.getNama() + " telah kalah!");
            System.out.println("================================================");
            System.out.println(hero2.getNama() + " adalah pemenangnya. Congrats!");
        } else if (hero2.getHP() <= 0){
            System.out.println("\nGelud telah selesai!");
            System.out.println(hero2.getNama() + " telah kalah!");
            System.out.println("================================================");
            System.out.println(hero1.getNama() + " adalah pemenangnya. Congrats!");
        }

    }

}
