package com.quatropdois.acaodocoracao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TexturaActivity extends Activity
{
    
    private boolean wasExecuted = false;
    public TextView t;
    
    private int coracao = 0;
    private int textura = 0;
    
    sharedPreference qtdUso;
    
	public ImageView	viewCor;
	
	Texturas texturas;

	private Intent nextScreen;
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textura_activity);
        init();
        texturas = new Texturas(this);
    	nextScreen = new Intent(getApplicationContext(), Sentimento_activity.class);
    }
    public void init()
    {
    	
        wasExecuted = false;
        
        qtdUso = new sharedPreference(getApplicationContext());

        viewCor  = (ImageView)findViewById(R.id.img_cor);
        
        Intent iin = getIntent();
        Bundle extras = iin.getExtras();
        coracao = (int) extras.getInt("coracao");

        switch (coracao) {
        case 1:
        	viewCor.setImageResource(R.drawable.img1);
        	viewCor.setVisibility(View.VISIBLE);
			break;
        case 2:
        	viewCor.setImageResource(R.drawable.img2);
        	viewCor.setVisibility(View.VISIBLE);
        	break;
        	
        case 3:
        	viewCor.setImageResource(R.drawable.img3);
        	viewCor.setVisibility(View.VISIBLE);        	
        	break;
        	
        case 4:
        	viewCor.setImageResource(R.drawable.img4);
        	viewCor.setVisibility(View.VISIBLE);
        	break;
        	
        case 5:
        	viewCor.setImageResource(R.drawable.img5);
        	viewCor.setVisibility(View.VISIBLE);        	
        	break;
        	
        case 6:
        	viewCor.setImageResource(R.drawable.img6);
        	viewCor.setVisibility(View.VISIBLE);
        	break;
        	
        case 7:
        	viewCor.setImageResource(R.drawable.img7);
        	viewCor.setVisibility(View.VISIBLE);
        	break;
        	
        case 8:
        	viewCor.setImageResource(R.drawable.img8);
        	viewCor.setVisibility(View.VISIBLE);        	
        	break;
        	
		default:
			break;
		}
        
    }
    
    
    public void selectCoracao(View view)
    {
        if(!wasExecuted){


        	switch(view.getId()) {
        	
	        case R.id.textBtn1:
	        	textura = 1;
	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn2:
	        	textura = 2;
            	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn3:
	        	textura = 3;
            	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn4:
	        	textura = 4;
            	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn5:
	        	textura = 5;
            	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn6:
	        	textura = 6;
            	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn7:
	        	textura = 7;
            	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn8:
	        	textura = 8;
            	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn9:
	        	textura = 9;
	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn10:
	        	textura = 10;
	        	texturas.texturas(coracao, textura);
	          break;
	        	
			default:
				Toast.makeText(getApplicationContext(), "Textura não encontrada", Toast.LENGTH_LONG).show();
				break;
	      }
        }
    }
    
    public void onBackPressed(){
        TexturaActivity.this.finish();
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
        getParent().finish();
    }
    
    public void onNextButton(View view){
    	if(!wasExecuted){
        	Log.v(null, "countdown started");
    	    wasExecuted = true;
        	startActivity(nextScreen);
        }
//    	MainActivity.this.startActivity(nextScreen);
    }
}
