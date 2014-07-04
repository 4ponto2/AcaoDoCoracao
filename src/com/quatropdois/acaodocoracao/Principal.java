package com.quatropdois.acaodocoracao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Principal extends Activity {

	private boolean wasExecuted = false;
    private Intent mainActivity, geoActivity, aAcao, associacao;
    

    sharedPreference qtdUso;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		setContentView(R.layout.principal);
    	super.onCreate(savedInstanceState);
        AdView adView = (AdView)this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    	init();
	}
    
    public void init()
    {
    	mainActivity = new Intent(getApplicationContext(), MainActivity.class);
    	geoActivity  = new Intent(getApplicationContext(), GeoActivity.class);
    	aAcao  = new Intent(getApplicationContext(), AAcaoActivity.class);
    	associacao  = new Intent(getApplicationContext(), AassociacaoActivity.class);
        wasExecuted = false;
    }
    
    public void reinicio_contador(View view){
    	qtdUso = new sharedPreference(getApplicationContext());
    	qtdUso.remove("qtduso");    	
    }  
        
    public void criaCoracao(View view)
    {
    	if(!wasExecuted){
        	Log.v(null, "countdown started");
    	    wasExecuted = true;
            startActivity(mainActivity);
        }
    }
    
    public void geoActivity(View view){
    	
    	startActivity(geoActivity);
    	
    }
    
    public void associacao(View view){
    	
    	startActivity(associacao);
    	
    }
    
    public void aacao(View view){
    	
    	startActivity(aAcao);
    	
    }    

    public void onBackPressed(){
    	   Log.i("HA", "Finishing");
    	   Intent intent = new Intent(Intent.ACTION_MAIN);
    	   intent.addCategory(Intent.CATEGORY_HOME);
    	   intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    	   startActivity(intent);
    }

}
