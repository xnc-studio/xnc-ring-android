package com.xnc;

import com.xnc.ring.XNCApp;

import android.graphics.Typeface;

public class AppUtils {
	  private static Typeface defaultItalicTypeface;
	  private static Typeface defaultTypeface;
	
	
	 public static Typeface getDefaultItalicTypeface()
	  {
	    if (defaultItalicTypeface == null)
	    	defaultItalicTypeface = Typeface.createFromAsset(XNCApp.instance().getAssets(), "fonts/SterlingSSm-LightItalic.ttf");
	    return defaultItalicTypeface;
	  }

	  public static Typeface getDefaultTypeface()
	  {
	    if (defaultTypeface == null)
	    	defaultTypeface = Typeface.createFromAsset(XNCApp.instance().getAssets(), "fonts/SterlingSSm-Light.ttf");
	    return defaultTypeface;
	  }

}
