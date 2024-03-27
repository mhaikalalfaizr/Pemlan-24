package tugas01;

import java.util.Scanner;

public class vet_v_2_0 {
    
    public static void main(String[] args) {
       
        Scanner scn = new Scanner(System.in);
        Harimau harimau1 = new Harimau();

        System.out.println("======================");
        System.out.println("Vet v2.0"); 
        System.out.println("by mhaikal2112"); 
        System.out.println("======================");    


        System.out.print("Apakah ID Harimau anda? ");
        harimau1.id = scn.nextLine();
        System.out.print("Siapakah nama harimau anda? ");
        harimau1.nama = scn.nextLine();
        System.out.print("Tahun berapa dia dilahirkan? ");
        harimau1.tahunLahir = scn.nextInt();

        System.out.println();

        System.out.println("Selamat datang " + harimau1.nama +  " di Vet v2.0.");
        System.out.println("Tahun ini " + harimau1.nama + " telah berumur " + (2024 - harimau1.tahunLahir) + " tahun.");

        System.out.println("Ingin mengaum? (y/t)"); 
        String jawaban = scn.next();

        if (jawaban.equals("y")) {
            harimau1.rawr();
        } else if (jawaban.equals("t")){
            System.out.println("Baik, tidak apa. Mungkin lain kali.");
        }

        System.out.println("Terima kasih telah menggunakan sistem ini.");

    }

}
