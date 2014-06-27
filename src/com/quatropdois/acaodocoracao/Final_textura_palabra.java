package com.quatropdois.acaodocoracao;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;

public class Final_textura_palabra {

//	FinalHeart_Activity finalAct;
	Tela_Final finalAct;
	
	public Final_textura_palabra(Context context) {
		
//		finalAct = (FinalHeart_Activity) context;
		finalAct = (Tela_Final) context;
		
	}
	
	public void texturas(int coracao, int textura){
//		int coracao = 0;
		
		ImageView viewCor = (ImageView) finalAct.findViewById(R.id.img_cor);
        
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
	        	viewCor.setImageResource(R.drawable.tex1_4);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 5:
	        	viewCor.setImageResource(R.drawable.tex1_5);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 6:
	        	viewCor.setImageResource(R.drawable.tex1_6);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;
				
			case 7:
	        	viewCor.setImageResource(R.drawable.tex1_7);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 8:
	        	viewCor.setImageResource(R.drawable.tex1_8);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 9:
	        	viewCor.setImageResource(R.drawable.tex1_9);
	    		Log.i("TEXTURA", "TEXTURA:" + textura);				
				break;

			case 10:
	        	viewCor.setImageResource(R.drawable.tex1_10);
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
      }
	}

	public void Sentimento(int sentimento){
//		int coracao = 0;
		
		ImageView viewSent = (ImageView) finalAct.findViewById(R.id.img_sentimento);
        
    	switch(sentimento) {
    	
        case 1:
        	viewSent.setImageResource(R.drawable.sentimento_alegria);
        	break;
          
        case 2:
        	viewSent.setImageResource(R.drawable.sentimento_amigos);        	
        	break;
          
        case 3:
        	viewSent.setImageResource(R.drawable.sentimento_amizade);
        	break;
          
        case 4:
        	viewSent.setImageResource(R.drawable.sentimento_amor);
        	break;
          
        case 5:
        	viewSent.setImageResource(R.drawable.sentimento_amparo);
        	break;
          
        case 6:
        	viewSent.setImageResource(R.drawable.sentimento_amparo);
        	break;
          
        case 7:
        	viewSent.setImageResource(R.drawable.sentimento_apoio);
        	break;
          
        case 8:
        	viewSent.setImageResource(R.drawable.sentimento_axe);
        	break;
        	
        case 9:
        	viewSent.setImageResource(R.drawable.sentimento_bondade);
          	break; 
            
        case 10:
        	viewSent.setImageResource(R.drawable.sentimento_caridade);
          	break; 
            
        case 11:
        	viewSent.setImageResource(R.drawable.sentimento_carinho);
          	break; 
            
        case 12:
        	viewSent.setImageResource(R.drawable.sentimento_compaixao);
         	break; 
            
        case 14:
        	viewSent.setImageResource(R.drawable.sentimento_companheirismo);
         	break; 
            
        case 15:
        	viewSent.setImageResource(R.drawable.sentimento_compreensao);
         	break; 
            
        case 16:
        	viewSent.setImageResource(R.drawable.sentimento_confianca);
         	break; 
            
        case 17:
        	viewSent.setImageResource(R.drawable.sentimento_conforto);
         	break; 
            
        case 18:
        	viewSent.setImageResource(R.drawable.sentimento_coragem);
         	break; 
            
        case 19:
        	viewSent.setImageResource(R.drawable.sentimento_crescimento);
         	break; 
            
        case 20:
        	viewSent.setImageResource(R.drawable.sentimento_cumplicidade);
         	break; 
         	
        case 21:
        	viewSent.setImageResource(R.drawable.sentimento_cura);
        	break;
          
        case 22:
        	viewSent.setImageResource(R.drawable.sentimento_deus);
        	break;
          
        case 23:
        	viewSent.setImageResource(R.drawable.sentimento_energia);
        	break;
          
        case 24:
        	viewSent.setImageResource(R.drawable.sentimento_equilibrio);
        	break;
          
        case 25:
        	viewSent.setImageResource(R.drawable.sentimento_esperanca);
        	break;
          
        case 26:
        	viewSent.setImageResource(R.drawable.sentimento_espiritualidade);
        	break;
          
        case 27:
        	viewSent.setImageResource(R.drawable.sentimento_familia);
        	break;
          
        case 28:
        	viewSent.setImageResource(R.drawable.sentimento_fartura);
        	break;
        	
        case 29:
        	viewSent.setImageResource(R.drawable.sentimento_fe);
          	break; 
            
        case 30:
        	viewSent.setImageResource(R.drawable.sentimento_felicidade);
          	break; 
            
        case 31:
        	viewSent.setImageResource(R.drawable.sentimento_forca);
          	break; 
            
        case 32:
        	viewSent.setImageResource(R.drawable.sentimento_fraternidade);
         	break; 
            
        case 33:
        	viewSent.setImageResource(R.drawable.sentimento_generosidade);
         	break; 
            
        case 34:
        	viewSent.setImageResource(R.drawable.sentimento_gentileza);
         	break; 
            
        case 35:
        	viewSent.setImageResource(R.drawable.sentimento_gratidao);
         	break; 
            
        case 36:
        	viewSent.setImageResource(R.drawable.sentimento_harmonia);
         	break; 
            
        case 37:
        	viewSent.setImageResource(R.drawable.sentimento_honestidade);
         	break; 
            
        case 38:
        	viewSent.setImageResource(R.drawable.sentimento_humildade);
         	break; 
            
        case 39:
        	viewSent.setImageResource(R.drawable.sentimento_igualdade);
         	break; 
            
        case 40:
        	viewSent.setImageResource(R.drawable.sentimento_liberdade);
         	break;
         	
        case 41:
        	viewSent.setImageResource(R.drawable.sentimento_luz);
        	break;
          
        case 42:
        	viewSent.setImageResource(R.drawable.sentimento_milagre);
        	break;
          
        case 43:
        	viewSent.setImageResource(R.drawable.sentimento_oracao);
        	break;
          
        case 44:
        	viewSent.setImageResource(R.drawable.sentimento_otimismo);
        	break;
          
        case 45:
        	viewSent.setImageResource(R.drawable.sentimento_paciencia);
        	break;
          
        case 46:
        	viewSent.setImageResource(R.drawable.sentimento_paixao);
        	break;
          
        case 47:
        	viewSent.setImageResource(R.drawable.sentimento_paz);
        	break;
          
        case 48:
        	viewSent.setImageResource(R.drawable.sentimento_perdao);
        	break;
        	
        case 49:
        	viewSent.setImageResource(R.drawable.sentimento_perseveranca);
          	break; 
            
        case 50:
        	viewSent.setImageResource(R.drawable.sentimento_prosperidade);
          	break; 
            
        case 51:
        	viewSent.setImageResource(R.drawable.sentimento_realizacao);
          	break; 
            
        case 52:
        	viewSent.setImageResource(R.drawable.sentimento_realizacoes);
         	break; 
            
        case 53:
        	viewSent.setImageResource(R.drawable.sentimento_sabedoria);
         	break; 
            
        case 54:
        	viewSent.setImageResource(R.drawable.sentimento_saude);
         	break; 
            
        case 55:
        	viewSent.setImageResource(R.drawable.sentimento_solidariedade);
         	break; 
            
        case 56:
        	viewSent.setImageResource(R.drawable.sentimento_sonhos);
         	break; 
            
        case 57:
        	viewSent.setImageResource(R.drawable.sentimento_sorriso);
         	break; 
            
        case 58:
        	viewSent.setImageResource(R.drawable.sentimento_sorte);
         	break; 
            
        case 59:
        	viewSent.setImageResource(R.drawable.sentimento_sossego);
         	break; 
            
        case 60:
        	viewSent.setImageResource(R.drawable.sentimento_sucesso);
         	break; 
            
        case 61:
        	viewSent.setImageResource(R.drawable.sentimento_superacao);
         	break;
              
        case 62:
        	viewSent.setImageResource(R.drawable.sentimento_ternura);
        	break;
          
        case 63:
        	viewSent.setImageResource(R.drawable.sentimento_tranquilidade);
        	break;
          
        case 64:
        	viewSent.setImageResource(R.drawable.sentimento_transformacao);
        	break;
          
        case 65:
        	viewSent.setImageResource(R.drawable.sentimento_verdade);
        	break;
            
        case 66:
          	viewSent.setImageResource(R.drawable.sentimento_vitoria);
          	break;
                   	
      }
	}

}

