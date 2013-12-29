package com.xnc.ring;

import java.util.Timer;
import java.util.TimerTask;


import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
       
        //this.getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.maincolor));
        setContentView(R.layout.activity_main);
        
        
        TextView textAppname = (TextView) this.getWindow().findViewById(R.id.textAppname);
        Typeface typeFace = Typeface.createFromAsset(getAssets(),"fonts/Zapfino.otf");
        textAppname.setTypeface(typeFace);
//        final Intent intent = new Intent(this,MenulistActivity.class);
        final Context self =this;
        
       // MenulistActivity.start(this);
        new android.os.Handler().postDelayed(
	        new Runnable() {
	            public void run() {
	            	MenulistActivity.start(self);
//	            	startActivity(intent);
	                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out); 
	                
	            }
	        }, 2500);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
