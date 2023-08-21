package sg.edu.rp.id22020682.com.myapplicationdev.android.mywebbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonloadurl;
    WebView wvmypage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonloadurl = findViewById(R.id.buttonload);
        wvmypage = findViewById(R.id.WebViewMyPage);

        wvmypage.setWebViewClient(new WebViewClient());


        buttonloadurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.rp.edu.sg/soi/home";
                wvmypage.loadUrl(url);

            }
        });
    }

}