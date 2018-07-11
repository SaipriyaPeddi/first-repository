package com.example.android;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Thread t1=new Thread(){
			
			public void run(){
			 
				try{
				 
					int i=0;
					while(i<2000){
						sleep(100);
						i=i+100;
					}
					Intent it=new Intent(MainActivity.this,ActivityLifeCycle.class);
					startActivity(it);
				
			 }
				catch(Exception e){}
		}
		
	   };
		t1.start();
		
	}


}
