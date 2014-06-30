package com.quatropdois.acaodocoracao;

import java.util.Timer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

public class CriaCoracao extends Activity {
	
	VideoView video;
	Intent changeOnTime;
	
	Timer t = new Timer();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cria_coracao);
		
		video = (VideoView) findViewById(R.id.vidCoracao);
		String urlpath = "android.resource://" + getPackageName() + "/" + R.raw.costura_1;
		
		video.setVideoURI(Uri.parse(urlpath));
		
		video.start();
		
		new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent changeOnTime = new Intent(CriaCoracao.this, Tela_Final.class);
                CriaCoracao.this.startActivity(changeOnTime);
                CriaCoracao.this.finish();
            }
        }, 5000);
		
	}
}
	
	