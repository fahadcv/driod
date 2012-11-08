package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;


public class Matrix extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    /** Called when the user clicks the new Customer button */
    public void newCustHome(View view) {
    	
    	Intent intent = new Intent(this,NewCustomerHome.class );
    	startActivity(intent);
    	
    }
    
	 public void findCustomer(View view) {
	        
	    	Intent intent = new Intent(this,FindCustomer.class );
	    	startActivity(intent);	    	
	  }
}
