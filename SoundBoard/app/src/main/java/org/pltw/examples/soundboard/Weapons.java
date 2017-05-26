package org.pltw.examples.soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Weapons extends MainActivity {
    private final int WHOLE_NOTE = 1000;
    public static final String TAG = Weapons.class.getName();

    public Button mWeapons1;
    public Button mWeapons2;
    public Button mWeapons3;
    public Button mWeapons4;
    public Button mWeapons5;
    public Button mWeapons6;
    public Button mWeapons7;

    private MediaPlayer mpW1;
    private MediaPlayer mpW2;
    private MediaPlayer mpW3;
    private MediaPlayer mpW4;
    private MediaPlayer mpW5;
    private MediaPlayer mpW6;
    private MediaPlayer mpW7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_weapons);

        mWeapons1 = (Button) findViewById(R.id.Weapons1);
        mWeapons2 = (Button) findViewById(R.id.Weapons2);
        mWeapons3 = (Button) findViewById(R.id.Weapons3);
        mWeapons4 = (Button) findViewById(R.id.Weapons4);
        mWeapons5 = (Button) findViewById(R.id.Weapons5);
        mWeapons6 = (Button) findViewById(R.id.Weapons6);
        mWeapons7 = (Button) findViewById(R.id.Weapons7);


        //mpW1 = MediaPlayer.create(this, R.raw.blaster_ricochet);
        //mpW2 = MediaPlayer.create(this, R.raw.blaster_solo);
        //mpW3 = MediaPlayer.create(this, R.raw.dstar_gun4);
        mpW4 = MediaPlayer.create(this, R.raw.dstar_super1);
        mpW5 = MediaPlayer.create(this, R.raw.falcon_guns);
        mpW6 = MediaPlayer.create(this, R.raw.isd_laser2);
        mpW7 = MediaPlayer.create(this, R.raw.lightsaber_01);

        //mpW1 = MediaPlayer.create(this, R.raw.blaster_imperial);


       // mpW2 = MediaPlayer.create(this, R.raw.blaster_ricochet);
        //mpW3 = MediaPlayer.create(this, R.raw.blaster_solo);
        //mpW4 = MediaPlayer.create(this, R.raw.dstar_gun4);
        mpW5 = MediaPlayer.create(this, R.raw.dstar_super1);
        mpW6 = MediaPlayer.create(this, R.raw.falcon_guns);
        mpW7 = MediaPlayer.create(this, R.raw.isd_laser2);

    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SoundBoard", "Audio playback interrupted");
        }
    }

    public void onWeapons1Click(View view) {
        mpW1.seekTo(0);
        Log.e(TAG, "weapons 1 clicked");
        mpW1.start();
    }

    public void onWeapons2Click(View view) {
        mpW2.seekTo(0);
        Log.e(TAG, "weapons 2 clicked");
        mpW2.start();
    }

    public void onWeapons3Click(View view) {
        mpW3.seekTo(0);
        Log.e(TAG, "weapons 3 clicked");
        mpW3.start();
    }

    public void onWeapons4Click(View view) {
        mpW4.seekTo(0);
        Log.e(TAG, "weapons 4 clicked");
        mpW4.start();
    }

    public void onWeapons5Click(View view) {
        mpW5.seekTo(0);
        Log.e(TAG, "weapons 5 clicked");
        mpW5.start();
    }

    public void onWeapons6Click(View view) {
        mpW6.seekTo(0);
        Log.e(TAG, "weapons 6 clicked");
        mpW6.start();
    }

    public void onWeapons7Click(View view) {
        mpW7.seekTo(0);
        Log.e(TAG, "weapons 7 clicked");
        mpW7.start();
    }
}