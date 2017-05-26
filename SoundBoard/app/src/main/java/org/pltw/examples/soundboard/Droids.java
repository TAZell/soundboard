package org.pltw.examples.soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by anthony90113 on 5/18/2017.
 */
public class Droids extends MainActivity {
    private static final String TAG = "tag";

    private Button droid1;
    private Button droid2;
    private Button droid3;
    private Button droid4;
    private Button droid5;
    private Button droid6;
    private Button droid7;
    private Button droid8;
    private MediaPlayer droidSound1;
    private MediaPlayer droidSound2;
    private MediaPlayer droidSound3;
    private MediaPlayer droidSound4;
    private MediaPlayer droidSound5;
    private MediaPlayer droidSound6;
    private MediaPlayer droidSound7;
    private MediaPlayer droidSound8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_droids);

        droid1 = (Button) findViewById(R.id.droid_button1);
        droid2 = (Button) findViewById(R.id.droid_button2);
        droid3 = (Button) findViewById(R.id.droid_button3);
        droid4 = (Button) findViewById(R.id.droid_button4);
        droid5 = (Button) findViewById(R.id.droid_button5);
        droid6 = (Button) findViewById(R.id.droid_button6);
        droid7 = (Button) findViewById(R.id.droid_button7);
        droid8 = (Button) findViewById(R.id.droid_button8);

        droidSound1 = MediaPlayer.create(this, R.raw.c3po_alerted);
        droidSound2 = MediaPlayer.create(this, R.raw.c3po_technical);
        droidSound3 = MediaPlayer.create(this, R.raw.c3po_yourfault);
        droidSound4 = MediaPlayer.create(this, R.raw.deity);
        droidSound5 = MediaPlayer.create(this, R.raw.dialect);
        droidSound6 = MediaPlayer.create(this, R.raw.r2d2_01);
        droidSound7 = MediaPlayer.create(this, R.raw.suffer);
        droidSound8 = MediaPlayer.create(this, R.raw.twirp);
    }

    public void onDroid_1Click(View v){
        droidSound1.seekTo(0);
        Log.e(TAG, "Droid 1 Clicked");
        droidSound1.start();
    }

    public void onDroid_2Click(View v){
        droidSound2.seekTo(0);
        Log.e(TAG, "Droid 2 Clicked");
        droidSound2.start();
    }

    public void onDroid_3Click(View v){
        droidSound3.seekTo(0);
        Log.e(TAG, "Droid 3 Clicked");
        droidSound3.start();
    }

    public void onDroid_4Click(View v){
        droidSound4.seekTo(0);
        Log.e(TAG, "Droid 4 Clicked");
        droidSound4.start();
    }

    public void onDroid_5Click(View v){
        droidSound5.seekTo(0);
        Log.e(TAG, "Droid 5 Clicked");
        droidSound5.start();
    }

    public void onDroid_6Click(View v){
        droidSound6.seekTo(0);
        Log.e(TAG, "Droid 6 Clicked");
        droidSound6.start();
    }

    public void onDroid_7Click(View v){
        droidSound7.seekTo(0);
        Log.e(TAG, "Droid 7 Clicked");
        droidSound7.start();
    }

    public void onDroid_8Click(View v){
        droidSound8.seekTo(0);
        Log.e(TAG, "Droid 8 Clicked");
        droidSound8.start();
    }

}
