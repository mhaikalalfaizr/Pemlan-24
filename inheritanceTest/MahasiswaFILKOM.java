package inheritanceTest;

public class MahasiswaFILKOM extends Manusia {

        private String nim;
        private double ipk;

        public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
            super(nama, nik, jenisKelamin, menikah);
            this.nim = nim;
            this.ipk = ipk;
        }
    
        public void setNIM(String nim) { 
            this.nim = nim; 
        }

        public String getNIM(){ 
            return nim; 
        }

        public void setIPK(double ipk) { 
            this.ipk = ipk; 
        }
        public double getIPK(){ 
            return ipk; 
        }

        public String getStatus() {
            String angkatan = "20" + (nim.substring(0, 2));
            String prodi;
            switch(nim.substring(6, 7)) {
                case "2":
                    prodi = "Teknik Infomatika";
                    break;
                case "3":
                    prodi = "Teknik Komputer";
                    break;
                case "4":
                    prodi = "Sistem Informasi";
                    break;
                case "6":
                    prodi = "Pendidikan Teknologi Informasi";
                    break;
                case "7":
                    prodi = "Teknologi Informasi";
                    break;
                default:
                    prodi = "";
            }
            return prodi + ", " + angkatan;
        }
          
        public double getBeasiswa() {
            if (ipk >= 3.0 && ipk < 3.5) {
                return 50;
            } else if (ipk >= 3.5 && ipk <= 4) {
                return 75;
            } else {
                return 0;
            }
        }
    
        @Override
        public String toString() {
            return super.toString() + "\nNIM\t\t: " + nim + "\nIPK\t\t: " + ipk + "\nStatus\t\t: " + getStatus();
        }

}
