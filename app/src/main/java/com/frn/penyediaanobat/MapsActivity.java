package com.frn.penyediaanobat;

import android.os.Bundle;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private TextView NamaM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        NamaM = findViewById(R.id.namaM);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String N =getIntent().getStringExtra("nama");
        NamaM.setText(N);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String l1 = getIntent().getStringExtra("lokasi1");
        String l2 = getIntent().getStringExtra("lokasi2");
        Double m1 = Double.parseDouble(l1);
        Double m2 = Double.parseDouble(l2);
        LatLng lokasi = new LatLng(m1,m2);
        String nama = getIntent().getStringExtra("nama");
        mMap.addMarker(new MarkerOptions().position(lokasi).title(nama));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi, 20));
    }
}