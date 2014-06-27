package com.quatropdois.acaodocoracao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ShareActionProvider;
import android.widget.Toast;

public class FinalHeart_Activity extends Activity {
	
	private boolean wasExecuted;
	
	private Intent nextScreen;
	
	private int sentimento = 0;
	
	private int coracao = 0;
	
	private int textura = 0;
	
	public ImageView viewCor, 
					 viewSent;
	
	private Bitmap myHeart;
	
	private Final_textura_palabra texturas_final;
	
	MontareSalvarImage montagem;
	
	Uri uri;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.final_heart_activity);

        texturas_final = new Final_textura_palabra(this);
		nextScreen = new Intent(getApplicationContext(), FinalHeart_Activity.class);
		
		montagem = new MontareSalvarImage(this);

		init();
		
		montaCoracao();
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.final_heart_, menu);
		
		MenuItem shareItem = (MenuItem) menu.findItem(R.id.action_share);
		Log.i("TOP MENU", "TOP 1");
		ShareActionProvider mShare = (ShareActionProvider)shareItem.getActionProvider();
		Log.i("TOP MENU", "TOP 2");
		
//		shareImage();
//		Intent shareIntent = new Intent(Intent.ACTION_SEND);
//		shareIntent.setType("image/*");
//		shareIntent.putExtra(Intent.EXTRA_STREAM, uri);
//		
//		mShare.setShareIntent(shareIntent);
		
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
    	
    	myHeart = montagem.montaCoracao(viewCor, viewSent);
    }
    
    public void onBackPressed(){
        FinalHeart_Activity.this.finish();
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
        getParent().finish();
    }
   
    public void onResume(){
//    	File file = montagem.SalvaBit(myHeart);
//    	Log.i("FILE", "FILE : " + file);
//    	String string = file.getName();
//    	Log.i("FILE", "FILE : " + string);
    	super.onResume();
    }
    
    
//    public void shareImage(View view) {
    public void shareImage() {
    	    	
//        Intent share = new Intent(Intent.ACTION_SEND);        
        
//        File mediaStorageDir = new File(Environment.getExternalStoragePublicDirectory(
//                Environment.DIRECTORY_PICTURES), "acao do coracao");

//        File mediaFile = new File(mediaStorageDir.getPath() + File.separator +"Screenshot_2014-06-16-18-24-25" + ".jpg");
        // If you want to share a png image only, you can do:
        // setType("image/png"); OR for jpeg: setType("image/jpeg");
//        share.setType("image/*");
 
        
        
        // Make sure you put example png image named myImage.png in your
        // directory
//        String imagePath2 = Environment.getExternalStorageDirectory()
//                + "/myImage.png";
 
//        File imageFileToShare = new File(imagePath);
//        File imageFileToShare = new File(mediaStorageDir.getPath() + File.separator +"Screenshot_2014-06-16-18-24-25" + ".jpg");
    	File imageFileToShare = montagem.SalvaBit(myHeart);
//        Log.i("EXTERNAL", "EXTERNAL: " + imageFileToShare);
        
//        String imagePath = mediaStorageDir.getAbsolutePath() + File.separator + imageFileToShare.getName() ;
        
        uri = Uri.fromFile(imageFileToShare);
//        share.putExtra(Intent.EXTRA_STREAM, uri);
// 
//        startActivity(Intent.createChooser(share, "Share Image!"));
    }
}
