package com.andrewshu.android.os.build.info;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ((TextView) findViewById(R.id.text1)).setText(
        		"model: " + android.os.Build.MODEL +
        		"\nproduct: " + android.os.Build.PRODUCT +
        		"\nbrand: " + android.os.Build.BRAND
		);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
