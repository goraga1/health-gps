package com.example.healthgps;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;

public class HomeActivity extends Activity {

	@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.activity_home);

		ImageButton hospitalButton = (ImageButton) findViewById(R.id.hospital);
		hospitalButton.setOnClickListener(new OnClickListener() {

			@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
			@SuppressLint("NewApi")
			public void onClick(View button) {
				
				Intent hospitalList = new Intent(HomeActivity.this, TabLayoutActivity.class);
				
				
				startActivity(hospitalList);overridePendingTransition(R.anim.animation,
						R.anim.animation1);
			//	startActivity(hospitalList);
				
				
				if (button.isSelected()) {
					button.setSelected(false);
					// ...Handle toggle off
				} else {
					button.setSelected(true);
					// ...Handled toggle on
				}
			}

		});

	}

	// public boolean onCreateOptionsMenu(Menu menu) {
	// // Inflate the menu; this adds items to the action bar if it is present.
	// getMenuInflater().inflate(R.menu.main, menu);
	// return true;
	// }

}
