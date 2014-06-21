package com.quatropdois.acaodocoracao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ShareActionProvider;

public class FinalHeart_Activity extends Activity {
	
private boolean wasExecuted;
	
	private Intent nextScreen;
	
	private int sentimento = 0;
	
	private int coracao = 0;
	
	private int textura = 0;
	
	public ImageView viewCor, 
					 viewSent;
	
	private Final_textura_palabra texturas_final;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.final_heart_activity);

        texturas_final = new Final_textura_palabra(this);
		nextScreen = new Intent(getApplicationContext(), FinalHeart_Activity.class);

		init();
		
		montaCoracao();
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.final_heart_, menu);
		
		MenuItem shareItem = (MenuItem) menu.findItem(R.id.action_share);
		
		ShareActionProvider mShare = (ShareActionProvider)shareItem.getActionProvider();
		
		Intent shareIntent = new Intent(Intent.ACTION_SEND);
		shareIntent.setAction(Intent.ACTION_SEND);
		shareIntent.setType("text/plain");
		shareIntent.putExtra(Intent.EXTRA_TEXT, "text to share");
		
		mShare.setShareIntent(shareIntent);
		
		return true;
	}
	
    public void init()
    {
    	
        wasExecuted = false;

        viewCor  = (ImageView)findViewById(R.id.img_cor);
        viewSent  = (ImageView)findViewById(R.id.img_sentimento);
        
        Intent iin = getIntent();
        Bundle extras = iin.getExtras();
        coracao = (int) extras.getInt("coracao");
        textura = (int) extras.getInt("textura");
        sentimento = (int) extras.getInt("sentimento");
        
    }
    
    public void montaCoracao(){
    	
    	texturas_final.texturas(coracao, textura);
    	viewCor.setVisibility(View.VISIBLE);
    	texturas_final.Sentimento(sentimento);
    	viewSent.setVisibility(View.VISIBLE);
    	
    }

    public void onBackPressed(){
        FinalHeart_Activity.this.finish();
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
        getParent().finish();
    }

}
