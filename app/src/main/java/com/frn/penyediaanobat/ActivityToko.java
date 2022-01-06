package com.frn.penyediaanobat;

import android.os.Bundle;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.frn.penyediaanobat.adapter.TokoAdapter;
import com.frn.penyediaanobat.model.Toko;

import java.util.ArrayList;
import java.util.List;

public class ActivityToko extends AppCompatActivity implements SearchView.OnQueryTextListener {
    private TokoAdapter tokoAdapter;
    private RecyclerView rvToko;
    private SearchView svSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toko);

        svSearch = findViewById(R.id.tcari);
        svSearch.setOnQueryTextListener(this);

        List<Toko> tokoList = new ArrayList<>();
        tokoList.add(new Toko("Apotek Adhitia", "-2.981295038128068", "104.74820811448856", R.drawable.t_adhitia));
        tokoList.add(new Toko("Apotek Citra","-2.9738546019320884", "104.76038622302728", R.drawable.t_citra));
        tokoList.add(new Toko("K24 Wahid Hasyim","-3.00419563849984", "104.76370687522159", R.drawable.t_k24wh));
        tokoList.add(new Toko("Apotek Polygon","-3.0071181489252314", "104.7200030905631", R.drawable.t_apolygon));
        tokoList.add(new Toko("Apotik Lili","-3.000106739959765", "104.76490975436825", R.drawable.t_lili));
        tokoList.add(new Toko("Apotek Puncak","-2.9851655183619", "104.73743829669748", R.drawable.t_puncak));
        tokoList.add(new Toko("Apotek Inara","-2.995893327746884", "104.77950492553283", R.drawable.t_inara));
        tokoList.add(new Toko("Apotek Kito","-3.0094041970842165", "104.76013989669762", R.drawable.t_kito));
        tokoList.add(new Toko("Apotek Jojo 1","-2.9687318248688044", "104.78594498750208", R.drawable.t_jojo1));
        setrvToko(tokoList);



    }

    private void setrvToko(List<Toko> tokoList){
        rvToko = findViewById(R.id.rvToko);
        RecyclerView.LayoutManager LayoutManager= new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rvToko.setLayoutManager(LayoutManager);
        tokoAdapter = new TokoAdapter(this, (ArrayList<Toko>) tokoList);
        rvToko.setAdapter(tokoAdapter);
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        tokoAdapter.filter(s);
        return false;
    }
}



