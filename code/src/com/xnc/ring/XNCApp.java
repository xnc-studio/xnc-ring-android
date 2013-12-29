package com.xnc.ring;

import java.util.Locale;

import com.google.analytics.tracking.android.GAServiceManager;

import android.app.Application;
import android.content.ContextWrapper;
import android.content.SharedPreferences;

public class XNCApp extends Application {
	private static XNCApp _app;
	private SharedPreferences _prefs;

	public static XNCApp instance() {
		return _app;
	}
	public void onCreate()
	  {
	    super.onCreate();
	    _app = this;
	    SharedPreferences localSharedPreferences = getSharedPreferences("engagement_prefs", 0);
	    this._prefs = localSharedPreferences;
//	    GAServiceManager.getInstance().setDispatchPeriod(0);
	  }

	public Locale getLocale() {
		String str = getLanguage();
	    return new Locale(str);
	}
	 public String getLanguage()
	  {
	    return this._prefs.getString("language", "en");
	  }
}	
