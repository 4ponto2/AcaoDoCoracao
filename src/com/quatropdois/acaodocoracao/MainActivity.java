package com.quatropdois.acaodocoracao;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity
{
    
    private boolean wasExecuted = false;
    
    private int coracao = 0;
      
//    private int qtd;
    
    sharedPreference qtdUso;
	
	private Intent nextScreen;
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
        
    	AdView adView = (AdView)this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        
        init();
//        nextScreen = new Intent(getApplicationContext(), TexturaActivity.class);
    	nextScreen = new Intent(getApplicationContext(), TexturaActivity.class);
    }
    
    public void init()
    {
    	
        wasExecuted = false;
        
        qtdUso = new sharedPreference(getApplicationContext());
        
//        qtd = qtdUso.getInt("qtduso");
        
    }
    
    
    public void selectCoracao(View view)
    {
        if(!wasExecuted){

        	switch(view.getId()) {
        	
	        case R.id.imgBtn1:
	        	coracao = 1;
	          break;
	          
	        case R.id.imgBtn2:
	        	coracao = 2;
	          break;
	          
	        case R.id.imgBtn3:
	        	coracao = 3;
	          break;
	          
	        case R.id.imgBtn4:
	        	coracao = 4;
	          break;
	          
	        case R.id.imgBtn5:
	        	coracao = 5;
	          break;
	          
	        case R.id.imgBtn6:
	        	coracao = 6;
	          break;
	          
	        case R.id.imgBtn7:
	        	coracao = 7;
	          break;
	          
	        case R.id.imgBtn8:
	        	coracao = 8;
	          break;
	          
	      }onNextButton(view);
        }
    }
   
    
    public void onBackPressed(){
        MainActivity.this.finish();
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
        getParent().finish();
    }
    
    
    public void onNextButton(View view){
    	if(!wasExecuted){
    	    wasExecuted = true;
        	nextScreen.putExtra("coracao", coracao);
        	startActivity(nextScreen);
        }
//    	MainActivity.this.startActivity(nextScreen);
    }
    
}
