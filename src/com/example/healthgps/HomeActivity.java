package com.example.healthgps;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class HomeActivity  extends Activity{
	
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.activity_home);
<<<<<<< HEAD

		ImageButton hospitalButton = (ImageButton) findViewById(R.id.hospital);
		hospitalButton.setOnClickListener(new OnClickListener() {

			@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
			@SuppressLint("NewApi")
			public void onClick(View button) {
				
				Intent hospitalList = new Intent(HomeActivity.this, TabLayoutActivity.class);
				
				
				startActivity(hospitalList);
				overridePendingTransition(R.anim.animation,
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

=======
>>>>>>> 508ba387ad5f880db527ee9b8d9a6c17a7bdd720
	}

	
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}

}
