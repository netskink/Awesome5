package net.skink.awesome5;




import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends MyMenuActivity {

    // UI Components
    ListView theList;
    MyListRowAdapter<MyRowAttribs> adapter;
    MyRowAttribs[] newValues; // will store an array.
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        // Get the UI Components
        theList = (ListView) findViewById(R.id.listView1);
	
        // set the ingredient list to all.
	    setListViewContents();
	
	}

    public void setListViewContents() {

    	int numCursorRows;
    	
        // Determine the ingredients to put in the list.
        numCursorRows = 3;
	    newValues = new MyRowAttribs[numCursorRows]; // create an array of proper size.
	    for (int i=0;i<numCursorRows;i++) {
	    	newValues[i] = new MyRowAttribs();
	    	newValues[i].row_text="aaaaaaa"; // todo name
	    	newValues[i].currentValue=1; // todo name
	    	newValues[i].text_color=MyUIColors.black.getCode();
	    		
	    }
    	newValues[0].row_text="Red"; // todo name
    	newValues[0].text_color=MyUIColors.red.getCode();

    	newValues[1].row_text="Green"; // todo name
    	newValues[1].text_color=MyUIColors.green.getCode();

    	newValues[2].row_text="Blue"; // todo name
    	newValues[2].text_color=MyUIColors.blue.getCode();

    	
    	// Build the listview
	    // The adapter determines how to draw on screen.  The listview will ask the adapter to draw the view
	    // with adapter's getView method.
	    adapter = new MyListRowAdapter<MyRowAttribs>(this,android.R.layout.simple_list_item_1, newValues);

		theList.setAdapter(adapter);
        theList.setOnItemClickListener(new MyOnItemClickListener(this));

    }
	
	

}
