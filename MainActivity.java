package com.example.arduinoprojectwebpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView Web;

    @Override
    public void onBackPressed() {
        if(Web.canGoBack()) {
            Web.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Web = findViewById(R.id.Web);
        Web.loadUrl("http://hojin535.dothome.co.kr");
        Web.getSettings().setJavaScriptEnabled(true);

    }
}