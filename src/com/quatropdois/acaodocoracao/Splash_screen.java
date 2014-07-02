package com.quatropdois.acaodocoracao;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Splash_screen extends Activity {

    protected static final String TAG = "SplashScreen";
	private static final long TEMPO_DURACAO_ENTRADA = 2000;

//	novo
	 public void onAttachedToWindow() {
			super.onAttachedToWindow();
			Window window = getWindow();
			window.setFormat(PixelFormat.RGBA_8888);
		}
	 
//	 novo
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //No layout splash_screen é onde pode ser mudado a imagem de exibição
        setContentView(R.layout.splash_screen);
        
//        novo
        StartAnimations();
        
        //Metodo que funciona como contador para chamada da nova activity
        new Handler().postDelayed(new Runnable() {
			
			public void run() {
				try{
					//Metodo que invoca a outra activity
					startActivity(new Intent(Splash_screen.this, Principal.class));
				}catch(ActivityNotFoundException e){
					Log.e(TAG, e.getMessage());
				}
			}
		}, TEMPO_DURACAO_ENTRADA);
    }
	
//	novo
	
    private void StartAnimations() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();
        RelativeLayout l=(RelativeLayout) findViewById(R.id.lin_lay);
        l.clearAnimation();
        l.startAnimation(anim);
        
        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        ImageView iv = (ImageView) findViewById(R.id.logo);
        iv.clearAnimation();
        iv.startAnimation(anim);
   
    }


}
