// Copyright (c) 2014, John F. Davis davisjf@gmail.com
// All rights reserved.
// 
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are met: 
// 
// 1. Redistributions of source code must retain the above copyright notice, this
// list of conditions and the following disclaimer. 
// 2. Redistributions in binary form must reproduce the above copyright notice,
// this list of conditions and the following disclaimer in the documentation
// and/or other materials provided with the distribution. 
// 
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
// ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
// WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
// DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
// ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
// (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
// LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
// ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
// SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
// 
// The views and conclusions contained in the software and documentation are those
// of the authors and should not be interpreted as representing official policies, 
// either expressed or implied, of the FreeBSD Project.




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
