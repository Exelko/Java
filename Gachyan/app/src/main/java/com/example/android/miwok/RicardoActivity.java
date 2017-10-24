package com.example.android.miwok;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class RicardoActivity extends AppCompatActivity {

    VideoView ricardoDance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ricardo);

        ricardoDance = (VideoView) findViewById(R.id.ricardo_dance);
    }

    public void onButtonClick(View v) {
        Uri uri = Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.test);
        ricardoDance.setVideoURI(uri);
        ricardoDance.start();
    }
}
