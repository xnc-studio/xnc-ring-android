package com.xnc.ui.textview;

import java.util.Locale;

import com.xnc.AppUtils;
import com.xnc.ring.XNCApp;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class MenuItem extends TextView {

	public MenuItem(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}	
	public MenuItem(Context paramContext, AttributeSet paramAttributeSet)
	  {
	    super(paramContext, paramAttributeSet);
	    init();
	  }

	  public MenuItem(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
	  {
	    super(paramContext, paramAttributeSet, paramInt);
	    init();
	  }

	  private void init()
	  {
	    if (isInEditMode())
	      return;
	    if (getTypeface() != null)
	    {
	      if (getTypeface().isItalic())
	      {
	        Typeface localTypeface1 = AppUtils.getDefaultItalicTypeface();
	        setTypeface(localTypeface1);
	        return;
	      }
	      Typeface localTypeface2 = AppUtils.getDefaultTypeface();
	      setTypeface(localTypeface2);
	      return;
	    }
	    Typeface localTypeface3 = AppUtils.getDefaultTypeface();
	    setTypeface(localTypeface3);
	  }

	  

	  public void disableClick()
	  {
	    setEnabled(false);
	  }

	  public void enableClick()
	  {
	    setEnabled(true);
	  }

	  public void handleInputTextIsBlank()
	  {
	    disableClick();
	  }

	  public void handleInputTextIsNonBlank()
	  {
	    enableClick();
	  }

	  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
	  {
	    String str = paramCharSequence.toString().replace("  ", "\n").replace("¡¡", "\n");
	    super.setText(str, paramBufferType);
	  }

	  public void upcase()
	  {
	    String str1 = getText().toString();
	    Locale localLocale = XNCApp.instance().getLocale();
	    String str2 = str1.toUpperCase(localLocale);
	    setText(str2);
	  }

}
