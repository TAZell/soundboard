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
    public Button mWeapons8;
    public Button mWeapons9;
    public Button mWeapons10;
    public Button mWeapons11;
    public Button mWeapons12;
    public Button mWeapons13;
    public Button mWeapons14;
    public Button mWeapons15;

    private MediaPlayer mpW1;
    private MediaPlayer mpW2;
    private MediaPlayer mpW3;
    private MediaPlayer mpW4;
    private MediaPlayer mpW5;
    private MediaPlayer mpW6;
    private MediaPlayer mpW7;
    private MediaPlayer mpW8;
    private MediaPlayer mpW9;
    private MediaPlayer mpW10;
    private MediaPlayer mpW11;
    private MediaPlayer mpW12;
    private MediaPlayer mpW13;
    private MediaPlayer mpW14;
    private MediaPlayer mpW15;


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
        mWeapons8 = (Button) findViewById(R.id.Weapons8);
        mWeapons9 = (Button) findViewById(R.id.Weapons9);
        mWeapons10 = (Button) findViewById(R.id.Weapons10);
        mWeapons11 = (Button) findViewById(R.id.Weapons11);
        mWeapons12 = (Button) findViewById(R.id.Weapons12);
        mWeapons13 = (Button) findViewById(R.id.Weapons13);
        mWeapons14 = (Button) findViewById(R.id.Weapons14);
        mWeapons15 = (Button) findViewById(R.id.Weapons15);


        mpW1 = MediaPlayer.create(this, R.raw.aat_gun);
        mpW2 = MediaPlayer.create(this, R.raw.atat_sideguns);
        mpW3 = MediaPlayer.create(this, R.raw.atst_chinguns);
        mpW4 = MediaPlayer.create(this, R.raw.dstar_super1);
        mpW5 = MediaPlayer.create(this, R.raw.falcon_guns);
        mpW6 = MediaPlayer.create(this, R.raw.isd_laser2);
        mpW7 = MediaPlayer.create(this, R.raw.lightsaber_01);
        mpW8 = MediaPlayer.create(this, R.raw.lightsaber_04);
        mpW9 = MediaPlayer.create(this, R.raw.naboo_torp);
        mpW10 = MediaPlayer.create(this, R.raw.probe_gun);
        mpW11 = MediaPlayer.create(this, R.raw.slave1_guns);
        mpW12 = MediaPlayer.create(this, R.raw.slave1_seismic);
        mpW13 = MediaPlayer.create(this, R.raw.tie_fire);
        mpW14 = MediaPlayer.create(this, R.raw.xwing_laser);
        mpW15 = MediaPlayer.create(this, R.raw.xwing_proton);

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

    public void onWeapons8Click(View view) {
        mpW8.seekTo(0);
        Log.e(TAG, "weapons 8 clicked");
        mpW8.start();
    }

    public void onWeapons9Click(View view) {
        mpW9.seekTo(0);
        Log.e(TAG, "weapons 9 clicked");
        mpW9.start();
    }

    public void onWeapons10Click(View view) {
        mpW10.seekTo(0);
        Log.e(TAG, "weapons 10 clicked");
        mpW10.start();
    }

    public void onWeapons11Click(View view) {
        mpW11.seekTo(0);
        Log.e(TAG, "weapons 11 clicked");
        mpW11.start();
    }

    public void onWeapons12Click(View view) {
        mpW12.seekTo(0);
        Log.e(TAG, "weapons 12 clicked");
        mpW12.start();
    }

    public void onWeapons13Click(View view) {
        mpW13.seekTo(0);
        Log.e(TAG, "weapons 13 clicked");
        mpW13.start();
    }

    public void onWeapons14Click(View view) {
        mpW14.seekTo(0);
        Log.e(TAG, "weapons 14 clicked");
        mpW14.start();
    }

    public void onWeapons15Click(View view) {
        mpW15.seekTo(0);
        Log.e(TAG, "weapons 15 clicked");
        mpW15.start();
    }
}