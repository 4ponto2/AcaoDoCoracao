package com.quatropdois.acaodocoracao;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Texturas {
	
	TexturaActivity textAct;
	
	public Texturas(Context context){
		
		textAct = (TexturaActivity) context;
		
	}

	public void texturas(int textura){
//		int coracao = 0;
		
//		ImageButton viewCor = (ImageButton) textAct.findViewById(R.id.img_cor);
        
    	switch(textura) {
    	
        case 1:
//        	coracao = 1;
//        	Toast.makeText(textAct, "coracao escolhido:" + coracao, Toast.LENGTH_LONG).show();
    		System.out.println("CORACAO1");
          break;
          
        case 2:
//        	coracao = 2;
//        	Toast.makeText(textAct, "coracao escolhido:" + coracao, Toast.LENGTH_LONG).show();

    		System.out.println("CORACAO2");
          break;
          
        case 3:
//        	coracao = 3;
//        	Toast.makeText(textAct, "coracao escolhido:" + coracao, Toast.LENGTH_LONG).show();
    		System.out.println("CORACAO3");
          break;
          
        case 4:
//        	coracao = 4;
//        	Toast.makeText(textAct, "coracao escolhido:" + coracao, Toast.LENGTH_LONG).show();
    		System.out.println("CORACAO4");
          break;
          
        case 5:
//        	coracao = 5;
//        	Toast.makeText(textAct, "coracao escolhido:" + coracao, Toast.LENGTH_LONG).show();]
    		System.out.println("CORACAO5");
          break;
          
        case 6:
//        	coracao = 6;
//        	Toast.makeText(textAct, "coracao escolhido:" + coracao, Toast.LENGTH_LONG).show();

    		System.out.println("CORACAO6");
          break;
          
        case 7:
//        	coracao = 7;
//        	Toast.makeText(textAct, "coracao escolhido:" + coracao, Toast.LENGTH_LONG).show();
    		System.out.println("CORACAO7");
          break;
          
        case 8:
//        	coracao = 8;
//        	Toast.makeText(textAct, "coracao escolhido:" + coracao, Toast.LENGTH_LONG).show();

    		System.out.println("CORACAO8");
          break;
      }
	}
}
