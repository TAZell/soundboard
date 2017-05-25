package org.pltw.examples.soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by anthony90113 on 5/18/2017.
 */
public class Sith extends MainActivity {
    private final int WHOLE_NOTE = 1000;
    public static final String TAG = Sith.class.getName();
    public Button mVader1;
    public Button mVader2;
    public Button mVader3;
    public Button mVader4;
    public Button mVader5;
    private MediaPlayer mpDV1;
    private MediaPlayer mpDV2;
    private MediaPlayer mpDV3;
    private MediaPlayer mpDV4;
    private MediaPlayer mpDV5;//end vader
    public Button mVaderObiWan;
    private MediaPlayer mpDVOW;
    //the emperor
    public Button mEmperor1;
    private MediaPlayer mpE1;
    public Button mEmperor2;
    private MediaPlayer mpE2;
    public Button mEmperor3;
    private MediaPlayer mpE3;
    public Button mEmperor4;
    private MediaPlayer mpE4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_sith);

        mVader1 = (Button) findViewById(R.id.vader1);
        mVader2 = (Button) findViewById(R.id.vader2);
        mVader3 = (Button) findViewById(R.id.vader3);
        mVader4 = (Button) findViewById(R.id.vader4);
        mVader5 = (Button) findViewById(R.id.vader5);
        mpDV1 = MediaPlayer.create(this, R.raw.darthvader_yourfather);
        mpDV2 = MediaPlayer.create(this, R.raw.darthvader_dontunderestimate);
        mpDV3 = MediaPlayer.create(this, R.raw.darthvader_failedme);
        mpDV4 = MediaPlayer.create(this, R.raw.dv_disturbg);
        mpDV5 = MediaPlayer.create(this, R.raw.dv_theme);//end vader
        mVaderObiWan = (Button) findViewById(R.id.vader_obi);
        mpDVOW = MediaPlayer.create(this, R.raw.dv_obi_circleiscomplete);
        // the emperor
        mEmperor1 = (Button) findViewById(R.id.emperor1);
        mpE1 = MediaPlayer.create(this, R.raw.e_expect2);
        mEmperor2 = (Button) findViewById(R.id.emperor2);
        mpE2 = MediaPlayer.create(this, R.raw.e_learndarkside);
        mEmperor3 = (Button) findViewById(R.id.emperor3);
        mpE3 = MediaPlayer.create(this, R.raw.e_nomercy);
        mEmperor4 = (Button) findViewById(R.id.emperor4);
        mpE4 = MediaPlayer.create(this, R.raw.e_willdie);
    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SoundBoard", "Audio playback interrupted");
        }

    }

    public void onSith1Click(View view) {
        mpDV1.seekTo(0);
        Log.e(TAG, "Sith 1 clicked");
        mpDV1.start();
    }
    public void onSith2Click(View view) {
        mpDV2.seekTo(0);
        Log.e(TAG, "Sith 2 clicked");
        mpDV2.start();
    }
    public void onSith3Click(View view) {
        mpDV3.seekTo(0);
        Log.e(TAG, "Sith 3 clicked");
        mpDV3.start();
    }
    public void onSith4Click(View view) {
        mpDV4.seekTo(0);
        Log.e(TAG, "Sith 4 clicked");
        mpDV4.start();
    }
    public void onSith5Click(View view) {
        mpDV5.seekTo(0);
        Log.e(TAG, "Sith 5 clicked");
        mpDV5.start();
    }//end vader
    public void onSith6Click(View view) {
        mpDVOW.seekTo(0);
        Log.e(TAG, "Sith 6 clicked");
        mpDVOW.start();
    }//start emperor
    public void onSith7Click(View view) {
        mpE1.seekTo(0);
        Log.e(TAG, "Sith 7 clicked");
        mpE1.start();
    }
    public void onSith8Click(View view) {
        mpE2.seekTo(0);
        Log.e(TAG, "Sith 8 clicked");
        mpE2.start();
    }
    public void onSith9Click(View view) {
        mpE3.seekTo(0);
        Log.e(TAG, "Sith 9 clicked");
        mpE3.start();
    }
    public void onSith10Click(View view) {
        mpE4.seekTo(0);
        Log.e(TAG, "Sith 10 clicked");
        mpE4.start();
    }
}
