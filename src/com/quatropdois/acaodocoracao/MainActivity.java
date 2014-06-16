package com.quatropdois.acaodocoracao;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity
{
    
    private boolean wasExecuted = false;
    
    public static int coracao;
    
    
//    private Intent main;
//    
//    private int qtd;
    
    sharedPreference qtdUso;
    
	private ImageView 	viewIMG1, 
						viewIMG2, 
						viewIMG3, 
						viewIMG4, 
						viewIMG5, 
						viewIMG6, 
						viewIMG7, 
						viewIMG8;
    
	private	Button	btnNext;
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
        init();
    }
    
    public void init()
    {
    	
        wasExecuted = false;
        
        qtdUso = new sharedPreference(getApplicationContext());
        
        viewIMG1 = (ImageView)findViewById(R.id.img1);
        
        viewIMG2 = (ImageView)findViewById(R.id.img2);
        
        viewIMG3 = (ImageView)findViewById(R.id.img3);
        
        viewIMG4 = (ImageView)findViewById(R.id.img4);
        
        viewIMG5 = (ImageView)findViewById(R.id.img5);
        
        viewIMG6 = (ImageView)findViewById(R.id.img6);
        
        viewIMG7 = (ImageView)findViewById(R.id.img7);
        
        viewIMG8 = (ImageView)findViewById(R.id.img8);
        
        btnNext	= (Button)findViewById(R.id.select);
        
//        qtd = qtdUso.getInt("qtduso");
        
    }
    
    
    public void selectCoracao(View view)
    {
        if(!wasExecuted){

        	switch(view.getId()) {
        	
	        case R.id.imgBtn1:
	        	coracao = 1;
        		viewIMG1 .setVisibility(View.VISIBLE);
        		viewIMG2 .setVisibility(View.INVISIBLE);
        		viewIMG3 .setVisibility(View.INVISIBLE);
        		viewIMG4 .setVisibility(View.INVISIBLE);
        		viewIMG5 .setVisibility(View.INVISIBLE);
        		viewIMG6 .setVisibility(View.INVISIBLE);
        		viewIMG7 .setVisibility(View.INVISIBLE);
        		viewIMG8 .setVisibility(View.INVISIBLE);
        		btnNext .setVisibility(View.VISIBLE);
	          break;
	          
	        case R.id.imgBtn2:
	        	coracao = 2;
        		viewIMG1 .setVisibility(View.INVISIBLE);
        		viewIMG2 .setVisibility(View.VISIBLE);
        		viewIMG3 .setVisibility(View.INVISIBLE);
        		viewIMG4 .setVisibility(View.INVISIBLE);
        		viewIMG5 .setVisibility(View.INVISIBLE);
        		viewIMG6 .setVisibility(View.INVISIBLE);
        		viewIMG7 .setVisibility(View.INVISIBLE);
        		viewIMG8 .setVisibility(View.INVISIBLE);
        		btnNext .setVisibility(View.VISIBLE);
	          break;
	          
	        case R.id.imgBtn3:
	        	coracao = 3;
        		viewIMG1 .setVisibility(View.INVISIBLE);
        		viewIMG2 .setVisibility(View.INVISIBLE);
        		viewIMG3 .setVisibility(View.VISIBLE);
        		viewIMG4 .setVisibility(View.INVISIBLE);
        		viewIMG5 .setVisibility(View.INVISIBLE);
        		viewIMG6 .setVisibility(View.INVISIBLE);
        		viewIMG7 .setVisibility(View.INVISIBLE);
        		viewIMG8 .setVisibility(View.INVISIBLE);
        		btnNext .setVisibility(View.VISIBLE);
	          break;
	          
	        case R.id.imgBtn4:
	        	coracao = 4;
        		viewIMG1 .setVisibility(View.INVISIBLE);
        		viewIMG2 .setVisibility(View.INVISIBLE);
        		viewIMG3 .setVisibility(View.INVISIBLE);
        		viewIMG4 .setVisibility(View.VISIBLE);
        		viewIMG5 .setVisibility(View.INVISIBLE);
        		viewIMG6 .setVisibility(View.INVISIBLE);
        		viewIMG7 .setVisibility(View.INVISIBLE);
        		viewIMG8 .setVisibility(View.INVISIBLE);
	          break;
	          
	        case R.id.imgBtn5:
	        	coracao = 5;
        		viewIMG1 .setVisibility(View.INVISIBLE);
        		viewIMG2 .setVisibility(View.INVISIBLE);
        		viewIMG3 .setVisibility(View.INVISIBLE);
        		viewIMG4 .setVisibility(View.INVISIBLE);
        		viewIMG5 .setVisibility(View.VISIBLE);
        		viewIMG6 .setVisibility(View.INVISIBLE);
        		viewIMG7 .setVisibility(View.INVISIBLE);
        		viewIMG8 .setVisibility(View.INVISIBLE);
	          break;
	          
	        case R.id.imgBtn6:
	        	coracao = 6;
        		viewIMG1 .setVisibility(View.INVISIBLE);
        		viewIMG2 .setVisibility(View.INVISIBLE);
        		viewIMG3 .setVisibility(View.INVISIBLE);
        		viewIMG4 .setVisibility(View.INVISIBLE);
        		viewIMG5 .setVisibility(View.INVISIBLE);
        		viewIMG6 .setVisibility(View.VISIBLE);
        		viewIMG7 .setVisibility(View.INVISIBLE);
        		viewIMG8 .setVisibility(View.INVISIBLE);
	          break;
	          
	        case R.id.imgBtn7:
	        	coracao = 7;
        		viewIMG1 .setVisibility(View.INVISIBLE);
        		viewIMG2 .setVisibility(View.INVISIBLE);
        		viewIMG3 .setVisibility(View.INVISIBLE);
        		viewIMG4 .setVisibility(View.INVISIBLE);
        		viewIMG5 .setVisibility(View.INVISIBLE);
        		viewIMG6 .setVisibility(View.INVISIBLE);
        		viewIMG7 .setVisibility(View.VISIBLE);
        		viewIMG8 .setVisibility(View.INVISIBLE);
	          break;
	          
	        case R.id.imgBtn8:
	        	coracao = 8;
        		viewIMG1 .setVisibility(View.INVISIBLE);
        		viewIMG2 .setVisibility(View.INVISIBLE);
        		viewIMG3 .setVisibility(View.INVISIBLE);
        		viewIMG4 .setVisibility(View.INVISIBLE);
        		viewIMG5 .setVisibility(View.INVISIBLE);
        		viewIMG6 .setVisibility(View.INVISIBLE);
        		viewIMG7 .setVisibility(View.INVISIBLE);
        		viewIMG8 .setVisibility(View.VISIBLE);
	          break;
	          
	      }
        
//        	Log.v(null, "countdown started");
//    	    wasExecuted = true;
//    	    new CountDownTask().execute();
        }
    }
   
    
    public void onBackPressed(){
        MainActivity.this.finish();
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
        getParent().finish();
    }
    
    
    public void onNextButton(){
    	
    	Intent nextScreen = new Intent(MainActivity.this, TexturaActivity.class);
//    	myIntent.putExtra("key", coracao); //Optional parameters
    	MainActivity.this.startActivity(nextScreen);
    }
    
}
