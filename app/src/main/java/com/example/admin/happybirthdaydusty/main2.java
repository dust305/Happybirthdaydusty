package com.example.admin.happybirthdaydusty;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class main2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public  void displayVideo(VideoView video){

        VideoView view = (VideoView)findViewById(R.id.Vidoeview);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.scope;
        view.setVideoURI(Uri.parse(path));
        view.start();
    }
}
