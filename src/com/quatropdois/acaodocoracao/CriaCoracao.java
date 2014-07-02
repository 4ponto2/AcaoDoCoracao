package com.quatropdois.acaodocoracao;

import java.util.Timer;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.VideoView;

public class CriaCoracao extends Activity {
	
	VideoView video;
	Intent changeOnTime;
	int ii;
	Timer t = new Timer();
	
	private int sentimento = 0;
	
	private int coracao = 0;
	
	private int textura = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cria_coracao);

		changeOnTime = new Intent(CriaCoracao.this, Tela_Final.class);
		
		video = (VideoView) findViewById(R.id.vidCoracao);
		String urlpath = "android.resource://" + getPackageName() + "/" + R.raw.costura_1;
		
		video.setVideoURI(Uri.parse(urlpath));
		
		video.start();
		
        Intent iin = getIntent();
        Bundle extras = iin.getExtras();
        coracao = (int) extras.getInt("coracao");
        textura = (int) extras.getInt("textura");
        sentimento = (int) extras.getInt("sentimento");
		
		ii = video.getDuration();
		

		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			
			@Override
			public void onCompletion(MediaPlayer mp) {
				// TODO Auto-generated method stub
				Log.i("VIDE", "FIM");
	        	changeOnTime.putExtra("coracao", coracao);
	        	changeOnTime.putExtra("textura", textura);
	        	changeOnTime.putExtra("sentimento", sentimento);
				startActivity(changeOnTime);
				CriaCoracao.this.finish();
				
			}
		});
		
//		for (int i=0; i>ii; i++){
//			Log.i("teste", "teste");
//		}
		
//		new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                final Intent changeOnTime = new Intent(CriaCoracao.this, Tela_Final.class);
//                CriaCoracao.this.startActivity(changeOnTime);
//                CriaCoracao.this.finish();
//            }
//        }, 5000);
		
	}

}
	