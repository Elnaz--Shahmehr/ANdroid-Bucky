package com.thenewboston.android.bucky;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BuckyActivity extends Activity {
    /** Called when the activity is first created. */
	int Counter;
	Button add,sub;
	TextView disply;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Counter = 0;
        add = (Button) findViewById(R.id.bAdd);
        sub = (Button) findViewById(R.id.bSub);
        disply = (TextView) findViewById(R.id.tvDisply);
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Counter++;
				disply.setText("Your Total is "+ Counter);
			}
		});
        
sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Counter--;
				disply.setText("Your Total is "+ Counter);
				
			}
		});
    }
}