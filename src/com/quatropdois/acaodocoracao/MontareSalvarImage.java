package com.quatropdois.acaodocoracao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.os.Environment;
import android.util.Log;
import android.widget.ImageView;

public class MontareSalvarImage {
	
	Tela_Final FinalHeart;
//	FinalHeart_Activity FinalHeart;
	
	public MontareSalvarImage(Context context){
		
//		FinalHeart = (FinalHeart_Activity) context;
		FinalHeart = (Tela_Final) context;
		
	}
	
    public Bitmap montaCoracao(ImageView viewCor, ImageView viewSent){
    	
    	BitmapDrawable drawable = (BitmapDrawable) viewCor.getDrawable();
    	BitmapDrawable drawable2 = (BitmapDrawable) viewSent.getDrawable();
//    	Bitmap drawableBack = (Bitmap) 
    	Bitmap pieceMyHeart = drawable.getBitmap(); 
    	Bitmap piece2MyHeart = drawable2.getBitmap();
//    	myHeart = overlay(pieceMyHeart, piece2MyHeart);
    	return overlay(pieceMyHeart, piece2MyHeart);
//    	myHeart = pintafundo(pieceMyHeart);
//    	myHeart = drawable.getBitmap(); 

    }
	
    public static Bitmap overlay(Bitmap bmp1, Bitmap bmp2) {

//    	junta duas imagens
        Bitmap bmOverlay = Bitmap.createBitmap(bmp1.getWidth(), bmp1.getHeight(), bmp1.getConfig());
        int x_adjust, y_adjust;
        x_adjust = bmp1.getWidth()/2 - (bmp2.getWidth()/2);
        y_adjust = bmp1.getHeight()/2- bmp2.getHeight();
        Canvas canvas = new Canvas(bmOverlay);
        canvas.drawColor(Color.rgb(252, 223, 225));
//        canvas.drawColor(R.color.FundoAcaoCoracao);
        canvas.drawBitmap(bmp1, new Matrix(), null);
        canvas.drawBitmap(bmp2, x_adjust, y_adjust, null);
        return bmOverlay;
    }
    
    protected File SalvaBit(final Bitmap result) 
    { 
    	File file = null;
//    	String PATH = Environment.getExternalStorageDirectory().toString();
    	if(result!=null){
    		// TODO Auto-generated method stub
			OutputStream outStream = null;
//			File file = new File(PATH, "sampleimage4.jpg");
			file = getOutputMediaFile();
			Log.i("LOCAL", "LOCAL: " + file);
			try{
				outStream = new FileOutputStream(file);
				result.compress(Bitmap.CompressFormat.JPEG, 100, outStream);
				outStream.flush();
				outStream.close();
				
			}catch (FileNotFoundException e){
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}catch (IOException e){
//				TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return file;
       
    }    
    
	private static File getOutputMediaFile(){
	      // To be safe, you should check that the SDCard is mounted
	      // using Environment.getExternalStorageState() before doing this.

	      File mediaStorageDir = new File(Environment.getExternalStoragePublicDirectory(
	                Environment.DIRECTORY_PICTURES), "acao do coracao");
	      // This location works best if you want the created images to be shared
	      // between applications and persist after your app has been uninstalled.

	      // Create the storage directory if it does not exist
	      if (! mediaStorageDir.exists()){
	          if (! mediaStorageDir.mkdirs()){
	              Log.d("MyCameraApp", "failed to create directory");
	              return null;
	          }
	      }

	      // Create a media file name
	      String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format( new java.util.Date());
	      File mediaFile = new File(mediaStorageDir.getPath() + File.separator +"IMG_"+ timeStamp + ".jpeg");
	      return mediaFile;
	  }

}
