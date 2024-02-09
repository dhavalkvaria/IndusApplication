package com.ambaitsystem.indusapplication;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class l_play_media extends Activity implements OnClickListener {
	Button btnStartSong;
	Button btnStopSong;
	MediaPlayer mediaPlayer;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.l_play_media);

		btnStartSong = (Button) findViewById(R.id.btnstartsong);
		btnStartSong.setOnClickListener(this);

		btnStopSong = (Button) findViewById(R.id.btnstopsong);
		btnStopSong.setOnClickListener(this);

	}


	@Override
	public void onClick(View v) {
		switch (v.getId())
		{
			case R.id.btnstartsong:
				mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.jatnjuliet);
				mediaPlayer.start();

				break;

			case R.id.btnstopsong:
				Log.v("Stop","True");
				mediaPlayer.stop();
				break;
		}

	}
}
