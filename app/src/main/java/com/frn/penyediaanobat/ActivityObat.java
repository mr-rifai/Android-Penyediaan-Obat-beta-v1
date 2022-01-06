package com.frn.penyediaanobat;

import android.os.Bundle;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.frn.penyediaanobat.adapter.ObatAdapter;
import com.frn.penyediaanobat.model.Obat;

import java.util.ArrayList;
import java.util.List;

public class ActivityObat extends AppCompatActivity implements SearchView.OnQueryTextListener {
    private ObatAdapter obatAdapter;
    private RecyclerView rvObat;
    private SearchView svSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obat);

        svSearch = findViewById(R.id.ocari);
        svSearch.setOnQueryTextListener(this);

        List<Obat> obatList = new ArrayList<>();
        obatList.add(new Obat("Panadol Extra Kaplet","Obat Bebas","Lebih ampuh untuk meredakan sakit kepala dan sakit gigi.","Meredakan nyeri otot dan nyeri sendi.","Menurunkan demam pada orang dewasa.","Parasetamol 500 mg dan kafein 65 mg.","Panadol Extra Kaplet berkhasiat untuk meredakan sakit kepala, sakit gigi, nyeri otot, nyeri sendi yang mengganggu, serta menurunkan demam secara cepat dan efektif. Panadol Extra Kaplet mengandung dua bahan aktif yaitu parasetamol dan kafein.\n" +
                "\n" +
                "\n" +
                "Parasetamol merupakan zat analgetik dan antipiretik yang dapat meringankan nyeri sekaligus menurunkan demam, sedangkan kafein bekerja dengan menstimulasi susunan syaraf pusat dan merelaksasi otot.\n" +
                "\n" +
                "\n" +
                "Panadol Extra Kaplet boleh diberikan pada wanita hamil setelah berkonsultasi dengan dokter dan jika manfaatnya melebihi risiko yang mungkin timbul pada janin. Obat ini juga aman bagi lambung jika dikonsumsi sesuai aturan yang tertulis pada kemasan." , R.drawable.pandol));
        obatList.add(new Obat("Lodomer Tablet","Obat Keras","Mengatasi gangguan kesulitan dalam membedakan antara imajinasi dan kenyataan","Mengontrol kejang otot wajah.","Gangguan mental atau kejiwaan yang menyebabkan penderita mengalami halusinasi, perubahan sikap, dan delusi.","haloperidol 2/5 mg.","Lodomer tablet adalah obat untuk mengatasi gangguan mental atau perubahan mood seperti gangguan kejiwaan yang membuat penderitanya mengalami delusi, perubahan sikap, dan halusinasi (skizofrenia). Obat ini merupakan obat keras yang harus menggunakan resep dokter. Lodomer tablet mengandung zat aktif haloperidol.\n", R.drawable.o_lodomer));
        obatList.add(new Obat("Alloris Tablet 10 mg","Obat Keras","Mengatasi berbagai kondisi alergi seperti mata berair, gatal, pilek, ruam kulit, dan bersin.","Mengobati peradangan pada mukosa hidung yang disebabkan karena adanya reaksi alergi terhadap suatu alergen (rhinitis alergi).","Mengobati alergi pada kulit dan biduran yang berlangung selama 6 minggu ke atas (urtikaria kronik).","Loratadin 10 mg.","Loratadin adalah antialergi atau antihistamin yang bekerja dengan mengurangi efek histamin kimiawi alami dalam tubuh. Histamin merupakan senyawa dalam tubuh yang dapat menimbulkan terjadinya gejala alergi seperti pilek, bersin, mata berair, dan gatal.", R.drawable.o_alloris10mg));
        obatList.add(new Obat("Acetram Tablet","Obat Keras","Meringankan nyeri akut dan kronik.","Meredakan nyeri sedang hingga berat.","Mengatasi nyeri pasca operasi.","Tramadol 37,5 mg danParasetamol 325 mg.","Acetram tablet digunakan untuk meredakan nyeri sedang hingga berat. Obat ini merupakan obat keras yang harus menggunakan resep dokter. Acetram tablet mengandung zat aktif tramadol dan parasetamol.", R.drawable.o_acetram));
        obatList.add(new Obat("Aclam Kaplet 500 mg","Obat Keras","Infeksi saluran pernapasan atas dan bawah.","Infeksi kulit dan jaringan lunak.","Radang panggul.","Amoksisilin 500 mg dan Asam klavulanat 125 mg.","Aclam kaplet digunakan untuk mengatasi infeksi saluran napas atas dan bawah, infeksi saluran kemih, infeksi kulit dan jaringan lunak serta infeksi lainnya. Obat ini merupakan obat keras yang harus menggunakan resep dokter. Aclam kaplet mengandung zat aktif amoksisilin dan asam klavulanat.", R.drawable.o_aclam_kaplet));
        obatList.add(new Obat("Bactrim Forte Tablet","Obat Keras","Infeksi pada ginjal (pielonefritis).","Demam tifoid.","Peradangan bronkus akibat infeksi dan iritasi yang baru saja terjadi dan berlangsung tak lama (bronchitis akut).","Trimetoprim 160 mg dan Sulfametoksazol 800 mg.","Bactrim forte tablet adalah obat untuk mengatasi berbagai infeksi bakteri seperti infeksi saluran pencernaan, saluran kemih, saluran pernapasan, dan infeksi THT. Obat ini merupakan obat keras yang harus menggunakan resep dokter. Bactrim forte tablet mengandung zat aktif trimetoprim dan sulfametoksazol.", R.drawable.o_bactrim_forte));
        obatList.add(new Obat("Kaditic Tablet 50 mg","Obat Keras","Terapi jangka pendek untuk nyeri akibat trauma.","Mengatasi peradangan.","Meringankan nyeri sesudah operasi.","Kalium diklofenak 50 mg.","Kaditic tablet digunakan untuk meredakan nyeri dan peradangan. Obat ini merupakan obat keras yang harus menggunakan resep dokter. Kaditic tablet mengandung zat aktif kalium diklofenak.", R.drawable.o_kaditic_50mg));
        obatList.add(new Obat("Tempra Tetes 15 ml","Obat Bebas","Mengatasi sementara gejala demam.","sakit dan nyeri ringan.","sakit kepala, dan demam setelah imunisasi.","Paracetamol 80 mg","Tempra adalah obat untuk menurunkan demam, sakit kepala, dan demam setelah imunisasi pada anak. Obat ini mengandung paracetamol yang bekerja dengan menurunkan panas dan meredakan nyeri. Tempra termasuk obat bebas yang tidak memerlukan resep dokter.", R.drawable.o_tempra_15ml));

        setrvObat(obatList);
    }
    private void setrvObat(List<Obat> obatList){
        rvObat = findViewById(R.id.rvObat);
        RecyclerView.LayoutManager LayoutManager= new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rvObat.setLayoutManager(LayoutManager);
        obatAdapter = new ObatAdapter(this, (ArrayList<Obat>) obatList);
        rvObat.setAdapter(obatAdapter);
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        obatAdapter.filter(s);
        return false;
    }
}