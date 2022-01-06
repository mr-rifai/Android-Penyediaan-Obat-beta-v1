package com.frn.penyediaanobat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.frn.penyediaanobat.adapter.NewsAdapter;
import com.frn.penyediaanobat.detail.DetailNews;
import com.frn.penyediaanobat.model.Covid;
import com.frn.penyediaanobat.model.News;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, NewsAdapter.onItemClick{
    private RecyclerView recyclerView;
    private NewsAdapter adapter;
    private ProgressBar progressBar;
    private LinearLayout toko, obat, penyakit;
    private TextView positif, sembuh, meninggal;
    private ImageView admin;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        admin = findViewById(R.id.admin);
        toko = findViewById(R.id.toko);
        obat = findViewById(R.id.obat);
        penyakit = findViewById(R.id.penyakit);
        progressBar = findViewById(R.id.progressBar);
        recyclerView = findViewById(R.id.recycleView);
        positif = findViewById(R.id.Positif);
        sembuh = findViewById(R.id.Sembuh);
        meninggal = findViewById(R.id.Meninggal);
        Call<List<Covid>> call = Api.service().getData();
        call.enqueue(new Callback<List<Covid>>() {
            @Override
            public void onResponse(Call<List<Covid>> call, Response<List<Covid>> response) {
                positif.setText(response.body().get(0).getPositif());
                meninggal.setText(response.body().get(0).getMeninggal());
                sembuh.setText(response.body().get(0).getSembuh());
            }

            @Override
            public void onFailure(Call<List<Covid>> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        admin.setOnClickListener(this::onClick);
        toko.setOnClickListener(this::onClick);
        obat.setOnClickListener(this::onClick);
        penyakit.setOnClickListener(this::onClick);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new NewsAdapter(this);
        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);
        showLoading(true);
        getNews();

    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.admin) {
            Intent intent = new Intent(MainActivity.this,ActivityAdmin.class);
            startActivity(intent);
        } else if (v.getId() == R.id.toko) {
            Intent intent = new Intent(MainActivity.this, ActivityToko.class);
            startActivity(intent);
        } else if (v.getId() == R.id.obat) {
            Intent intent = new Intent(MainActivity.this, ActivityObat.class);
            startActivity(intent);
        } else if (v.getId() == R.id.penyakit) {
            Intent intent = new Intent(MainActivity.this, ActivityPenyakit.class);
            startActivity(intent);
        }
    }
    private void getNews() {
        final ArrayList<News> listNews = new ArrayList<>();

        String baseUrl = "https://newsapi.org/v2/top-headlines?country=id&category=health&apiKey=e9dd925b70a7496ba122d12bc46fde67";
        AndroidNetworking.get(baseUrl)
                .setPriority(Priority.MEDIUM)
                .build()
                .getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.e("_kotlinResponse", response.toString());

                        try {
                            JSONArray jsonArray = response.getJSONArray("articles");
                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject news = jsonArray.getJSONObject(i);
                                News itemNews = new News();
                                itemNews.setTitle(news.getString("title"));
                                itemNews.setDescription(news.getString("description"));
                                itemNews.setImage(news.getString("urlToImage"));
                                itemNews.setUrl(news.getString("url"));
                                listNews.add(itemNews);
                            }
                            adapter.setData(listNews);
                            showLoading(false);

                        } catch (JSONException e) {
                            e.printStackTrace();
                            Toast.makeText(MainActivity.this, "Gagal Menampilkan Data", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onError(ANError anError) {
                        Log.d("onFailure", anError.getMessage());
                        Toast.makeText(MainActivity.this, "Tidak Ada Internet", Toast.LENGTH_SHORT).show();
                    }
                });
    }


    private void showLoading(Boolean state) {
        if (state) {
            progressBar.setVisibility(View.VISIBLE);
        } else {
            progressBar.setVisibility(View.GONE);
        }
    }

    @Override
    public void ItemClick(News news){
        Intent intent = new Intent(MainActivity.this, DetailNews.class);
        intent.putExtra("url", news.getUrl());
        intent.putExtra("nama", news.getTitle());
        startActivity(intent);
    }

}