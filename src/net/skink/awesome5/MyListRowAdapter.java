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
