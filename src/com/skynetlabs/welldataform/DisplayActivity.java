package com.skynetlabs.welldataform;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.display);

		Bundle bundle = getIntent().getExtras();
		TextView wellID = (TextView) findViewById(R.id.wellIDValue);
		TextView flowRate = (TextView) findViewById(R.id.flowRateValue);
		TextView oilTankLevel = (TextView) findViewById(R.id.oilTankLevelValue);
		TextView waterTankLevel = (TextView) findViewById(R.id.waterTankLevelValue);

		wellID.setText(bundle.getCharSequence("wellID"));
		flowRate.setText(bundle.getCharSequence("flowRate"));
		oilTankLevel.setText(bundle.getCharSequence("oilTankLevel"));
		waterTankLevel.setText(bundle.getCharSequence("waterTankLevel"));

	} // end method onCreate

} // end Class DisplayActivity
