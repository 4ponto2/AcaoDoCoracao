package com.quatropdois.acaodocoracao;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ShareActionProvider;

public class Tela_Final extends Activity {
	
	private int sentimento = 0;
	
	private int coracao = 0;
	
	private int textura = 0;

	private Bitmap myHeart;
	
	public ImageView viewCor, 
					 viewSent;
	
	private Final_textura_palabra texturas_final;
	
	private MontareSalvarImage montagem;
	
	private Intent principal;

	private Uri uri;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
        
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela_final);
		
        texturas_final = new Final_textura_palabra(this);
		
		montagem = new MontareSalvarImage(this);
		
		init();
		
		montaCoracao();
	}
	
    public void init()
    {

        viewCor  = (ImageView)findViewById(R.id.img_cor);
        viewSent  = (ImageView)findViewById(R.id.img_sentimento);
        
        Intent iin = getIntent();
        Bundle extras = iin.getExtras();
        coracao = (int) extras.getInt("coracao");
        textura = (int) extras.getInt("textura");
        sentimento = (int) extras.getInt("sentimento");
        
        principal = new Intent(getApplicationContext(), Principal.class);
        
    }	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.final_heart_, menu);
		
		MenuItem shareItem = (MenuItem) menu.findItem(R.id.action_share);
		ShareActionProvider mShare = (ShareActionProvider)shareItem.getActionProvider();
		
		shareImage();
		Intent shareIntent = new Intent(Intent.ACTION_SEND);
		shareIntent.setType("image/*");
		shareIntent.putExtra(Intent.EXTRA_STREAM, uri);
		
		mShare.setShareIntent(shareIntent);
		
		return true;
	}
	
    public void montaCoracao(){
    	
    	texturas_final.texturas(coracao, textura);
    	viewCor.setVisibility(View.VISIBLE);
    	texturas_final.Sentimento(sentimento);
    	viewSent.setVisibility(View.VISIBLE);
    	
    	myHeart = montagem.montaCoracao(viewCor, viewSent);
    }
    
    public void onBackPressed(){
        Tela_Final.this.finish();
        startActivity(principal);
//        android.os.Process.killProcess(android.os.Process.myPid());
//        System.exit(0);
//        getParent().finish();
    }
    
    public void onBackDraw(View view){
    	Tela_Final.this.finish();
        startActivity(principal);
    }
    
    public void shareImage() {
  	File imageFileToShare = montagem.SalvaBit(myHeart);
  	
    uri = Uri.fromFile(imageFileToShare);
  }    

}
