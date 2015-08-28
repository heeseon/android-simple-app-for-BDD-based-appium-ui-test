package com.example.simplelogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class LoginActivity extends Activity {

	EditText idET;
	EditText pwdET;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		idET = (EditText)findViewById(R.id.idET);
		pwdET = (EditText)findViewById(R.id.pwdET);

		findViewById(R.id.login).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String id = idET.getText().toString();
				String pwd = pwdET.getText().toString();

				Intent mainIntent = new Intent(getBaseContext(), ResultActivity.class);
				mainIntent.putExtra("ID", id);
				mainIntent.putExtra("PW", pwd);
				startActivity(mainIntent);
			}
		});
	}

}
