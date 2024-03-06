package perpustakaan;

public class dataBuku {
    
    public String[][] bukuTeknologi = {

        {"Media Sosial dalam Society 5.0", "Wahyu Mahesa Miarta", "189", "2024", "Ruang Karya"},
        {"Data-Driven Entrepreneur", "Ivan Diryana Sudirman", "288", "2023", "Salemba Empat"},
        {"Sistem Peringatan Dini Banjir Berbasis IOT", "Nur Khayati", "102", "2023", "Cipta Prima Nusantara"},
        {"Teknik Kecerdasan Artifisial Dalam Sistem Tenaga Listrik", "Azriyenni", "164", "2023", "Taman Karya"},
        {"Rekayasa Perangkat Lunak", "Kholiq Budiman", "176", "2023", "Pustaka Rumah C1nta"},
        
    };

    public String[][] bukuFilsafat = {

        {"Paradigma Nusantara", "Aji Dedi Mulawarman", "153", "2022", "Peneleh"},
        {"Tuhan Yang Berpikir : Sebuah Risalah Metafisika", "Dedy Ibmar", "170", "2020", "Pustaka Obor Indonesia"},
        {"Bunga Rampai Hukum dan Filsafat di Indonesia", "Santhos Wachjoe Prijambodo", "89", "2018", "Deepublish"},
        {"Dasar-Dasar Filsafat Islam", "Ali Mahdi Khan", "159", "2017", "Nuansa Cendekia"},
        {"Etika dan Asketika ilmu", "Achmad Charris Zubair", "224", "2015", "Nuansa Cendekia"},
        
    };

    public String[][] bukuSejarah = {

        {"Kewargaan Pascakolonial di Indonesia", "Gerry van Klinken", "290", "2023", "Pustaka Obor Indonesia"},
        {"Melawan Lupa: Fragmen-Fragmen Sejarah Cilacap", "Thomas Sutasman", "104", "2022", "Jejak Pustaka"},
        {"Ziarah Sejarah : Mereka yang Dilupakan", "Hamid Nabhan", "230", "2022", "Garudhawaca"},
        {"Madiun 1948 PKI Bergerak", "Harry A. Poeze", "444", "2020", "Pustaka Obor Indonesia"},
        {"Kehidupan Prasejarah; Indonesia Dan Dunia", "Tri Budiantara", "168", "2018", "Istana Media"},
        
    };

    public String[][] bukuAgama = {

        {"Ilmu Pendidikan Islam", "Munardji dan Sukarji", "149", "2024", "Garudhawaca"},
        {"Kajian Dasar Praktik Fikih Ibadah", "Muhammad Sholeh Hasan", "142", "2023", "Publica Indonesia Utama"},
        {"Indahnya Kesabaran", "Abdullah Gymnastiar", "81", "2023", "MQS Publishing"},
        {"Tuntunan Puasa Ramadhan", "Aan Alamsyah", "39", "2023", "Ruang Karya"},
        {"Work Pray Balance", "Dinar Rafikhalif", "147", "2023", "Cipta Prima Nusantara"},
        
    };

    public String[][] bukuPsikologi = {

        {"Pertanyaan-Pertanyaan Masa Depan", "Yuhesti Mora", "102", "2023", "Media Cendekia Muslim"},
        {"Berpikir Kritis dan Kreatif", "Neli Rahmaniah dan Anna Maria Oktaviani ", "229", "2023", "Publica Indonesia Utama"},
        {"Jeda Terbaik di Dunia", "Nurasiyah", "106", "2023", "Ruang Karya"},
        {"Key Of Happiness", "Husni Mubarok", "276", "2023", "KMO Indonesia"},
        {"Gender dalam Perspektif Psikologi", "Haris Herdiansyah", "248", "2016", "Salemba Empat"},
        
    };

    public String[][] bukuPolitik = {

        {"Nasionalisme dan Egalitarianisme di Indonesia, 1908-1980", "Mochtar Pabottingi", "600", "2023", "Pustaka Obor Indonesia"},
        {"Pancasila Dasar Negara", "Soekarno", "193", "2023", "UGM Press"},
        {"DPR dan Defisit Demokrasi", "Poltak Partogi Nainggolan dan Riris Katharina", "691", "2022", "Pustaka Obor Indonesia"},
        {"Whole Of Government", "Iswan Achmadi dan Eko Hariadi", "119", "2022", "MNC Publishing"},
        {"Kudeta Militer di Myanmar Dalam Perspektif Hukum Internasional", "Farid Pardamean Putra Irawan", "66", "2021", "Pustaka Rumah C1nta"},
        
    };

    public String[][] bukuFiksi = {

        {"Rumah", "M. Gilang Pamungkas", "100", "2023", "Media Cendekia Muslim"},
        {"Ujung Sebuah Lingkaran", "Zahida Aliatu Zain", "106", "2023", "Ruang Karya"},
        {"Anak-Anak Kampung", "Mujiana A. Kadir", "227", "2023", "Cipta Prima Nusantara"},
        {"Tukang Tambal Ban Pergi Haji", "Rosidi", "83", "2023", "Cipta Prima Nusantara"},
        {"Aku Bingung Mengerjakan Tugas Coding Ini", "Muhammad Haikal A F", "696", "2024", "Cetak Sendiri"},
        
    };

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
                    data += "Penerbit: " + buku[4] + "\n\n";
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
                    data += "Penerbit: " + buku[4] + "\n\n";
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
                    data += "Penerbit: " + buku[4] + "\n\n";
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
                    data += "Penerbit: " + buku[4] + "\n\n";
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
                    data += "Penerbit: " + buku[4] + "\n\n";
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
                    data += "Penerbit: " + buku[4] + "\n\n";
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
                    data += "Penerbit: " + buku[4] + "\n\n";
                }
                break;

            default:
                data = "Kode invalid, silahkan masukkan kode yang benar (1 - 7)";
                break;
        }
        
        return data;
    }

}
