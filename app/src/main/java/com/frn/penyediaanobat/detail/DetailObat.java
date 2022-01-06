package com.frn.penyediaanobat.detail;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.frn.penyediaanobat.ActivityToko;
import com.frn.penyediaanobat.R;

public class DetailObat extends AppCompatActivity {
    private TextView NamaO, JenisO, GejalaO1, GejalaO2, GejalaO3, KomposiO, desc;
    private ImageView imageO;
    private LinearLayout temukano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_obat);
        NamaO = findViewById(R.id.namaO);
        JenisO = findViewById(R.id.jenisO);
        GejalaO1 = findViewById(R.id.GejalaO1);
        GejalaO2 = findViewById(R.id.GejalaO2);
        GejalaO3 = findViewById(R.id.GejalaO3);
        KomposiO = findViewById(R.id.komposiO);
        desc = findViewById(R.id.descO);
        imageO = findViewById(R.id.imagedobat);
        temukano = findViewById(R.id.temukanO);
        temukano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailObat.this, ActivityToko.class);
                startActivity(intent);
            }
        });

        String N = getIntent().getStringExtra("nama");
        String J = getIntent().getStringExtra("jenis");
        String G1 = getIntent().getStringExtra("gejala1");
        String G2 = getIntent().getStringExtra("gejala2");
        String G3 = getIntent().getStringExtra("gejala3");
        String K = getIntent().getStringExtra("komposisi");
        String D = getIntent().getStringExtra("desc");
        Integer I = getIntent().getIntExtra("imageo", 0);

        NamaO.setText(N);
        JenisO.setText(J);
        GejalaO1.setText(G1);
        GejalaO2.setText(G2);
        GejalaO3.setText(G3);
        KomposiO.setText(K);
        desc.setText(D);
        imageO.setImageResource(I);
    }

}