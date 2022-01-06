package com.frn.penyediaanobat;

import android.os.Bundle;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.frn.penyediaanobat.adapter.PenyakitAdapter;
import com.frn.penyediaanobat.model.Penyakit;

import java.util.ArrayList;
import java.util.List;

public class ActivityPenyakit extends AppCompatActivity implements SearchView.OnQueryTextListener {
    private PenyakitAdapter penyakitAdapter;
    private RecyclerView rvPenyakit;
    private SearchView svSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit);

        svSearch = findViewById(R.id.pcari);
        svSearch.setOnQueryTextListener(this);

        List<Penyakit> penyakitList = new ArrayList<>();
        penyakitList.add(new Penyakit("Agranulositosis", "Agranulositosis adalah sebuah kondisi langka dimana sumsum tulang tidak memproduksi sel darah putih tertentu, yaitu neutrofil. Neutrofil adalah tipe sel darah putih yang dibutuhkan oleh tubuh untuk melawan infeksi. Jumlah neutrofil paling banyak dibandingkan jenis sel darah putih yang lain."+
                "\n"+
                "Pada agranulositosis, kadar atau jumlah sel darah putih (neutrofil) yang rendah dapat mengakibatkan infeksi ringan menjadi infeksi yang serius. Kuman yang biasanya tidak membahayakan akhirnya dapat menyerang pertahanan tubuh.",
                "Demam mendadak", "Sakit tenggorokan", "Kelemahan pada tangan", "Sakit mulut dan gusi", "Gusi berdarah",
                "Denyut jantung cepat", "Nafas cepat", "Tekanan darah rendah", "Sariawan", "Abses kulit",
                "Jika agranulositosis disebabkan oleh penyakit yang mendasarinya, maka kondisi tersebut harus ditangani terlebih dahulu. Jika obat yang diperlukan untuk kondisi lain menyebabkan agranulositosis, dokter akan meresepkan pengobatan pengganti. Dokter dapat meresepkan antibiotik atau obat antijamur untuk mengobati infeksi. Perawatan yang disebut faktor penstimulasi koloni dapat digunakan untuk beberapa kasus, seperti pasien yang mendapatkan agranulositosis dari kemoterapi.",
                "Satu-satunya cara untuk mencegah agranulositosis adalah dengan menghindari konsumsi obat-obatan yang menyebabkannya. Dokter akan merekomendasikan untuk berhenti mengonsumsi obat penyebab.",
                R.drawable.p_agranulositosis));
        penyakitList.add(new Penyakit("Alergi Sengatan Lebah", "Alergi sengatan lebah adalah reaksi alergi yang disebabkan oleh racun dari lebah yang masuk ke tubuh melalui gigitannya.\n"+
                "Pada kondisi normal, sengatan lebah tidak menyebabkan reaksi serius. Namun bagi orang yang memiliki alergi (terhadap sengatan lebah atau jenis lain) atau mengalami beberapa kali sengatan lebah, efek yang parah bisa terjadi.\n"+
                "Sengatan lebah dapat menyebabkan reaksi yang parah seperti keracunan atau alergi berat (anafilaksis). Keracunan lebah juga disebut keracunan apitoksin atau keracunan virus apis. Apitoksin dan virus apis merupakan nama lain dari racun yang dihasilkan oleh sengatan lebah.\n"+
                "Sengatan lebah yang hanya menimbulkan eluhan ringan bisa dtangani dengan mengurangi sakit. Langkah ini bisa dilakukan secara mandiri di rumah.Namun orang yang menunjukkan reaksi alergi ketika disengat lebah, \n"+
                "harus segera mendapatkan perawatan medis darurat untuk mencegah komplikasi yang tidak diinginkan.",
                "Rasa sakit atau gatal di lokasi sengatan", "Bekas putih di tempat sengatan", "Kemerahan dan sedikit bengkak di sekitar sengatan", "Kulit memerah atau pucat", "Pembengkakan saluran tenggorokan, wajah, dan bibir",
                "Mual dan muntah", "Kesulitan bernapas atau menelan", "Penurunan tekanan darah", "Kehilangan kesadaran", "Sakit perut",
                "Jika seseorang membutuhkan pengobatan alergi sengatan lebah, dokter atau perawat akan segera memantau tanda-tanda vital pasien yang meliputi:\b \n" +
                        "Denyut nadi\n" +
                        "Tingkat pernapasan\n" +
                        "Tekanan darah\n" +
                        "Suhu tubuh\n" +
                        "\n"+
                        "Dokter juga akan melakukan cara mengobati alsegi sengatan lebah dengan cara:\b \n" +
                        "1.Menempelkan kompres dingin atau air es\n" +
                        "2.Memberikan obat pereda nyeri seperti paracetamol\n" +
                        "3.Memberikan obat antihistamin dan krim steroid untuk meredakan rasa gatal serta bengkak\n" +
                        "4.Harap diingat pula bahwa Anda tidak boleh memencet sengat lebah yang tertinggal di kulit. Sengat ini sebaiknya segera dicabut dengan pinset. ",
                "5.Beberapa cara mencegah alergi sengatan lebah yang dapat Anda lakukan meliputi:\n" +
                        "6.Jangan memukul sarang serangga\n" +
                        "7.Sebisa mungkin, pakai baju berlengan panjang dan celana panjang saat keluar rumah\n" +
                        "8.Jangan panik, dan menjauhlah dengan tenang jika melihat lebah yang sedang terbang\n" +
                        "9.Hindari pakaian bermotif bunga atau berwarna cerah saat beraktivitas di luar ruangan\n" +
                        "10.Simpan semua sampah di luar rumah dalam tempat tertutup\n" +
                        "11.Tutup jendela kendaraan saat mengemudi",
                R.drawable.p_alergi_lebah));
        penyakitList.add(new Penyakit("Cacar Air", "Cacar air adalah penyakit yang terjadi karena infeksi virus varicella zoster. Gejalanya berupa munculnya bintil-bintil merah berisi cairan pada kulit.\n"+
                "Pada kasus dewasa, gejala cacar air umumnya lebih berat daripada cacar air yang dialami oleh anak-anak. Pada kasus tertentu, penyakit ini juga mungkin mengakibatkan komplikasi yang serius.\n"+
                "Penyakit cacar air sangat menular, terutama pada orang yang belum pernah mengalaminya atau belum menjalani vaksinasi.\n"+
                "Sebelum adanya vaksin cacar air, hampir semua orang pernah terkena cacar air sebelum berumur 18 tahun. Namun sejak adanya vaksin, jumlah kasus cacar air menurun drastis.\n"+
                "Vaksin cacar air termasuk aman untuk dijalani dan sangat efektif untuk mencegah cacar air maupun komplikasinya. Karena itu, semua prang dianjurkan untuk mendapatkan vaksin ini.",
                "Ruam", "bintil-bintil merah di kulit", "Demam di atas 38ºC", "Gatal-gatal", "Pegal-pegal",
                "Tidak nafsu makan", "", "", "", "",
                "Sama seperti infeksi virus pada umumnya, cacar air bisa sembuh sendiri dengan isitrahat yang cukup. Doker dapat menganjurkan beberapa cara mengobati cacar air di bawah ini untuk mempercepat penyembuhan:\b \n" +
                        "1.Minum banyak cairan untuk mencegah dehidrasi.\n" +
                        "2.Jangan menggaruk ruam meski terasa gatal.\n" +
                        "3.Menggunakan losion atau obat antihistamin untuk membantu mengurangi rasa gatal pada ruam\n" +
                        "4.Memakai sarung tangan bila perlu. Dengan ini, kuku tidak menggores ruam cacar air dan menimbulkan luka ketika pasien tak sengaja menggaruk. Khususnya pada penderita anak-anak.\n" +
                        "5.Memotong kuku untuk menghindari terjadinya luka ketika tidak sengaja menggaruk\n" +
                        "6.Mandi dengan air dingin, tapi keringkan kulit dengan lembut dan jangan menggosoknya karena bisa luka\n" +
                        "7.Mengenakan baju yang longgar dan berbahan lembut\n" +
                        "8.Mengonsumsi obat pereda nyeri, seperti paracetamol\n" +
                        "Dokter juga dapat memberikan obat antivirus untuk mengurangi gejala cacar air pada orang dewasa. Contohnya, asiklovir atau valasiklovir. Obat ini paling efektif digunakan pada 24 jam setelah ruam pertama muncul.\b",
                "Vaksinasi cacar air dianjurkan bagi:\b \n" +
                        "1.Anak-anak: Ikatan Dokter Anak Indonesia (IDAI) menyarankan pemberian vaksinasi cacar air sebanyak satu kali saat anak berusia 1-13 tahun\n" +
                        "2.Remaja yang belum pernah divaksin\n" +
                        "3.Orang dewasa yang belum pernah divaksin, tapi memiliki risiko tinggi untuk tertular cacar air\n" +
                        "\n"+
                        "Namun ada pula sebagian orang yang tidak boleh menerima vaksin cacar air. Kalangan ini meliputi:\b \n" +
                        "1.Wanita hamil\n" +
                        "2.Orang dengan kekebalan tubuh lemah, seperti pengidap HIV atau orang yang mengonsumsi obat imunosupresan, pengidap kanker yang menjalani kemoterapi\n" +
                        "3.Orang yang alergi terhadap gelatin atau antibiotik neomycin\n"+
                        "\n"+
                        "Cacar air dapat menular mulai 1-2 hari sebelum hingga 5-7 hari setelah ruam kulit muncul. \b",
                R.drawable.p_cacarair));
        penyakitList.add(new Penyakit("Campak", "Campak adalah penyakit menular yang mempunyai ciri khas munculnya ruam merah datar di seluruh tubuh penderitanya. Penyakit ini dapat menyebabkan komplikasi yang serius dan bahkan fatal, terutama pada bayi dan anak kecil.\n"+
                "Penularan virus campak bisa terjadi melalui kontak langsung dengan penderita dan lewat udara. Virus campak pertama akan masuk ke saluran pernapasan, kemudian menyebar ke seluruh tubuh.\n"+
                "Gejala pertama penyakit ini biasanya dimulai dengan demam selama 4-7 hari, diikuti dengan batuk serta hidung meler. Ruam merah datar kemudian mulai muncul di leher dan wajah, dan menyebar ke seluruh tubuh.\n"+
                "Sebelum ditemukan vaksin campak pada tahun 1963, epidemik terjadi di seluruh dunia tiap 2-3 tahun sekali. Diperkirakan terdapat 2,6 juta kematian setiap tahunnya akibat campak.\n"+
                "Saat ini, penyakit campak bisa dicegah dengan menjalani vaksinasi. Meskipun angka penyakit sudah turun drastis, jumlah kematian akibat campak diperkirakan 100.000 jiwa per tahun, dengan angka kematian tertinggi pada anak berusia di bawah lima tahun (balita).",
                "Demam", "Batuk kering", "Pilek", "Nyeri tenggorokan", "Mata merah",
                "Bercak putih dengan warna kebiruan di bagian tengah. Bercak ini muncul di dalam mulut dan dikenal sebagai bercak Koplik.", "Muncul ruam kulit datar berwarna merah yang kadang menyatu satu sama lain", "", "", "",
                "Cara mengobati campak umumnya tergantung dari tingkat keparahan penyakit dan seberapa lama pasien mengalami kondisi tersebut.\n"+
                        "Sama seperti infeksi virus lainnya, tidak ada penanganan spesifik untuk mengatasi penyakit campak. Pengobatan yang diberikan bertujuan meredakan gejala.\n"+
                        "Dokter dapat menganjurkan penderita untuk beristirahat yang cukup dan memenuhi kebutuhan cairan. Kondisi penderita biasanya akan membaik dalam waktu 7–10 hari.\n"+
                        "Bila diperlukan, dokter juga bisa meresepkan obat-obatan untuk mengatasi campak sekaligus mencegah komplikasi. Obat ini meliputi:\n" +
                        "1.Antibiotik untuk mengatasi infeksi mata dan telinga serta pneumonia yang mungkin terjadi\n" +
                        "2.Suplemen vitamin A untuk semua anak yang menderita campak guna mencegah komplikasi berupa gangguan fungsi mata",
                "Cara mencegah campak yang paling efektif adalah vaksinasi. Vaksin ini diberikan pada:\b \n" +
                        "1.Bayi dan anak\n" +
                        "Dosis vaksin campak pertama biasanya diberikan saat bayi berusia 12-15 bulan, dan dosis kedua pada anak berusia 4-6 tahun.\n" +
                        "2.Bayi berusia 6-11 bulan\n" +
                        "Bayi pada usia ini hanya boleh menerima vaksin bila kedua orangtuanya berencana membawa sang bayi bepergian ke negeri lain dengan tingkat kasus campak yang tinggi.\n" +
                        "3.Anak dan remaja\n" +
                        "Anak dan remaja yang belum pernah mendapatkan vaksin campak sebaiknya menjalaninya dua kali, dengan jarak pemberian empat minggu di antara dosis pertama dan kedua. \n" +
                        "4.Orang dewasa yang berisiko tinggi\n" +
                        "Orang dewasa yang berencana melancong ke luar negeri dengan angka kasus campak yang tinggi maupun yang bekerja di rumah sakit, membutuhkan vaksinasi campak.",
                R.drawable.p_campak));
        penyakitList.add(new Penyakit("Gagal Hati", "Ga'gal hati adalah kondisi di mana sebagian besar bagian hati rusak dan tidak lagi dapat diperbaiki sehingga hati tidak dapat berfungsi. Hati adalah organ terbesar kedua di dalam tubuh. Hati bertugas untuk memproses semua makanan dan minuman yang masuk dan mengubahnya menjadi energi dan nutrisi bagi tubuh. Hati menyaring zat berbahaya, seperti alkohol, zat–zat dari darah dan membantu tubuh melawan infeksi.\n"+
                "Virus dan bahan kimia berbahaya dapat membahayakan hati. Ketika hati rusak, fungsi hati dapat terganggu atau berhenti berfungsi. Gagal hati adalah kondisi yang serius, dan jika Anda terkena gagal hati, maka pengobatan harus segera dilakukan.",
                "Mual", "Kehilangan selera makan", "Nyeri di perut kanan atas", "Kelelahan", "Ikterus atau warna kekuningan pada kulit dan mata",
                "Edema atau penumpukan cairan di kaki", "Asites atau penumpukan cairan di perut", "Penurunan fungsi mental", "Disorientasi", "Kanker hati",
                "Jika terdeteksi cukup awal, gagal hati akut yang disebabkan oleh overdosis parasetamol terkadang dapat diobati. Sama halnya dengan virus yang menyebabkan gagal hati akut, perawatan suportif dapat diberikan di rumah sakit untuk mengobati gejala sampai penyakit sembuh dengan sendirinya, karena dalam kasus-kasus seperti ini, terkadang hati dapat membaik dengan sendirinya.\n"+
                        "Untuk gagal hati kronis, penanganan pertama dilakukan untuk menyelamatkan bagian hati yang masih berfungsi, karena bagian hati yang masih sehat dapat tumbuh kembali ke ukuran semula. Jika ini tidak memungkinkan karena kerusakan terlalu berat terutama karena kerusakan hati akut yang cepat, maka transplantasi hati akan dilakukan.",
                "Salah satu cara termudah untuk mencegah gagal hati adalah dengan membatasi konsumsi alkohol. Tindakan pencegahan lainnya termasuk:\b \n" +
                        "1.Hindari seks bebas\n" +
                        "2.Tidak terlibat dalam penggunaan narkoba atau penggunaan jarum secara bersamaan\n" +
                        "3.Mendapatkan vaksinasi hepatitis A dan B\n" +
                        "4.Melindungi kulit dari bahan kimia beracun\n" +
                        "5.Menggunakan kaleng semprot aerosol di tempat yang berventilasi, sehingga tidak terhirup",
                R.drawable.p_gglhati));
        penyakitList.add(new Penyakit("Gangguan Pendengaran", "Kehilangan pendengaran dapat bersifat sementara atau permanen. Gangguan pendengaran ini umum terjadi pada orang yang berusia lebih dari 65 tahun. Kondisi tertentu, termasuk usia, penyakit dan genetik, merupakan faktor yang memengaruhi fungsi pendengaran. Sebagian besar jenis gangguan pendengaran tidak dapat disembuhkan. Namun, ada beberapa langkah yang dapat diambil untuk membantu fungsi pendengaran.",
                "Kesulitan mendengar", "salah memahami perkataan orang lain, terutama di tempat yang bising", "Sering meminta orang lain untuk mengulang perkataan sebelumnya", "Mendengarkan musik atau menonton televisi dengan volume keras", "Harus berkonsentrasi penuh untuk mendengar apa yang dikatakan orang lain",
                "", "", "", "", "",
                "Gangguan pendengaran terkadang dapat membaik dengan sendirinya atau dapat diatasi dengan obat atau prosedur medis sederhana, tergantung dari penyebabnya. Sebagai contoh, pada gangguan pendengaran yang disebabkan oleh penumpukan kotoran telinga yang mengeras, terapi yang dilakukan adalah melunakkan kotoran telinga dengan obat tetes telinga agar, kotoran telinga dapat disedot keluar. Gangguan pendengaran lain yang berpotensi menjadi permanen, seperti pada proses penuaan dapat diatasi dengan:\n" +
                        "1.Alat bantu dengar\n" +
                        "2.Implan\n" +
                        "3.Cara berkomunikasi lain, seperti bahasa isyarat atau membaca bibir",
                "1.Tidak memasang suara televisi, radio, atau musik terlalu keras\n" +
                        "2.Mengenakan pelindung telinga jika bekerja di tempat bising seperti pabrik dan area konstruksi\n" +
                        "3.Menggunakan pelindung telinga ketika pergi menonton konser atau acara lainnya dengan tingkat kebisingan tinggi\n" +
                        "4.Tidak memasukkan benda, seperti kapas, korek kuping, atau jari ke telinga",
                R.drawable.p_ggpendengaran));
        penyakitList.add(new Penyakit("Kaki Gajah", "Penyakit kaki gajah atau filariasis adalah kondisi medis yang disebabkan oleh cacing filaria. Parasit ini dapat ditularkan dari satu orang ke orang lainnya melalui gigitan nyamuk yang telah terinfeksi cacing filaria.\n"+
                "Kondisi ini umumnya disebut kaki gajah karena gejalanya yang paling umum terlihat adalah pembengkakan pada kaki dan tangan. Selain itu, skrotum (kantong buah zakar) serta payudara dan organ kelamin penderita wanita juga dapat diserang.\n"+
                "Tekstur kulit pada organ yang membengkak bisa menebal dan menjadi lebih keras. Akibatnya, kulit penderita terlihat memiliki tekstur seperti kulit gajah.\n"+
                "Penyakit kaki gajah bersifat menahun (kronis) dan perlu ditangani sedini mungkin. Bila tidak, penyakit ini dapat menyebabkan cacat permanen atau seumur hidup.\n"+
                "Menurut data dari Departemen Kesehatan RI di tahun 2014, terdapat sekitar 14.932 penderita filariasis di Indonesia. Sementara sampai dengan tahun 2019, sebanyak 236 dari 514 kabupaten/kota di Indonesia merupakan daerah endemis filariasis.",
                "Pembengkakan Kaki", "Pembengkakan Tangan", "Pembengkakan Dada", "Pembengkakan Alat Kelemin", "",
                "", "", "", "", "",
                "1.Mengonsumsi obat-obatan antiparasit, seperti diethylcarbamazine (DEC), ivermectin, dan albendazole\n" +
                        "2.Menjaga kebersihan bagian tubuh yang bengkak, termasuk rutin memeriksa ada tidaknya luka\n" +
                        "3.Merawat luka dengan saksama bila ada\n" +
                        "4.Berolahraga sesuai rekomendasi dokter\n" +
                        "5.Menjalani operasi jika diperlukan, untuk mengurangi pembengkakan dan membantu pergerakan penderita\n" +
                        "6.Mencuci dan mengeringkan area yang bengkak dengan hati-hati dengan sabun dan air bersih setiap hari\n" +
                        "7.Mengangkat lengan atau kaki yang bengkak pada siang dan malam hari guna mengeluarkan cairan\n" +
                        "8.Mengenakan sepatu yang sesuai dengan ukuran kaki guna melindungi kaki dari cedera",
                "1.Memberantas area yang dapat menjadi sarang nyamuk, misalnya kubangan dan geanngan air\n" +
                        "2.Menggunakan kelambu saat tidur\n" +
                        "3.Mengenakan baju lengan panjang atau celana panjang di daerah yang banyak nyamuk\n" +
                        "4.Menghindari nyamuk atau gigitan nyamuk dengan memakai losion antinyamuk di area kulit yang terbuka\n" +
                        "5.Mengonsumsi obat diethylcarbamazine (DEC), albendazole, dan ivermectin sebelum mengunjungi daerah yang berpotensi menularkan kaki gajah",
                R.drawable.p_kakigajah));
        penyakitList.add(new Penyakit("Malaria", "Malaria adalah sebuah penyakit yang disebabkan oleh parasit yang tersebar melalui gigitan nyamuk. Malaria menyebabkan gejala demam dan menggigil yang berulang. Penyakit ini diperkirakan menyebabkan 660 ribu kematian di seluruh belahan dunia setiap tahunnya.\n"+
                "Penyakit ini jarang ditemui di daerah yang bersuhu dingin, namun masih sering muncul di daerah tropik dan subtropis seperti Indonesia. Hal ini karena daerah tersebut memiliki suhu yang cukup hangat, sehingga parasit malaria dan nyamuk yang membawanya dapat tumbuh serta berkembang biak. Saat ini, ilmuwan di seluruh dunia sedang berusaha untuk mengembangkan vaksin untuk penyakit malaria, karena sejauh ini belum ada vaksin yang dapat mencegah penyakit malaria.",
                "Demam tinggi (38°C atau lebih)", "Menggigil", "Sakit kepala", "Muntah", "Nyeri otot",
                "Diare", "", "", "", "",
                "enis dan lama pengobatan yang diberikan bergantung kepada:\n" +
                        "1.Jenis parasit malaria\n" +
                        "2.Seberapa parah kondisi kesehatan\n" +
                        "3.Umur\n" +
                        "4.Status kehamilan\n" +
                        "Pengobatan anti-malaria yang dapat diberikan oleh dokter di Indonesia antara lain terapi kombinasi artemisinin (ACT) dan primakuin, serta injeksi artesunate. Pengobatan akan dievaluasi berkala dengan cara pemeriksaan darah untuk memeriksa jumlah parasit dalam darah.",
                "1.Gunakan obat anti-nyamuk di tempat tinggal untuk membunuh nyamuk yang mungkin dapat menyebabkan malaria\n" +
                        "2.Gunakan kelambu ketika tidur untuk mencegah nyamuk menggigit badan\n" +
                        "3.Gunakan losion anti-nyamuk untuk menghindari gigitan nyamuk\n",
                R.drawable.p_malaria));

        setrvPenyakit(penyakitList);
    }
    private void setrvPenyakit(List<Penyakit> penyakitList){
        rvPenyakit = findViewById(R.id.rvPenyakit);
        RecyclerView.LayoutManager LayoutManager= new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rvPenyakit.setLayoutManager(LayoutManager);
        penyakitAdapter = new PenyakitAdapter(this, (ArrayList<Penyakit>) penyakitList);
        rvPenyakit.setAdapter(penyakitAdapter);
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        penyakitAdapter.filter(s);
        return false;
    }
}