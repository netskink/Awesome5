package net.skink.awesome5;



import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MyListRowAdapter<T> extends ArrayAdapter<T> {

    MyRowAttribs[] myobjects;

	public MyListRowAdapter(Context context, int textViewResourceId, T[] objects) {
		super(context, textViewResourceId, objects);
		myobjects = (MyRowAttribs[]) objects;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		View row = super.getView(position, convertView, parent);
	    TextView text = (TextView) row.findViewById(android.R.id.text1);
	    text.setTextColor(myobjects[position].text_color);	  

	    
		return row;
	}
	
	

	
	// This will set the list to small text and it will be in blue.
/*	
	 public View getView(int position, View convertView, ViewGroup parent) {
         TextView text = new TextView(getContext());
         text.setText("Hi, I am position " + position);
         text.setTextColor(Color.parseColor("#64788e"));
         return  text;
	}
*/	
}
