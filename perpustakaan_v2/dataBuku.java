package perpustakaan_v2;  

public class dataBuku {
    
    public String[][] bukuTeknologi;
    public String[][] bukuFilsafat;
    public String[][] bukuSejarah;
    public String[][] bukuAgama;
    public String[][] bukuPsikologi;
    public String[][] bukuPolitik;
    public String[][] bukuFiksi;

    public dataBuku(){

    bukuTeknologi = new String[][] {

        {"Media Sosial dalam Society 5.0", "Wahyu Mahesa Miarta", "189", "2024", "Ruang Karya", "Media sosial ketika dalam society versi 5.0 yang kemudian mengalami hal yang tak terduga."},
        {"Data-Driven Entrepreneur", "Ivan Diryana Sudirman", "288", "2023", "Salemba Empat", "Cara menjadi entrepeneur yang menaiki mobil yang dikendarai oleh sebuah data."},
        {"Sistem Peringatan Dini Banjir Berbasis IOT", "Nur Khayati", "102", "2023", "Cipta Prima Nusantara", "Dengan ini, anda bisa mendeteksi banjir sebelum menenggelamkan lantai kesayangan anda."},
        {"Teknik Kecerdasan Artifisial Dalam Sistem Tenaga Listrik", "Azriyenni", "164", "2023", "Taman Karya", "Penerapan kecerdasan AI untuk bekerja sehingga manusia tinggal santai saja."},
        {"Rekayasa Perangkat Lunak", "Kholiq Budiman", "176", "2023", "Pustaka Rumah C1nta", "Politik saja bisa direkayasa, masa perangkat lunak tidak? Rugi dong"},
        
    };

    bukuFilsafat = new String[][] {

        {"Paradigma Nusantara", "Aji Dedi Mulawarman", "153", "2022", "Peneleh", "Buku ini berat, tidak usah dibaca, nanti kamu bingung sendiri."},
        {"Tuhan Yang Berpikir : Sebuah Risalah Metafisika", "Dedy Ibmar", "170", "2020", "Pustaka Obor Indonesia", "Buku ini juga berat, tidak usah dibaca, nanti kamu bingung sendiri, tapi terserahlah."},
        {"Bunga Rampai Hukum dan Filsafat di Indonesia", "Santhos Wachjoe Prijambodo", "89", "2018", "Deepublish", "Buku ini tidak tau, saya belum pernah baca, mungkin berbicara tentang bunga."},
        {"Dasar-Dasar Filsafat Islam", "Ali Mahdi Khan", "159", "2017", "Nuansa Cendekia", "Judulnya mudah dipahami tapi isinya tidak, sebaiknya makan dulu sebelum baca."},
        {"Etika dan Asketika ilmu", "Achmad Charris Zubair", "224", "2015", "Nuansa Cendekia", "Berisi etika dan asketika ilmu, bukan estetika, karena estetika itu seni."},
        
    };

    bukuSejarah = new String[][] {

        {"Kewargaan Pascakolonial di Indonesia", "Gerry van Klinken", "290", "2023", "Pustaka Obor Indonesia", "Berisi bagaimana hidup spesies homo sapiens di Indonesia setelah kedatangan spesies homo sapiens dari negara kolonial."},
        {"Melawan Lupa: Fragmen-Fragmen Sejarah Cilacap", "Thomas Sutasman", "104", "2022", "Jejak Pustaka", "Setelah membaca ini, saya baru tau ternyata lupa bisa dilawan, padahal dia tidak nyerang."},
        {"Ziarah Sejarah : Mereka yang Dilupakan", "Hamid Nabhan", "230", "2022", "Garudhawaca", "Kita harus ingat sejarah, tapi yang baik-baik saja, agar tidak terbawa mimpi buruk."},
        {"Madiun 1948 PKI Bergerak", "Harry A. Poeze", "444", "2020", "Pustaka Obor Indonesia", "Sedih jika membaca buku ini, tapi mau bagaimana lagi, kita hanya bisa mengenang dan mengingat."},
        {"Kehidupan Prasejarah; Indonesia Dan Dunia", "Tri Budiantara", "168", "2018", "Istana Media", "Berisi bagaimana hidup spesies homo sapiens di Indonesia ketika belum mengenal Instagram, bahkan jauh sebelum itu."},
        
    };

    bukuAgama = new String[][] {

        {"Ilmu Pendidikan Islam", "Munardji dan Sukarji", "149", "2024", "Garudhawaca", "Wajib dipahami seluruh umat Islam, karena kalau tidak paham, kita akan bingung."},
        {"Kajian Dasar Praktik Fikih Ibadah", "Muhammad Sholeh Hasan", "142", "2023", "Publica Indonesia Utama", "Buku ini sepaket sama yang di atas, kalo yang di atas teorinya, kalo ini prakteknya."},
        {"Indahnya Kesabaran", "Abdullah Gymnastiar", "81", "2023", "MQS Publishing", "Suka tidak sabar kalau sudah lapar, solusinya ya makan agar agar."},
        {"Tuntunan Puasa Ramadhan", "Aan Alamsyah", "39", "2023", "Ruang Karya", "Sebuah tuntunan agar motor tidak berbelok sendiri ke warteg saat siang hari di bulan puasa."},
        {"Work Pray Balance", "Dinar Rafikhalif", "147", "2023", "Cipta Prima Nusantara", "Cara menjaga keseimbangan agar tidak jatuh, yaitu dengan cara berdoa semoga tidak jatuh."},
        
    };

    bukuPsikologi = new String[][] {

        {"Pertanyaan-Pertanyaan Masa Depan", "Yuhesti Mora", "102", "2023", "Media Cendekia Muslim", "Kalau anda orang yang overthinking, lebih baik tidak usah baca buku ini."},
        {"Berpikir Kritis dan Kreatif", "Neli Rahmaniah dan Anna Maria Oktaviani ", "229", "2023", "Publica Indonesia Utama", "Buku cara berpikir kreatif dan kritis ini ditulis dengan asal dan apa adanya."},
        {"Jeda Terbaik di Dunia", "Nurasiyah", "106", "2023", "Ruang Karya", "Jeda apakah itu? Tidak tau kan? Makanya ayo baca buku ini."},
        {"Key Of Happiness", "Husni Mubarok", "276", "2023", "KMO Indonesia", "Kunci kebahagiaan sebenarnya adalah uang, bohong kalau orang bilang bukan itu."},
        {"Gender dalam Perspektif Psikologi", "Haris Herdiansyah", "248", "2016", "Salemba Empat", "Sebenarnya sederhana, gender cuma ada laki-laki dan perempuan, entah kenapa orang meribetkan hal itu."},
        
    };

    bukuPolitik = new String[][] {

        {"Nasionalisme dan Egalitarianisme di Indonesia, 1908-1980", "Mochtar Pabottingi", "600", "2023", "Pustaka Obor Indonesia", "Isinya sesuai judul, masa tidak percaya? Ya sudah kalau tidak percaya."},
        {"Pancasila Dasar Negara", "Soekarno", "193", "2023", "UGM Press", "Pancasila dasar negara, rakyat adil makmur sentosa, pribadi bangsaku, ayo maju maju."},
        {"DPR dan Defisit Demokrasi", "Poltak Partogi Nainggolan dan Riris Katharina", "691", "2022", "Pustaka Obor Indonesia", "Tidak perlu ditanyakan lagi, pemerintah memang seperti itu, kita hanya bisa menghela napas."},
        {"Whole Of Government", "Iswan Achmadi dan Eko Hariadi", "119", "2022", "MNC Publishing", "Judulnya pakai bahasa inggris, saya jadi bingung karena saya orang Indonesia."},
        {"Kudeta Militer di Myanmar Dalam Perspektif Hukum Internasional", "Farid Pardamean Putra Irawan", "66", "2021", "Pustaka Rumah C1nta", "Kenapa perlu ada kudeta? Tidak bisakah kita hidup tenang tenang saja?"},
        
    };

    bukuFiksi = new String[][] {

        {"Rumah", "M. Gilang Pamungkas", "100", "2023", "Media Cendekia Muslim", "Rumah, rumah, rumah, rumah, rumah, rumah, rumah, rumah, rumah, dan rumah."},
        {"Ujung Sebuah Lingkaran", "Zahida Aliatu Zain", "106", "2023", "Ruang Karya", "Lingkaran tidak punya ujung, buku ini saja yang ngawur, tapi terserah kalau anda mau baca."},
        {"Anak-Anak Kampung", "Mujiana A. Kadir", "227", "2023", "Cipta Prima Nusantara", "Kenapa harus dibeda bedakan? Bukankah semua anak itu sama? Tentu saja beda, kalau sama, kita bebas tidur di rumah siapa saja."},
        {"Tukang Tambal Ban Pergi Haji", "Rosidi", "83", "2023", "Cipta Prima Nusantara", "Sebuah kisah seorang tukang tambal ban yang bisa pergi haji, bukan umroh, tapi haji."},
        {"Aku Bingung Mengerjakan Tugas Coding Ini", "Muhammad Haikal A F", "696", "2024", "Cetak Sendiri", "Ini buku original pertama saya, wajib dibeli karena berpahala sebab menyenangkan hati sesama manusia."},
        
    };

    }

    public String getData(int kodeBuku) {
        String data = "";
        
        switch (kodeBuku) {
            case 1:
                data = "\nKategori: Buku Teknologi\n";
                data += "========================\n";
                for (String[] buku : bukuTeknologi) {
                    data += "Judul: " + buku[0] + "\n";
                    data += "Pengarang: " + buku[1] + "\n";
                    data += "Jumlah Halaman: " + buku[2] + "\n";
                    data += "Tahun Terbit: " + buku[3] + "\n";
                    data += "Penerbit: " + buku[4] + "\n";
                    data += "Sinopsis: " + buku[5] + "\n\n";
                    data += "Jumlah Kata Pada Sinopsis : " + hitungKata(buku[5]) + " kata" + "\n\n";
                }
                break;

            case 2:
                data = "Kategori: Buku Filsafat\n";
                data += "========================\n";
                for (String[] buku : bukuFilsafat) {
                    data += "Judul: " + buku[0] + "\n";
                    data += "Pengarang: " + buku[1] + "\n";
                    data += "Jumlah Halaman: " + buku[2] + "\n";
                    data += "Tahun Terbit: " + buku[3] + "\n";
                    data += "Penerbit: " + buku[4] + "\n";
                    data += "Sinopsis: " + buku[5] + "\n\n";
                    data += "Jumlah Kata Pada Sinopsis : " + hitungKata(buku[5]) + " kata" + "\n\n";
                }
                break;

            case 3:
                data = "Kategori: Buku Sejarah\n";
                data += "========================\n";
                for (String[] buku : bukuSejarah) {
                    data += "Judul: " + buku[0] + "\n";
                    data += "Pengarang: " + buku[1] + "\n";
                    data += "Jumlah Halaman: " + buku[2] + "\n";
                    data += "Tahun Terbit: " + buku[3] + "\n";
                    data += "Penerbit: " + buku[4] + "\n";
                    data += "Sinopsis: " + buku[5] + "\n\n";
                    data += "Jumlah Kata Pada Sinopsis : " + hitungKata(buku[5]) + " kata" + "\n\n";
                }
                break;

            case 4:
                data = "Kategori : Buku Agama\n";
                data += "========================\n";
                for (String[] buku : bukuAgama) {
                    data += "Judul: " + buku[0] + "\n";
                    data += "Pengarang: " + buku[1] + "\n";
                    data += "Jumlah Halaman: " + buku[2] + "\n";
                    data += "Tahun Terbit: " + buku[3] + "\n";
                    data += "Penerbit: " + buku[4] + "\n";
                    data += "Sinopsis: " + buku[5] + "\n\n";
                    data += "Jumlah Kata Pada Sinopsis : " + hitungKata(buku[5]) + " kata" + "\n\n";
                }
                break;
        
            case 5:
                data = "Kategori : Buku Psikologi\n";
                data += "========================\n";
                for (String[] buku : bukuPsikologi) {
                    data += "Judul: " + buku[0] + "\n";
                    data += "Pengarang: " + buku[1] + "\n";
                    data += "Jumlah Halaman: " + buku[2] + "\n";
                    data += "Tahun Terbit: " + buku[3] + "\n";
                    data += "Penerbit: " + buku[4] + "\n";
                    data += "Sinopsis: " + buku[5] + "\n\n";
                    data += "Jumlah Kata Pada Sinopsis : " + hitungKata(buku[5]) + " kata" + "\n\n";
                }
                break;
            
            case 6:
                data = "Kategori : Buku Politik\n";
                data += "========================\n";
                for (String[] buku : bukuPolitik) {
                    data += "Judul: " + buku[0] + "\n";
                    data += "Pengarang: " + buku[1] + "\n";
                    data += "Jumlah Halaman: " + buku[2] + "\n";
                    data += "Tahun Terbit: " + buku[3] + "\n";
                    data += "Penerbit: " + buku[4] + "\n";
                    data += "Sinopsis: " + buku[5] + "\n\n";
                    data += "Jumlah Kata Pada Sinopsis : " + hitungKata(buku[5]) + " kata" + "\n\n";
                }
                break;

            case 7:
                data = "Kategori : Buku Fiksi\n";
                data += "========================\n";
                for (String[] buku : bukuFiksi) {
                    data += "Judul: " + buku[0] + "\n";
                    data += "Pengarang: " + buku[1] + "\n";
                    data += "Jumlah Halaman: " + buku[2] + "\n";
                    data += "Tahun Terbit: " + buku[3] + "\n";
                    data += "Penerbit: " + buku[4] + "\n";
                    data += "Sinopsis: " + buku[5] + "\n\n";
                    data += "Jumlah Kata Pada Sinopsis : " + hitungKata(buku[5]) + " kata" + "\n\n";
                }
                break;

            default:
                data = "Kode invalid, silahkan masukkan kode yang benar (1 - 7)";
                break;
        }
        
        return data;
    }

    public int hitungKata(String sinopsis) {
    
        String[] banyakKata = sinopsis.split("\\s+");
        return banyakKata.length;

    }
    
} 
