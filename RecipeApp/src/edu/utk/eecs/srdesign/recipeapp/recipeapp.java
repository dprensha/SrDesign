package edu.utk.eecs.srdesign.recipeapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class recipeapp extends Activity {
	TextView t;
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	public static final int SUB_ACT_REQUEST = 15;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.main);
        
        t = (TextView)findViewById(R.id.textView1);
        t.setText("An Android's Approach to Food");
        t.setTextSize((float)20.0);
        
        b1 = (Button)findViewById(R.id.browse);
        b1.setText("Browse Recipes");
        b1.setWidth(250);
        b2 = (Button)findViewById(R.id.favorite);
        b2.setText("Favorite Recipes");
        b2.setWidth(250);
        b3 = (Button)findViewById(R.id.edit);
        b3.setText("Edit Pantry");
        b3.setWidth(250);
        b4 = (Button)findViewById(R.id.surprise);
        b4.setText("Surprise Me");
        b4.setWidth(250);
        
        Button browse = (Button)findViewById(R.id.browse);
        browse.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View view){
        		Intent browseintent = new Intent(recipeapp.this,BrowseDefault.class);
        		startActivity(browseintent);
        	}
        });
        
    }
}