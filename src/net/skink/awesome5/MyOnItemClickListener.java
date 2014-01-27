package net.skink.awesome5;


import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

// This class handles the main list 
public class MyOnItemClickListener implements OnItemClickListener {

	 private static String TAG = "OnItemClickListener";
	 private MainActivity theMainActivity = null;
//	 private BrowseCompanionActivity theCompanionActivity = null;
//	 private BrowseToonsActivity theBrowseToonsActivity = null;
//	 private SearchGifts theGiftActivity = null;
//	 private SearchArmor theArmorActivity = null;
//	 private TodoListActivity theTodoListActivity = null;
	 
//	public MyOnItemClickListener(BrowseCompanionActivity a) {
//		theCompanionActivity = a;
//	}	
	
	
//	public MyOnItemClickListener(SearchGifts a) {
//		theGiftActivity = a;
//	}


//	public MyOnItemClickListener(SearchArmor searchArmor) {
//		// TODO Auto-generated constructor stub
//	}


//	public MyOnItemClickListener(BrowseToonsActivity a) {
//		theBrowseToonsActivity = a;
//	}


//	public MyOnItemClickListener(TodoListActivity a) {
//		theTodoListActivity = a;
//	}


	public MyOnItemClickListener(MainActivity a) {
		// TODO Auto-generated constructor stub
		theMainActivity = a;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View v, int pos, long id) {
		Log.d(TAG, "onitemselected"); 
		String selectedListItemName;
   	
    	switch (parent.getId()){
    	case R.id.listView1:
    		selectedListItemName = parent.getItemAtPosition(pos).toString();
    		//Toast.makeText(v.getContext(), companionName, Toast.LENGTH_SHORT).show();
    		break;

    	default:
    		return;
    	}
    	
 //   	if (null != theGiftActivity) {
 //      	theGiftActivity.selectCompanion(selectedListItemName);    		
 //   	} else if (null != theCompanionActivity) {
 //       	theCompanionActivity.selectCompanion(selectedListItemName);    		
 //   	} else if (null != theBrowseToonsActivity) {
 //   		theBrowseToonsActivity.selectToon(selectedListItemName);    		
 //   	} else if (null != theArmorActivity) {
 //   		theArmorActivity.selectCompanion(selectedListItemName);    		
 //   	} else if (null != theTodoListActivity) {
 //   		theTodoListActivity.selectToDo(selectedListItemName,pos);    		
 //   		Log.d(TAG, "todo list selected"); 
 //   	}

	}

}
