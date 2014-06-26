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

			case 11:
	        	viewCor.setImageResource(R.drawable.tex1_11);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 12:
	        	viewCor.setImageResource(R.drawable.tex1_12);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 13:
	        	viewCor.setImageResource(R.drawable.tex1_13);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 14:
	        	viewCor.setImageResource(R.drawable.tex1_14);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 15:
	        	viewCor.setImageResource(R.drawable.tex1_15);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 16:
	        	viewCor.setImageResource(R.drawable.tex1_16);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 17:
	        	viewCor.setImageResource(R.drawable.tex1_17);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 18:
	        	viewCor.setImageResource(R.drawable.tex1_18);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 19:
	        	viewCor.setImageResource(R.drawable.tex1_19);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 20:
	        	viewCor.setImageResource(R.drawable.tex1_20);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 21:
	        	viewCor.setImageResource(R.drawable.tex1_21);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 22:
	        	viewCor.setImageResource(R.drawable.tex1_22);
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

			case 11:
	        	viewCor.setImageResource(R.drawable.tex2_11);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 12:
	        	viewCor.setImageResource(R.drawable.tex2_12);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 13:
	        	viewCor.setImageResource(R.drawable.tex2_13);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 14:
	        	viewCor.setImageResource(R.drawable.tex2_14);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 15:
	        	viewCor.setImageResource(R.drawable.tex2_15);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 16:
	        	viewCor.setImageResource(R.drawable.tex2_16);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 17:
	        	viewCor.setImageResource(R.drawable.tex2_17);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 18:
	        	viewCor.setImageResource(R.drawable.tex2_18);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 19:
	        	viewCor.setImageResource(R.drawable.tex2_19);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 20:
	        	viewCor.setImageResource(R.drawable.tex2_20);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 21:
	        	viewCor.setImageResource(R.drawable.tex2_21);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 22:
	        	viewCor.setImageResource(R.drawable.tex2_22);
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

			case 11:
	        	viewCor.setImageResource(R.drawable.tex3_11);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 12:
	        	viewCor.setImageResource(R.drawable.tex3_12);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 13:
	        	viewCor.setImageResource(R.drawable.tex3_13);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 14:
	        	viewCor.setImageResource(R.drawable.tex3_14);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 15:
	        	viewCor.setImageResource(R.drawable.tex3_15);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 16:
	        	viewCor.setImageResource(R.drawable.tex3_16);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 17:
	        	viewCor.setImageResource(R.drawable.tex3_17);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 18:
	        	viewCor.setImageResource(R.drawable.tex3_18);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 19:
	        	viewCor.setImageResource(R.drawable.tex3_19);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 20:
	        	viewCor.setImageResource(R.drawable.tex3_20);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 21:
	        	viewCor.setImageResource(R.drawable.tex3_21);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 22:
	        	viewCor.setImageResource(R.drawable.tex3_22);
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

			case 11:
	        	viewCor.setImageResource(R.drawable.tex4_11);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 12:
	        	viewCor.setImageResource(R.drawable.tex4_12);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 13:
	        	viewCor.setImageResource(R.drawable.tex4_13);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 14:
	        	viewCor.setImageResource(R.drawable.tex4_14);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 15:
	        	viewCor.setImageResource(R.drawable.tex4_15);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 16:
	        	viewCor.setImageResource(R.drawable.tex4_16);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 17:
	        	viewCor.setImageResource(R.drawable.tex4_17);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 18:
	        	viewCor.setImageResource(R.drawable.tex4_18);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 19:
	        	viewCor.setImageResource(R.drawable.tex4_19);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 20:
	        	viewCor.setImageResource(R.drawable.tex4_20);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 21:
	        	viewCor.setImageResource(R.drawable.tex4_21);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 22:
	        	viewCor.setImageResource(R.drawable.tex4_22);
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

			case 11:
	        	viewCor.setImageResource(R.drawable.tex5_11);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 12:
	        	viewCor.setImageResource(R.drawable.tex5_12);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 13:
	        	viewCor.setImageResource(R.drawable.tex5_13);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 14:
	        	viewCor.setImageResource(R.drawable.tex5_14);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 15:
	        	viewCor.setImageResource(R.drawable.tex5_15);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 16:
	        	viewCor.setImageResource(R.drawable.tex5_16);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 17:
	        	viewCor.setImageResource(R.drawable.tex5_17);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 18:
	        	viewCor.setImageResource(R.drawable.tex5_18);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 19:
	        	viewCor.setImageResource(R.drawable.tex5_19);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 20:
	        	viewCor.setImageResource(R.drawable.tex5_20);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 21:
	        	viewCor.setImageResource(R.drawable.tex5_21);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 22:
	        	viewCor.setImageResource(R.drawable.tex5_22);
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

			case 11:
	        	viewCor.setImageResource(R.drawable.tex6_11);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 12:
	        	viewCor.setImageResource(R.drawable.tex6_12);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 13:
	        	viewCor.setImageResource(R.drawable.tex6_13);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 14:
	        	viewCor.setImageResource(R.drawable.tex6_14);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 15:
	        	viewCor.setImageResource(R.drawable.tex6_15);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 16:
	        	viewCor.setImageResource(R.drawable.tex6_16);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 17:
	        	viewCor.setImageResource(R.drawable.tex6_17);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 18:
	        	viewCor.setImageResource(R.drawable.tex6_18);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 19:
	        	viewCor.setImageResource(R.drawable.tex6_19);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 20:
	        	viewCor.setImageResource(R.drawable.tex6_20);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 21:
	        	viewCor.setImageResource(R.drawable.tex6_21);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 22:
	        	viewCor.setImageResource(R.drawable.tex6_22);
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

			case 11:
	        	viewCor.setImageResource(R.drawable.tex7_11);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 12:
	        	viewCor.setImageResource(R.drawable.tex7_12);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 13:
	        	viewCor.setImageResource(R.drawable.tex7_13);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 14:
	        	viewCor.setImageResource(R.drawable.tex7_14);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 15:
	        	viewCor.setImageResource(R.drawable.tex7_15);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 16:
	        	viewCor.setImageResource(R.drawable.tex7_16);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 17:
	        	viewCor.setImageResource(R.drawable.tex7_17);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 18:
	        	viewCor.setImageResource(R.drawable.tex7_18);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 19:
	        	viewCor.setImageResource(R.drawable.tex7_19);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 20:
	        	viewCor.setImageResource(R.drawable.tex7_20);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 21:
	        	viewCor.setImageResource(R.drawable.tex7_21);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 22:
	        	viewCor.setImageResource(R.drawable.tex7_22);
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

			case 11:
	        	viewCor.setImageResource(R.drawable.tex8_11);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 12:
	        	viewCor.setImageResource(R.drawable.tex8_12);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 13:
	        	viewCor.setImageResource(R.drawable.tex8_13);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 14:
	        	viewCor.setImageResource(R.drawable.tex8_14);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 15:
	        	viewCor.setImageResource(R.drawable.tex8_15);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 16:
	        	viewCor.setImageResource(R.drawable.tex8_16);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 17:
	        	viewCor.setImageResource(R.drawable.tex8_17);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 18:
	        	viewCor.setImageResource(R.drawable.tex8_18);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 19:
	        	viewCor.setImageResource(R.drawable.tex8_19);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 20:
	        	viewCor.setImageResource(R.drawable.tex8_20);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 21:
	        	viewCor.setImageResource(R.drawable.tex8_21);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 22:
	        	viewCor.setImageResource(R.drawable.tex8_22);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			default:
				break;
			}
          break;
          
		default:
			break;
          
      }
	}
}
