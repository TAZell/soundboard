package org.pltw.examples.soundboard;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by anthony90113 on 5/19/2017.
 */
public class JediFragment extends Fragment{

    private static final String TAG = "tag";

    private Button jedi1;
    private Button jedi2;
    private Button jedi3;
    private Button jedi4;
    private Button jedi5;
    private Button jedi6;
    private MediaPlayer jedSound1;
    private MediaPlayer jedSound2;
    private MediaPlayer jedSound3;
    private MediaPlayer jedSound4;
    private MediaPlayer jedSound5;
    private MediaPlayer jedSound6;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_jedi, container, false);

            jedi1 = (Button) rootView.findViewById(R.id.jedi_button1);
            jedi2 = (Button) rootView.findViewById(R.id.jedi_button2);
            jedi3 = (Button) rootView.findViewById(R.id.jedi_button3);
            jedi4 = (Button) rootView.findViewById(R.id.jedi_button4);
            jedi5 = (Button) rootView.findViewById(R.id.jedi_button5);
            jedi6 = (Button) rootView.findViewById(R.id.jedi_button6);

            /*jedSound1 = MediaPlayer.create(this, R.raw.adventureheh);
            jedSound2 = MediaPlayer.create(this, R.raw.helpyou);
            jedSound3 = MediaPlayer.create(this, R.raw.lookfor);
            jedSound4 = MediaPlayer.create(this, R.raw.nomoon);
            jedSound5 = MediaPlayer.create(this, R.raw.theforcewillbewithyou);
            jedSound6 = MediaPlayer.create(this, R.raw.yoda_whyareyouhere);*/


            return rootView;

        }

    public void onJedi_1Click(Context context){
        jedSound1 = MediaPlayer.create(context, R.raw.adventureheh);
        jedSound1.seekTo(0);
        Log.e(TAG, "Jedi 1 Clicked");
        jedSound1.start();
    }

    public void onJedi_2Click(View v){
        jedSound2.seekTo(0);
        Log.e(TAG, "Jedi 2 Clicked");
        jedSound2.start();
    }

    public void onJedi_3Click(View v){
        jedSound3.seekTo(0);
        Log.e(TAG, "Jedi 1 Clicked");
        jedSound3.start();
    }

    public void onJedi_4Click(View v){
        jedSound4.seekTo(0);
        Log.e(TAG, "Jedi 1 Clicked");
        jedSound4.start();
    }

    public void onJedi_5Click(View v){
        jedSound5.seekTo(0);
        Log.e(TAG, "Jedi 1 Clicked");
        jedSound5.start();
    }

    public void onJedi_6Click(View v){
        jedSound6.seekTo(0);
        Log.e(TAG, "Jedi 1 Clicked");
        jedSound6.start();
    }
}