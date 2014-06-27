package com.quatropdois.acaodocoracao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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

//        switch (coracao) {
//        case 1:
//        	viewCor.setImageResource(R.drawable.img1);
//        	viewCor.setVisibility(View.VISIBLE);
//			break;
//        case 2:
//        	viewCor.setImageResource(R.drawable.img2);
//        	viewCor.setVisibility(View.VISIBLE);
//        	break;
//        	
//        case 3:
//        	viewCor.setImageResource(R.drawable.img3);
//        	viewCor.setVisibility(View.VISIBLE);        	
//        	break;
//        	
//        case 4:
//        	viewCor.setImageResource(R.drawable.img4);
//        	viewCor.setVisibility(View.VISIBLE);
//        	break;
//        	
//        case 5:
//        	viewCor.setImageResource(R.drawable.img5);
//        	viewCor.setVisibility(View.VISIBLE);        	
//        	break;
//        	
//        case 6:
//        	viewCor.setImageResource(R.drawable.img6);
//        	viewCor.setVisibility(View.VISIBLE);
//        	break;
//        	
//        case 7:
//        	viewCor.setImageResource(R.drawable.img7);
//        	viewCor.setVisibility(View.VISIBLE);
//        	break;
//        	
//        case 8:
//        	viewCor.setImageResource(R.drawable.img8);
//        	viewCor.setVisibility(View.VISIBLE);        	
//        	break;
//        	
//		default:
//			break;
//		}
        
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
