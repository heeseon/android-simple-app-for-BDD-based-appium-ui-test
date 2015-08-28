package com.example.simplelogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);

		Intent intent = getIntent();
		String id;
		String passwd;
		id = intent.getExtras().getString("ID");
		passwd = intent.getExtras().getString("PW");

		TextView TxtResult1 = (TextView)findViewById(R.id.result);
		if(id.equals("domich") && passwd.equals("1234"))
			TxtResult1.setText("Logined");
		else
			TxtResult1.setText("Invalid ID or PASSWORD");



	}

}
