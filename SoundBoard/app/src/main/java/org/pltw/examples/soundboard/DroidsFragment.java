package org.pltw.examples.soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by anthony90113 on 5/24/2017.
 */
public class DroidsFragment extends Fragment {

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

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_droids, container, false);

        droid1 = (Button) rootView.findViewById(R.id.droid_button1);
        droid2 = (Button) rootView.findViewById(R.id.droid_button2);
        droid3 = (Button) rootView.findViewById(R.id.droid_button3);
        droid4 = (Button) rootView.findViewById(R.id.droid_button4);
        droid5 = (Button) rootView.findViewById(R.id.droid_button5);
        droid6 = (Button) rootView.findViewById(R.id.droid_button6);
        droid7 = (Button) rootView.findViewById(R.id.droid_button7);
        droid8 = (Button) rootView.findViewById(R.id.droid_button8);


        droidSound1 = MediaPlayer.create(getActivity(), R.raw.c3po_alerted);
        droidSound2 = MediaPlayer.create(getActivity(), R.raw.c3po_technical);
        droidSound3 = MediaPlayer.create(getActivity(), R.raw.c3po_yourfault);
        droidSound4 = MediaPlayer.create(getActivity(), R.raw.deity);
        droidSound5 = MediaPlayer.create(getActivity(), R.raw.dialect);
        droidSound6 = MediaPlayer.create(getActivity(), R.raw.r2d2_01);
        droidSound7 = MediaPlayer.create(getActivity(), R.raw.suffer);
        droidSound8 = MediaPlayer.create(getActivity(), R.raw.twirp);

        droid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                droidSound1.seekTo(0);
                Log.e(TAG, "Droid 1 Clicked");
                droidSound1.start();
            }
        });

        droid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                droidSound2.seekTo(0);
                Log.e(TAG, "Droid 2 Clicked");
                droidSound2.start();
            }
        });

        droid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                droidSound3.seekTo(0);
                Log.e(TAG, "Droid 3 Clicked");
                droidSound3.start();
            }
        });

        droid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                droidSound4.seekTo(0);
                Log.e(TAG, "Droid 4 Clicked");
                droidSound4.start();
            }
        });

        droid5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                droidSound5.seekTo(0);
                Log.e(TAG, "Droid 5 Clicked");
                droidSound5.start();
            }
        });

        droid6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                droidSound6.seekTo(0);
                Log.e(TAG, "Droid 6 Clicked");
                droidSound6.start();
            }
        });

        droid7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                droidSound7.seekTo(0);
                Log.e(TAG, "Droid 7 Clicked");
                droidSound7.start();
            }
        });

        droid8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                droidSound8.seekTo(0);
                Log.e(TAG, "Droid 8 Clicked");
                droidSound8.start();
            }
        });


        return rootView;
    }
}



