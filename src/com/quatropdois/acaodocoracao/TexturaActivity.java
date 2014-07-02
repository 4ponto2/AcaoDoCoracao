package com.quatropdois.acaodocoracao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TexturaActivity extends Activity
{
    
    private boolean wasExecuted = false;
    public TextView t;
    
    private int coracao = 0;
    private int textura = 0;
    
//	public ImageView	viewCor;
	
//	Texturas texturas;

	private Intent nextScreen;
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textura_activity);
        init();
//        texturas = new Texturas(this);
    	nextScreen = new Intent(getApplicationContext(), Sentimento_activity.class);
    }
    public void init()
    {
    	
        wasExecuted = false;
        
//        viewCor  = (ImageView)findViewById(R.id.img_cor);
        
        Intent iin = getIntent();
        Bundle extras = iin.getExtras();
        coracao = (int) extras.getInt("coracao");

        
    }
    
    
    public void selectCoracao(View view)
    {
        if(!wasExecuted){


        	switch(view.getId()) {
        	
	        case R.id.textBtn1:
	        	textura = 1;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn2:
	        	textura = 2;
	        	onNextButton(view);
//            	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn3:
	        	textura = 3;
	        	onNextButton(view);
//            	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn4:
	        	textura = 4;
	        	onNextButton(view);
//            	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn5:
	        	textura = 5;
	        	onNextButton(view);
//            	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn6:
	        	textura = 6;
	        	onNextButton(view);
//            	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn7:
	        	textura = 7;
	        	onNextButton(view);
//            	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn8:
	        	textura = 8;
	        	onNextButton(view);
//            	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn9:
	        	textura = 9;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn10:
	        	textura = 10;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn11:
	        	textura = 11;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn12:
	        	textura = 12;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn13:
	        	textura = 13;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn14:
	        	textura = 14;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn15:
	        	textura = 15;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn16:
	        	textura = 16;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn17:
	        	textura = 17;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn18:
	        	textura = 18;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn19:
	        	textura = 19;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn20:
	        	textura = 20;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn21:
	        	textura = 21;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn22:
	        	textura = 22;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn23:
	        	textura = 23;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn24:
	        	textura = 24;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn25:
	        	textura = 25;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn26:
	        	textura = 26;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn27:
	        	textura = 27;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn28:
	        	textura = 28;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn29:
	        	textura = 29;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn30:
	        	textura = 30;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn31:
	        	textura = 31;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn32:
	        	textura = 32;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn33:
	        	textura = 33;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn34:
	        	textura = 34;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn35:
	        	textura = 35;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn36:
	        	textura = 36;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn37:
	        	textura = 37;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn38:
	        	textura = 38;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn39:
	        	textura = 39;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn40:
	        	textura = 40;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn41:
	        	textura = 41;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn42:
	        	textura = 42;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn43:
	        	textura = 43;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn44:
	        	textura = 44;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn45:
	        	textura = 45;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
	        case R.id.textBtn46:
	        	textura = 46;
	        	onNextButton(view);
//	        	texturas.texturas(coracao, textura);
	          break;
	          
			default:
				Toast.makeText(getApplicationContext(), "Textura não encontrada", Toast.LENGTH_LONG).show();
				break;
	      }
//        	onNextButton(view);
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
    	    wasExecuted = true;
        	nextScreen.putExtra("coracao", coracao);
        	nextScreen.putExtra("textura", textura);
        	startActivity(nextScreen);
        }
//    	MainActivity.this.startActivity(nextScreen);
    }
}
