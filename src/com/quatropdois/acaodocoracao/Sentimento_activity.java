package com.quatropdois.acaodocoracao;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Sentimento_activity extends Activity {
	
	private boolean wasExecuted = false;
	
	private Intent nextScreen;
	
	private int coracao = 0;
	
	private int textura = 0;
	
	private int sentimento;
	
	public ImageView viewCor;
	
	public ImageButton btn_sent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sentimento_activity);

    	nextScreen = new Intent(getApplicationContext(), CriaCoracao.class);
    	
    	AdView adView = (AdView)this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        
    	init();

	}
	
    public void init()
    {
    	
        wasExecuted = false;

        viewCor  = (ImageView)findViewById(R.id.img_cor);
        
        sentimento = 0;
        
        Intent iin = getIntent();
        Bundle extras = iin.getExtras();
        coracao = (int) extras.getInt("coracao");
        textura = (int) extras.getInt("textura");
        
    }
    
    public void selectSentimento(View view)
    {
        if(!wasExecuted){

        	view.setSelected(true);
        	
        	
        	switch(view.getId()) {
        	
	        case R.id.BtnSent1:
	        	sentimento = 1;
//	        	btn_sent = (ImageButton)findViewById(R.id.BtnSent1);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent2:
	        	sentimento = 2;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent3:
	        	sentimento = 3;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent4:
	        	sentimento = 4;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent5:
	        	sentimento = 5;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent6:
	        	sentimento = 6;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent7:
	        	sentimento = 7;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent8:
	        	sentimento = 8;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent9:
	        	sentimento = 9;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent10:
	        	sentimento = 10;
//	        	texturas.texturas(coracao, textura);
	          break;
	        	
	        case R.id.BtnSent11:
	        	sentimento = 11;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent12:
	        	sentimento = 12;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent13:
	        	sentimento = 13;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent14:
	        	sentimento = 14;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent15:
	        	sentimento = 15;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent16:
	        	sentimento = 16;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent17:
	        	sentimento = 17;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent18:
	        	sentimento = 18;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent19:
	        	sentimento = 19;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent20:
	        	sentimento = 20;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent21:
	        	sentimento = 21;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent22:
	        	sentimento = 22;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent23:
	        	sentimento = 23;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent24:
	        	sentimento = 24;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent25:
	        	sentimento = 25;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent26:
	        	sentimento = 26;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent27:
	        	sentimento = 27;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent28:
	        	sentimento = 28;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent29:
	        	sentimento = 29;
//	        	texturas.texturas(coracao, textura);
	          break;
	        
	        case R.id.BtnSent30:
	        	sentimento = 30;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent31:
	        	sentimento = 31;
//	        	texturas.texturas(coracao, textura);
	          break;
	        case R.id.BtnSent32:
	        	sentimento = 32;
//	        	texturas.texturas(coracao, textura);
	          break;	
	        case R.id.BtnSent33:
	        	sentimento = 33;
//	        	texturas.texturas(coracao, textura);
	          break;	
	        case R.id.BtnSent34:
	        	sentimento = 34;
//	        	texturas.texturas(coracao, textura);
	          break;	
	        case R.id.BtnSent35:
	        	sentimento = 35;
//	        	texturas.texturas(coracao, textura);
	          break;	
	        case R.id.BtnSent36:
	        	sentimento = 36;
//	        	texturas.texturas(coracao, textura);
	          break;	
	        case R.id.BtnSent37:
	        	sentimento = 37;
//	        	texturas.texturas(coracao, textura);
	          break;	
	        case R.id.BtnSent38:
	        	sentimento = 38;
//	        	texturas.texturas(coracao, textura);
	          break;	
	        case R.id.BtnSent39:
	        	sentimento = 39;
//	        	texturas.texturas(coracao, textura);
	          break;	
	        case R.id.BtnSent40:
	        	sentimento = 40;
//	        	texturas.texturas(coracao, textura);
	          break;	
	          
	        case R.id.BtnSent41:
	        	sentimento = 41;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent42:
	        	sentimento = 42;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent43:
	        	sentimento = 43;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent44:
	        	sentimento = 44;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent45:
	        	sentimento = 45;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent46:
	        	sentimento = 46;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent47:
	        	sentimento = 47;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent48:
	        	sentimento = 48;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent49:
	        	sentimento = 49;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent50:
	        	sentimento = 50;
//	        	texturas.texturas(coracao, textura);
	          break;	 
	          
	        case R.id.BtnSent51:
	        	sentimento = 51;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent52:
	        	sentimento = 52;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent53:
	        	sentimento = 53;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent54:
	        	sentimento = 54;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent55:
	        	sentimento = 55;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent56:
	        	sentimento = 56;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent57:
	        	sentimento = 57;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent58:
	        	sentimento = 58;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent59:
	        	sentimento = 59;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent60:
	        	sentimento = 60;
//	        	texturas.texturas(coracao, textura);
	          break;	          
	          
	        case R.id.BtnSent61:
	        	sentimento = 61;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent62:
	        	sentimento = 62;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent63:
	        	sentimento = 63;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent64:
	        	sentimento = 64;
//	        	texturas.texturas(coracao, textura);
	          break;
	          	    
	      }
        	Log.i("SENTIMENTO", "sentimento: " + sentimento);
        	onNextButton(view);

        }

    }
    
	
    public void onNextButton(View view){

        Log.i("CORACAO: ", "coracao: " + coracao);
        Log.i("TEXTURA: ", "textura: " + textura);
        Log.i("SENTIMENTO: ", "sentimento: " + sentimento);
    	if(!wasExecuted){
    	    wasExecuted = true;
        	nextScreen.putExtra("coracao", coracao);
        	nextScreen.putExtra("textura", textura);
        	nextScreen.putExtra("sentimento", sentimento);
        	startActivity(nextScreen);
        }
//    	MainActivity.this.startActivity(nextScreen);
    }

    public void onBackPressed(){
        Sentimento_activity.this.finish();
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
        getParent().finish();
    }
    
}
