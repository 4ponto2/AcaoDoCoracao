package com.quatropdois.acaodocoracao;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import android.os.Build;

public class Sentimento_activity extends Activity {
	
	private boolean wasExecuted = false;
	
	private Intent nextScreen;
	
	private int frase = 0;
	
	public ImageView viewCor;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sentimento_activity);

    	nextScreen = new Intent(getApplicationContext(), Sentimento_activity.class);

	}
	
    public void init()
    {
    	
        wasExecuted = false;

        viewCor  = (ImageView)findViewById(R.id.img_cor);
        
    }
    
    public void selectSentimento(View view)
    {
        if(!wasExecuted){


        	switch(view.getId()) {
        	
	        case R.id.BtnSent1:
	        	frase = 1;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent2:
	        	frase = 2;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent3:
	        	frase = 3;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent4:
	        	frase = 4;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent5:
	        	frase = 5;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent6:
	        	frase = 6;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent7:
	        	frase = 7;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent8:
	        	frase = 8;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent9:
	        	frase = 9;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent10:
	        	frase = 10;
//	        	texturas.texturas(coracao, textura);
	          break;
	        	
	        case R.id.BtnSent11:
	        	frase = 11;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent12:
	        	frase = 12;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent13:
	        	frase = 13;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent14:
	        	frase = 14;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent15:
	        	frase = 15;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent16:
	        	frase = 16;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent17:
	        	frase = 17;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent18:
	        	frase = 18;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent19:
	        	frase = 19;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent20:
	        	frase = 20;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent21:
	        	frase = 21;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent22:
	        	frase = 22;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent23:
	        	frase = 23;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent24:
	        	frase = 24;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent25:
	        	frase = 25;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent26:
	        	frase = 26;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent27:
	        	frase = 27;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent28:
	        	frase = 28;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent29:
	        	frase = 29;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent30:
	        	frase = 30;
//	        	texturas.texturas(coracao, textura);
	          break;	 
	          
	        case R.id.BtnSent41:
	        	frase = 41;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent42:
	        	frase = 42;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent43:
	        	frase = 43;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent44:
	        	frase = 44;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent45:
	        	frase = 45;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent46:
	        	frase = 46;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent47:
	        	frase = 47;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent48:
	        	frase = 48;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent49:
	        	frase = 49;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent50:
	        	frase = 50;
//	        	texturas.texturas(coracao, textura);
	          break;	 
	          
	        case R.id.BtnSent51:
	        	frase = 51;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent52:
	        	frase = 52;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent53:
	        	frase = 53;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent54:
	        	frase = 54;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent55:
	        	frase = 55;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent56:
	        	frase = 56;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent57:
	        	frase = 57;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent58:
	        	frase = 58;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent59:
	        	frase = 59;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent60:
	        	frase = 60;
//	        	texturas.texturas(coracao, textura);
	          break;	          
	          
	        case R.id.BtnSent61:
	        	frase = 1;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent62:
	        	frase = 2;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent63:
	        	frase = 3;
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.BtnSent64:
	        	frase = 4;
//	        	texturas.texturas(coracao, textura);
	          break;
	          	          
			default:
				Toast.makeText(getApplicationContext(), "Textura não encontrada", Toast.LENGTH_LONG).show();
				break;
	      }
        }
    }
	
    public void onNextButton(View view){
    	if(!wasExecuted){
        	Log.v(null, "countdown started");
    	    wasExecuted = true;
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
