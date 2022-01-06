package com.frn.penyediaanobat.detail;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.frn.penyediaanobat.R;

public class DetailNews extends AppCompatActivity {
    private WebView mWebView;
    private TextView Detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_news);
        mWebView = findViewById(R.id.read_news);
        Detail = findViewById(R.id.detailN);
        String Nama = getIntent().getStringExtra("nama");
        String url = getIntent().getStringExtra("url");
        Detail.setText(Nama);
        mWebView.loadUrl(url);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setLoadsImagesAutomatically(true);
        mWebView.getSettings().setDomStorageEnabled(true);
        mWebView.getSettings().setSupportZoom(true);
        mWebView.getSettings().setBuiltInZoomControls(true);
        mWebView.getSettings().setDisplayZoomControls(false);
        mWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        mWebView.setWebViewClient(new WebViewClient());
    }
}