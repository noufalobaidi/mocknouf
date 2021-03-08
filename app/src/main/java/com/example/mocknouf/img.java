package com.example.mocknouf;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class img extends AppCompatActivity {
    MediaPlayer song;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img);
        ImageView img=(ImageView)findViewById(R.id.imageView);
        song=new MediaPlayer();
        x=0;
        song=MediaPlayer.create(this,R.raw.track1);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(x){
                    case 0:

                        song.start();
                        x=1;
                        break;
                    case 1:
                        song.pause();
                        x=0;

                        break;
                }}
        });

    }

    private static void setOnClickListener(View.OnClickListener onClickListener) {

    }
}