package com.example.ActivityLifeCycle;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class Activity1 extends Activity {
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Toast.makeText(this, "onCreate() - Activity1", Toast.LENGTH_SHORT).show();
        
        Button button1 = (Button) findViewById(R.id.Act1_send_new_Intent_to_Act2);
        Button button2 = (Button) findViewById(R.id.Act1_send_new_Intent_to_Act3);
        
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent myIntent = new Intent(v.getContext(), Activity2.class);
                startActivity(myIntent);
            }
        });
        
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent myIntent = new Intent(v.getContext(), Activity3.class);
                startActivity(myIntent);
            }
        });
        
    }//onCreate();
    
    @Override
    public void onRestart() {
    	super.onRestart();
    	Toast.makeText(this, "onRestart() - Activity1", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onResume() {
    	super.onResume();
    	Toast.makeText(this, "onResume() - Activity1", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStart() {
    	super.onStart();
    	Toast.makeText(this, "onStart() - Activity1", Toast.LENGTH_SHORT).show();   
    }
    @Override
    public void onPause() {
    	super.onPause();
    	Toast.makeText(this, "onPause() - Activity1", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStop() {
    	super.onStop();
    	Toast.makeText(this, "onStop() - Activity1", Toast.LENGTH_SHORT).show();        
    }
    @Override
    public void onDestroy() {
    	super.onDestroy();
    	Toast.makeText(this, "onDestroy() - Activity1", Toast.LENGTH_SHORT).show();       
    }
    
    @Override
	protected void onSaveInstanceState(Bundle outState) {
	super.onSaveInstanceState(outState);
	Toast.makeText(getBaseContext(),"onSaveInstanceState - Activity1", Toast.LENGTH_SHORT).show();
	} // onSaveInstanceState
	
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
	super.onRestoreInstanceState(savedInstanceState);	
	Toast.makeText(getBaseContext(), "onRestoreInstanceState - Activity1 ", Toast.LENGTH_SHORT).show();
	} // onRestoreInstanceState
    
    
}// Class Activity1