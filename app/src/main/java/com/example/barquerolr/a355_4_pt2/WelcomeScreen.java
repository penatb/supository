package com.example.barquerolr.a355_4_pt2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.widget.Switch;


import static android.R.attr.src;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

    }

    public void onButtonClick(View v) {
        final MediaPlayer fwanky = MediaPlayer.create(WelcomeScreen.this, R.raw.fronk);
        final MediaPlayer dugfhg = MediaPlayer.create(WelcomeScreen.this, R.raw.zubair);
        final MediaPlayer dugfhfdsg = MediaPlayer.create(WelcomeScreen.this, R.raw.broozy);

        if(v.getId() == R.id.button) {
            if(fwanky.isPlaying()) fwanky.stop();
            else fwanky.start();
        }

        if(v.getId() == R.id.button2) {
            if(dugfhg.isPlaying()) dugfhg.stop();
            else dugfhg.start();
        }

        if(v.getId() == R.id.toggleButton) {
            if(dugfhfdsg.isPlaying()) dugfhfdsg.stop();
            else dugfhfdsg.start();
        }



    }

    public void mehama(View view)
    {
        System.out.println("FUUUCCCKKKK");
    }

}
