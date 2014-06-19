package com.quatropdois.acaodocoracao;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;

public class Texturas {
	
	TexturaActivity textAct;
	
	public Texturas(Context context){
		
		textAct = (TexturaActivity) context;
		
	}
	
	public void texturas(int coracao, int textura){
//		int coracao = 0;
		
		ImageView viewCor = (ImageView) textAct.findViewById(R.id.img_cor);
        
    	switch(coracao) {
    	
        case 1:
        	switch (textura) {
			case 1:
	        	viewCor.setImageResource(R.drawable.tex1_1);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 2:
	        	viewCor.setImageResource(R.drawable.tex1_2);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 3:
	        	viewCor.setImageResource(R.drawable.tex1_3);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 4:
	        	viewCor.setImageResource(R.drawable.tex1_5);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 5:
	        	viewCor.setImageResource(R.drawable.tex1_6);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 6:
	        	viewCor.setImageResource(R.drawable.tex1_7);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 7:
	        	viewCor.setImageResource(R.drawable.tex1_8);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 8:
	        	viewCor.setImageResource(R.drawable.tex1_9);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 9:
	        	viewCor.setImageResource(R.drawable.tex1_10);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 10:
	        	viewCor.setImageResource(R.drawable.tex1_11);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			default:
				break;
			}
          break;
          
        case 2:
        	switch (textura) {
			case 1:
	        	viewCor.setImageResource(R.drawable.tex2_1);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 2:
	        	viewCor.setImageResource(R.drawable.tex2_2);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 3:
	        	viewCor.setImageResource(R.drawable.tex2_3);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 4:
	        	viewCor.setImageResource(R.drawable.tex2_4);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 5:
	        	viewCor.setImageResource(R.drawable.tex2_5);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 6:
	        	viewCor.setImageResource(R.drawable.tex2_6);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 7:
	        	viewCor.setImageResource(R.drawable.tex2_7);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 8:
	        	viewCor.setImageResource(R.drawable.tex2_8);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 9:
	        	viewCor.setImageResource(R.drawable.tex2_9);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 10:
	        	viewCor.setImageResource(R.drawable.tex2_10);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			default:
				break;
			}
          break;
          
        case 3:
        	switch (textura) {
			case 1:
	        	viewCor.setImageResource(R.drawable.tex3_1);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 2:
	        	viewCor.setImageResource(R.drawable.tex3_2);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 3:
	        	viewCor.setImageResource(R.drawable.tex3_3);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 4:
	        	viewCor.setImageResource(R.drawable.tex3_4);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 5:
	        	viewCor.setImageResource(R.drawable.tex3_5);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 6:
	        	viewCor.setImageResource(R.drawable.tex3_6);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 7:
	        	viewCor.setImageResource(R.drawable.tex3_7);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 8:
	        	viewCor.setImageResource(R.drawable.tex3_8);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 9:
	        	viewCor.setImageResource(R.drawable.tex3_9);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 10:
	        	viewCor.setImageResource(R.drawable.tex3_10);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			default:
				break;
			}
          break;
          
        case 4:
        	switch (textura) {
			case 1:
	        	viewCor.setImageResource(R.drawable.tex4_1);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 2:
	        	viewCor.setImageResource(R.drawable.tex4_2);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 3:
	        	viewCor.setImageResource(R.drawable.tex4_3);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 4:
	        	viewCor.setImageResource(R.drawable.tex4_4);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 5:
	        	viewCor.setImageResource(R.drawable.tex4_5);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 6:
	        	viewCor.setImageResource(R.drawable.tex4_6);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 7:
	        	viewCor.setImageResource(R.drawable.tex4_7);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 8:
	        	viewCor.setImageResource(R.drawable.tex4_8);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 9:
	        	viewCor.setImageResource(R.drawable.tex4_9);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 10:
	        	viewCor.setImageResource(R.drawable.tex4_10);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			default:
				break;
			}
          break;
          
        case 5:
        	switch (textura) {
			case 1:
	        	viewCor.setImageResource(R.drawable.tex5_1);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 2:
	        	viewCor.setImageResource(R.drawable.tex5_2);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 3:
	        	viewCor.setImageResource(R.drawable.tex5_3);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 4:
	        	viewCor.setImageResource(R.drawable.tex5_4);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 5:
	        	viewCor.setImageResource(R.drawable.tex5_5);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 6:
	        	viewCor.setImageResource(R.drawable.tex5_6);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 7:
	        	viewCor.setImageResource(R.drawable.tex5_7);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 8:
	        	viewCor.setImageResource(R.drawable.tex5_8);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 9:
	        	viewCor.setImageResource(R.drawable.tex5_9);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 10:
	        	viewCor.setImageResource(R.drawable.tex5_10);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			default:
				break;
			}
          break;
          
        case 6:
        	switch (textura) {
			case 1:
	        	viewCor.setImageResource(R.drawable.tex6_1);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 2:
	        	viewCor.setImageResource(R.drawable.tex6_2);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 3:
	        	viewCor.setImageResource(R.drawable.tex6_3);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 4:
	        	viewCor.setImageResource(R.drawable.tex6_4);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 5:
	        	viewCor.setImageResource(R.drawable.tex6_5);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 6:
	        	viewCor.setImageResource(R.drawable.tex6_6);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 7:
	        	viewCor.setImageResource(R.drawable.tex6_7);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 8:
	        	viewCor.setImageResource(R.drawable.tex6_8);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 9:
	        	viewCor.setImageResource(R.drawable.tex6_9);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 10:
	        	viewCor.setImageResource(R.drawable.tex6_10);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			default:
				break;
			}
          break;
          
        case 7:
        	switch (textura) {
			case 1:
	        	viewCor.setImageResource(R.drawable.tex7_1);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 2:
	        	viewCor.setImageResource(R.drawable.tex7_2);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 3:
	        	viewCor.setImageResource(R.drawable.tex7_3);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 4:
	        	viewCor.setImageResource(R.drawable.tex7_4);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 5:
	        	viewCor.setImageResource(R.drawable.tex7_5);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 6:
	        	viewCor.setImageResource(R.drawable.tex7_6);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 7:
	        	viewCor.setImageResource(R.drawable.tex7_7);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 8:
	        	viewCor.setImageResource(R.drawable.tex7_8);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 9:
	        	viewCor.setImageResource(R.drawable.tex7_9);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 10:
	        	viewCor.setImageResource(R.drawable.tex7_10);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			default:
				break;
			}
          break;
          
        case 8:
        	switch (textura) {
			case 1:
	        	viewCor.setImageResource(R.drawable.tex8_1);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 2:
	        	viewCor.setImageResource(R.drawable.tex8_2);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 3:
	        	viewCor.setImageResource(R.drawable.tex8_3);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 4:
	        	viewCor.setImageResource(R.drawable.tex8_4);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 5:
	        	viewCor.setImageResource(R.drawable.tex8_5);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 6:
	        	viewCor.setImageResource(R.drawable.tex8_6);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 7:
	        	viewCor.setImageResource(R.drawable.tex8_7);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 8:
	        	viewCor.setImageResource(R.drawable.tex8_8);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 9:
	        	viewCor.setImageResource(R.drawable.tex8_9);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 10:
	        	viewCor.setImageResource(R.drawable.tex8_10);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			default:
				break;
			}
          break;      
      }
	}
}
