package com.chocola.ejercicioindividualdoce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.chocola.ejercicioindividualdoce.databinding.ActivityThirdBinding;

public class ThirdActivity extends AppCompatActivity {

    private ActivityThirdBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityThirdBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        WebView webview = binding.webMap;
        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://goo.gl/maps/tMgWqSTA2RbLKSXW7");
    }
}