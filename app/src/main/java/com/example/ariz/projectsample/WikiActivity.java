package com.example.ariz.projectsample;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static com.example.ariz.projectsample.MainActivity.count;

public class WikiActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wiki);

        WebView webView = (WebView) findViewById(R.id.webWiki);

        if(count==1){
            webView.loadUrl("https://en.wikipedia.org/wiki/Delhi");
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
        }

        else
        if(count==2){
            webView.loadUrl("https://en.wikipedia.org/wiki/Kolkata");
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
        }

        else
        if(count==3){
            webView.loadUrl("https://en.wikipedia.org/wiki/Chennai");
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
        }

        else
        if(count==4){
            webView.loadUrl("https://en.wikipedia.org/wiki/Mumbai");
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
        }
        else {
            webView.loadUrl("https://en.wikipedia.org");
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
        }
    }
}
