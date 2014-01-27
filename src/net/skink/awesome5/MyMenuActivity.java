package net.skink.awesome5;



import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.app.Activity;

public class MyMenuActivity extends Activity {
	

    int screenWidth;
    int screenHeight;	                

	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Bundle theBundle;
		theBundle = getIntent().getExtras();

		if (null != theBundle) {
			screenWidth=theBundle.getInt("screenWidth");
			screenHeight=theBundle.getInt("screenHeight");
		}
		super.onCreate(savedInstanceState);

	}	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.my_menu, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	  	Intent intent;
	   	switch (item.getItemId()) {
	   	case R.id.menuItemAbout:
	       	intent = new Intent(this,AboutActivity.class);
			startActivity(intent);
	   		return true;
	   	
	   	default:
	   		return super.onOptionsItemSelected(item);
	   	}
	
	}

}
