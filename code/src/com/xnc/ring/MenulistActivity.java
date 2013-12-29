package com.xnc.ring;


import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MenulistActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menulist);
       
    }
    public static void start(Context paramContext)
    {
      Intent localIntent = new Intent(paramContext, MenulistActivity.class);
      paramContext.startActivity(localIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menulist, menu);
        return true;
    }
    // search rings
    public void handleFindRingClicked(View paramView)
    {
    	ItemBrowseActivity.start(this);
//      RingBrowseActivity.start(this);
    }
    
}
