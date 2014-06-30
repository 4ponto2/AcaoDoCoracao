package com.quatropdois.acaodocoracao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Principal extends Activity {

	private boolean wasExecuted = false;
    private Intent mainActivity, geoActivity;
    

    sharedPreference qtdUso;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		init();
		setContentView(R.layout.principal);
    	super.onCreate(savedInstanceState);
	}
    
    public void init()
    {
    	mainActivity = new Intent(getApplicationContext(), MainActivity.class);
    	geoActivity  = new Intent(getApplicationContext(), GeoActivity.class);
//    	mainActivity = new Intent(getApplicationContext(), TexturaActivity.class);
        wasExecuted = false;
    }
    
    public void reinicio_contador(View view){
    	
    	qtdUso = new sharedPreference(getApplicationContext());
    	qtdUso.remove("qtduso");
    	
    }  
        
    public void criaCoracao(View view)
    {
    	if(!wasExecuted){
        	Log.v(null, "countdown started");
    	    wasExecuted = true;
            startActivity(mainActivity);
        }
    }
    
    public void geoActivity(View view){
    	
    	startActivity(geoActivity);
    	
    }

    public void onBackPressed(){
    	   Log.i("HA", "Finishing");
    	   Intent intent = new Intent(Intent.ACTION_MAIN);
    	   intent.addCategory(Intent.CATEGORY_HOME);
    	   intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    	   startActivity(intent);
    }

	/**
	 * A placeholder fragment containing a simple view.
	 */
//	public static class PlaceholderFragment extends Fragment {
//
//		public PlaceholderFragment() {
//		}
//
//		@Override
//		public View onCreateView(LayoutInflater inflater, ViewGroup container,
//				Bundle savedInstanceState) {
//			View rootView = inflater.inflate(R.layout.principal, container,
//					false);
//			return rootView;
//		}
//	}

}
