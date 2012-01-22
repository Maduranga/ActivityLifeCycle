package com.example.ActivityLifeCycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class Activity3 extends Activity {
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);
        
        Toast.makeText(this, "onCreate() - Activity3", Toast.LENGTH_SHORT).show();
        
        Button button1 = (Button) findViewById(R.id.Act3_send_new_Intent_to_Act1);
        Button button2 = (Button) findViewById(R.id.Act3_send_new_Intent_to_Act2);
        Button button3 = (Button) findViewById(R.id.Act3_send_Intent_result);
        
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent myIntent = new Intent(v.getContext(), Activity1.class);
                startActivity(myIntent);
            }
        });
        
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent myIntent = new Intent(v.getContext(), Activity2.class);
                startActivity(myIntent);
            }
        });
        
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });
                
    }//onCreate();
    
    @Override
    public void onRestart() {
    	super.onRestart();
    	Toast.makeText(this, "onRestart() - Activity3", Toast.LENGTH_SHORT).show(); 
    }
    @Override
    public void onResume() {
    	super.onResume();
    	Toast.makeText(this, "onResume() - Activity3", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStart() {
    	super.onStart();
    	Toast.makeText(this, "onStart() - Activity3", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onPause() {
    	super.onPause();
    	Toast.makeText(this, "onPause() - Activity3", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStop() {
    	super.onStop();
    	Toast.makeText(this, "onStop() - Activity3", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onDestroy() {
    	super.onDestroy();
    	Toast.makeText(this, "onDestroy() - Activity3", Toast.LENGTH_SHORT).show();
    }
    
    @Override
	protected void onSaveInstanceState(Bundle outState) {
	super.onSaveInstanceState(outState);
	Toast.makeText(getBaseContext(),"onSaveInstanceState - Activity3", Toast.LENGTH_SHORT).show();
	} // onSaveInstanceState
	
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
	Toast.makeText(getBaseContext(), "onRestoreInstanceState - Activity3", Toast.LENGTH_SHORT).show();
	super.onRestoreInstanceState(savedInstanceState);
	} // onRestoreInstanceState
    
    
}// Class Activity3