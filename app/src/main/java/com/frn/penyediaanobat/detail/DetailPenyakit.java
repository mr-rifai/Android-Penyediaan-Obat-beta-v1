package com.frn.penyediaanobat.detail;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.frn.penyediaanobat.R;

public class DetailPenyakit extends AppCompatActivity {
    private TextView NAMA, DESC, GEJALA1, GEJALA2, GEJALA3, GEJALA4, GEJALA5, GEJALA6, GEJALA7, GEJALA8, GEJALA9, GEJALA10, CARAMO, CARAMC;
    private ImageView IMAGE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_penyakit);

        NAMA = findViewById(R.id.namaO);
        DESC = findViewById(R.id.descP);
        GEJALA1 = findViewById(R.id.GejalaP1);
        GEJALA2 = findViewById(R.id.GejalaP2);
        GEJALA2 = findViewById(R.id.GejalaP2);
        GEJALA3 = findViewById(R.id.GejalaP3);
        GEJALA4 = findViewById(R.id.GejalaP4);
        GEJALA5 = findViewById(R.id.GejalaP5);
        GEJALA6 = findViewById(R.id.GejalaP6);
        GEJALA7 = findViewById(R.id.GejalaP7);
        GEJALA8 = findViewById(R.id.GejalaP8);
        GEJALA9 = findViewById(R.id.GejalaP9);
        GEJALA10 = findViewById(R.id.GejalaP10);
        CARAMO = findViewById(R.id.descMO);
        CARAMC = findViewById(R.id.descMC);
        IMAGE = findViewById(R.id.imagedpenyakit);

        String N = getIntent().getStringExtra("nama");
        String D = getIntent().getStringExtra("desc");
        String G1 = getIntent().getStringExtra("gejala1");
        String G2 = getIntent().getStringExtra("gejala2");
        String G3 = getIntent().getStringExtra("gejala3");
        String G4 = getIntent().getStringExtra("gejala4");
        String G5 = getIntent().getStringExtra("gejala5");
        String G6 = getIntent().getStringExtra("gejala6");
        String G7 = getIntent().getStringExtra("gejala7");
        String G8 = getIntent().getStringExtra("gejala8");
        String G9 = getIntent().getStringExtra("gejala9");
        String G10 = getIntent().getStringExtra("gejala10");
        String CMO = getIntent().getStringExtra("caramo");
        String CMC = getIntent().getStringExtra("caramc");
        Integer I = getIntent().getIntExtra("imagep", 0);

        NAMA.setText(N);
        DESC.setText(D);
        GEJALA1.setText(G1);
        GEJALA2.setText(G2);
        GEJALA3.setText(G3);
        GEJALA4.setText(G4);
        GEJALA4.setText(G4);
        GEJALA5.setText(G5);
        GEJALA6.setText(G6);
        GEJALA7.setText(G7);
        GEJALA8.setText(G8);
        GEJALA9.setText(G9);
        GEJALA10.setText(G10);
        CARAMO.setText(CMO);
        CARAMC.setText(CMC);
        IMAGE.setImageResource(I);
    }
}