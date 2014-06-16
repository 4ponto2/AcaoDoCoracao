package com.quatropdois.acaodocoracao;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SelectCoracao extends TexturaActivity {
	
	public ImageView 	viewIMG1, 
						viewIMG2, 
						viewIMG3, 
						viewIMG4, 
						viewIMG5, 
						viewIMG6, 
						viewIMG7, 
						viewIMG8;
	
	public	Button	btnNext;
	
//	private int coracao = 0;
	
	public void selectCoracao(View view)
    {
        	switch(view.getId()) {
        	
	        case R.id.imgBtn1:
//	        	coracao = 1;
        		System.out.println("CORACAO1");
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
//	        	coracao = 2;
        		System.out.println("CORACAO2");
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
//	        	coracao = 3;
        		System.out.println("CORACAO3");
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
//	        	coracao = 4;
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
//	        	coracao = 5;
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
//	        	coracao = 6;
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
//	        	coracao = 7;
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
//	        	coracao = 8;
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
        	
//        	Log.v(null, "countdown started");
//    	    wasExecuted = true;
//    	    new CountDownTask().execute();
        }
}
