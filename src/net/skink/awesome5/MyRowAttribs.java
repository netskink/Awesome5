package net.skink.awesome5;


public class MyRowAttribs {
	public String row_text;  // This is the text string shown in the the listview row
	public int text_color;	// This is the color of the text in the listview row
	public int currentValue; // This is the value of the row, it can be used to flag a particular row for something.
	
	
	public MyRowAttribs() {
		
		row_text = "not specified";
		text_color = 0;
		currentValue=0;
	}
	public String toString() {
		return row_text;
	}
}
