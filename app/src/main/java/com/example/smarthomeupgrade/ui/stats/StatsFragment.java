package com.example.smarthomeupgrade.ui.stats;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.smarthomeupgrade.R;

public class StatsFragment extends Fragment {

    private StatsViewModel statsViewModel;
    private WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        statsViewModel = ViewModelProviders.of(this).get(StatsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_stats, container, false);



        webView = (WebView) root.findViewById(R.id.webview_home);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/stats.html");
        WebSettings websettings = webView.getSettings();
        websettings.setJavaScriptEnabled(true);
        return root;
    }
}
