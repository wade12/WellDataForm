package com.skynetlabs.welldataform;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends Activity implements OnClickListener {

	Button button;
	EditText wellID;
	EditText flowRate;
	EditText oilTankLevel;
	EditText waterTankLevel;

	// called when the activity is first created.
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form);

		// et ids of the view objects
		findAllViewsId();

		button.setOnClickListener(this);

	} // end method onCreate

	private void findAllViewsId() {
		button = (Button) findViewById(R.id.submit);
		wellID = (EditText) findViewById(R.id.wellID);
		flowRate = (EditText) findViewById(R.id.flowRate);
		oilTankLevel = (EditText) findViewById(R.id.oilTankLevel);
		waterTankLevel = (EditText) findViewById(R.id.waterTankLevel);

	} // end method findAllViewsId

	@Override
	public void onClick(View view) {
		Intent intent = new Intent(getApplicationContext(),
				DisplayActivity.class);
		// create bundle object
		Bundle bundle = new Bundle();

		// Inserts a String value into the mapping of this Bundle
		bundle.putString("wellID", wellID.getText().toString());
		bundle.putString("flowRate", flowRate.getText().toString());
		bundle.putString("oilTankLevel", oilTankLevel.getText().toString());
		bundle.putString("waterTankLevel", waterTankLevel.getText().toString());

		// add bundle to the intent.
		intent.putExtras(bundle);

		// start the DisplayActivity
		startActivity(intent);

	} // end method onClick

} // end Class FormActivity
