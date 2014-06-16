package com.quatropdois.acaodocoracao;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


public class sharedPreference {

		Context mContext;
		SharedPreferences preferences;

		public sharedPreference(Context appContext) {
			mContext = appContext;
			preferences = PreferenceManager.getDefaultSharedPreferences(mContext);
		}
		
		public void contador(Context appContext ,String key){
	    	if (getInt(key) == 0){
	    		putInt(key, getInt(key) + 1);
	    	}
	    	else{
	    		putInt(key, getInt(key) + 1);
	    	}
		}

		public int getInt(String key) {
			return preferences.getInt(key, 0);
		}

		public void putInt(String key, int value) {
			SharedPreferences.Editor editor = preferences.edit();
			editor.putInt(key, value);
			editor.apply();
		}

		public void remove(String key) {
			SharedPreferences.Editor editor = preferences.edit();
			editor.remove(key);
			editor.apply();
		}

		public void clear() {
			SharedPreferences.Editor editor = preferences.edit();
			editor.clear();
			editor.apply();
		}

		public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener listener) {
			preferences.registerOnSharedPreferenceChangeListener(listener);
		}

		public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener listener) {
			preferences.unregisterOnSharedPreferenceChangeListener(listener);
		}

}
