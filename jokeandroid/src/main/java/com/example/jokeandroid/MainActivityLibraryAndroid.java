package com.example.jokeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityLibraryAndroid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_library_android);

        String gce_result = getIntent().getStringExtra("gce_result");
        TextView gce_result_show = (TextView) findViewById(R.id.joke_text_view);
        gce_result_show.setText(gce_result);


    }
}
