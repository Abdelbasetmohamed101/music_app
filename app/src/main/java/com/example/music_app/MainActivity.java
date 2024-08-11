package com.example.music_app;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageButton Play,pause,Stop;
    MediaPlayer mediaPlayer;
    boolean isPlaying =false;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Play=findViewById(R.id.play);
        pause=findViewById(R.id.pause);
        Stop=findViewById(R.id.stop);
        mediaPlayer =MediaPlayer.create(this,R.raw.song1);

        Play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!isPlaying){
                    mediaPlayer.start();
                    isPlaying=true;
                }
            }
        });
        pause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(isPlaying){
                    mediaPlayer.pause();
                    isPlaying=false;
                }
            }
        });
        Stop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(isPlaying){
                    mediaPlayer.stop();
                    isPlaying=false;
                }
            }
        });
    }
}