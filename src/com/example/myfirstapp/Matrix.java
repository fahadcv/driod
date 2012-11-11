package com.example.myfirstapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class Matrix extends Activity {
	
	Context Ctxt;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Ctxt = this;
        
        //when user clicks on the view All customer button, show all the customers
        ImageButton ImgBtnViewAll = (ImageButton) findViewById(R.id.viewAll_cust);        
        ImgBtnViewAll.setOnClickListener(new OnClickListener() {
        	
			public void onClick(View v)  {
			
						Bundle bundle = new Bundle();			
						bundle.putString("custName","");	
						
						Intent intent = new Intent(Ctxt,SearchCustomerByName.class);				
						/* sending the customer details to next activity 			 */						
						intent.putExtras(bundle);			
						
						//start the activity						
						Ctxt.startActivity(intent);				
			}	
		});
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
