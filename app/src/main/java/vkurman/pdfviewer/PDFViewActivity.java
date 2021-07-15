package vkurman.pdfviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class PDFViewActivity extends AppCompatActivity {

    private WebView mWebView;
    private String pdfUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);

        pdfUrl = getIntent().getStringExtra("url");

        mWebView = findViewById(R.id.webView);

        WebSettings webSettings = mWebView.getSettings();

        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setAllowFileAccessFromFileURLs(true);
        webSettings.setAllowUniversalAccessFromFileURLs(true);
        // Load pdf file
        mWebView.loadUrl("file:///android_asset/PDFViewer/web/viewer.html?file=" + pdfUrl);
    }
}