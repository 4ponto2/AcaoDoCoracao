package com.quatropdois.acaodocoracao;


import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
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
    
    sharedPreference qtdUso;
    
	public ImageView 	viewIMG1, 
						viewIMG2, 
						viewIMG3, 
						viewIMG4, 
						viewIMG5, 
						viewIMG6, 
						viewIMG7, 
						viewIMG8;
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textura_activity);
        init();
        coracaoescolhido();
    }
    public void coracaoescolhido(){
    	Toast.makeText(getApplicationContext(), "coracao escolhido:" + coracao, Toast.LENGTH_LONG).show();
    }
    public void init()
    {
//    	main = new Intent(getApplicationContext(), Main.class);
    	
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
        
//        qtd = qtdUso.getInt("qtduso");
        
        Intent iin = getIntent();
        Bundle extras = iin.getExtras();
        coracao = (int) extras.getInt("coracao");
        
        switch (coracao){
        case 1:
    		viewIMG1 .setVisibility(View.VISIBLE);
    		viewIMG2 .setVisibility(View.INVISIBLE);
    		viewIMG3 .setVisibility(View.INVISIBLE);
    		viewIMG4 .setVisibility(View.INVISIBLE);
    		viewIMG5 .setVisibility(View.INVISIBLE);
    		viewIMG6 .setVisibility(View.INVISIBLE);
    		viewIMG7 .setVisibility(View.INVISIBLE);
    		viewIMG8 .setVisibility(View.INVISIBLE);
        
        case 2:
    		viewIMG1 .setVisibility(View.INVISIBLE);
    		viewIMG2 .setVisibility(View.VISIBLE);
    		viewIMG3 .setVisibility(View.INVISIBLE);
    		viewIMG4 .setVisibility(View.INVISIBLE);
    		viewIMG5 .setVisibility(View.INVISIBLE);
    		viewIMG6 .setVisibility(View.INVISIBLE);
    		viewIMG7 .setVisibility(View.INVISIBLE);
    		viewIMG8 .setVisibility(View.INVISIBLE);
    		
        case 3:
    		viewIMG1 .setVisibility(View.INVISIBLE);
    		viewIMG2 .setVisibility(View.INVISIBLE);
    		viewIMG3 .setVisibility(View.VISIBLE);
    		viewIMG4 .setVisibility(View.INVISIBLE);
    		viewIMG5 .setVisibility(View.INVISIBLE);
    		viewIMG6 .setVisibility(View.INVISIBLE);
    		viewIMG7 .setVisibility(View.INVISIBLE);
    		viewIMG8 .setVisibility(View.INVISIBLE);
    		
        case 4:
    		viewIMG1 .setVisibility(View.INVISIBLE);
    		viewIMG2 .setVisibility(View.INVISIBLE);
    		viewIMG3 .setVisibility(View.INVISIBLE);
    		viewIMG4 .setVisibility(View.VISIBLE);
    		viewIMG5 .setVisibility(View.INVISIBLE);
    		viewIMG6 .setVisibility(View.INVISIBLE);
    		viewIMG7 .setVisibility(View.INVISIBLE);
    		viewIMG8 .setVisibility(View.INVISIBLE);
    		
        case 5:
    		viewIMG1 .setVisibility(View.INVISIBLE);
    		viewIMG2 .setVisibility(View.INVISIBLE);
    		viewIMG3 .setVisibility(View.INVISIBLE);
    		viewIMG4 .setVisibility(View.INVISIBLE);
    		viewIMG5 .setVisibility(View.VISIBLE);
    		viewIMG6 .setVisibility(View.INVISIBLE);
    		viewIMG7 .setVisibility(View.INVISIBLE);
    		viewIMG8 .setVisibility(View.INVISIBLE);
    		
        case 6:
    		viewIMG1 .setVisibility(View.INVISIBLE);
    		viewIMG2 .setVisibility(View.INVISIBLE);
    		viewIMG3 .setVisibility(View.INVISIBLE);
    		viewIMG4 .setVisibility(View.INVISIBLE);
    		viewIMG5 .setVisibility(View.INVISIBLE);
    		viewIMG6 .setVisibility(View.VISIBLE);
    		viewIMG7 .setVisibility(View.INVISIBLE);
    		viewIMG8 .setVisibility(View.INVISIBLE);
    		
        case 7:
    		viewIMG1 .setVisibility(View.INVISIBLE);
    		viewIMG2 .setVisibility(View.INVISIBLE);
    		viewIMG3 .setVisibility(View.INVISIBLE);
    		viewIMG4 .setVisibility(View.INVISIBLE);
    		viewIMG5 .setVisibility(View.INVISIBLE);
    		viewIMG6 .setVisibility(View.INVISIBLE);
    		viewIMG7 .setVisibility(View.VISIBLE);
    		viewIMG8 .setVisibility(View.INVISIBLE);
    		
        case 8:
    		viewIMG1 .setVisibility(View.INVISIBLE);
    		viewIMG2 .setVisibility(View.INVISIBLE);
    		viewIMG3 .setVisibility(View.INVISIBLE);
    		viewIMG4 .setVisibility(View.INVISIBLE);
    		viewIMG5 .setVisibility(View.INVISIBLE);
    		viewIMG6 .setVisibility(View.INVISIBLE);
    		viewIMG7 .setVisibility(View.INVISIBLE);
    		viewIMG8 .setVisibility(View.VISIBLE);
    		
        }
        
    }
    
    
    public void selectCoracao(View view)
    {
        if(!wasExecuted){

        	switch(view.getId()) {
        	
	        case R.id.imgBtn1:
	        	coracao = 1;
        		System.out.println("CORACAO1");
        		viewIMG1 .setVisibility(View.VISIBLE);
        		viewIMG2 .setVisibility(View.INVISIBLE);
        		viewIMG3 .setVisibility(View.INVISIBLE);
        		viewIMG4 .setVisibility(View.INVISIBLE);
        		viewIMG5 .setVisibility(View.INVISIBLE);
        		viewIMG6 .setVisibility(View.INVISIBLE);
        		viewIMG7 .setVisibility(View.INVISIBLE);
        		viewIMG8 .setVisibility(View.INVISIBLE);
	          break;
	          
	        case R.id.imgBtn2:
	        	coracao = 2;
        		System.out.println("CORACAO2");
        		viewIMG1 .setVisibility(View.INVISIBLE);
        		viewIMG2 .setVisibility(View.VISIBLE);
        		viewIMG3 .setVisibility(View.INVISIBLE);
        		viewIMG4 .setVisibility(View.INVISIBLE);
        		viewIMG5 .setVisibility(View.INVISIBLE);
        		viewIMG6 .setVisibility(View.INVISIBLE);
        		viewIMG7 .setVisibility(View.INVISIBLE);
        		viewIMG8 .setVisibility(View.INVISIBLE);
	          break;
	          
	        case R.id.imgBtn3:
	        	coracao = 3;
        		System.out.println("CORACAO3");
        		viewIMG1 .setVisibility(View.INVISIBLE);
        		viewIMG2 .setVisibility(View.INVISIBLE);
        		viewIMG3 .setVisibility(View.VISIBLE);
        		viewIMG4 .setVisibility(View.INVISIBLE);
        		viewIMG5 .setVisibility(View.INVISIBLE);
        		viewIMG6 .setVisibility(View.INVISIBLE);
        		viewIMG7 .setVisibility(View.INVISIBLE);
        		viewIMG8 .setVisibility(View.INVISIBLE);
	          break;
	          
	        case R.id.imgBtn4:
	        	coracao = 4;
        		System.out.println("CORACAO4");
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
        		System.out.println("CORACAO5");
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
        		System.out.println("CORACAO6");
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
        		System.out.println("CORACAO7");
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
        		System.out.println("CORACAO8");
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
        }
    }
    
//    public void onBackPressed(){
//        MainActivity.this.finish();
//        android.os.Process.killProcess(android.os.Process.myPid());
//        System.exit(0);
//        getParent().finish();
//    }
    
    private class CountDownTask extends AsyncTask<Void, Void, Void>
    {
        @Override
        protected Void doInBackground(Void... urls)
        {
        	
//            for (int i = 0; i >= 0; --i)
//            {
//            	publishProgress(i);
//            	SystemClock.sleep(1000);
//            }
//            main.putExtra("coracao", coracao);
//            startActivity(main);
        	System.out.println("TERMINOU");
            return null;
        }
    }
}
