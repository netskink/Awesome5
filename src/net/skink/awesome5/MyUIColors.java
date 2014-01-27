package net.skink.awesome5;

import android.graphics.Color;

public enum MyUIColors {
	black(Color.parseColor("#000000")),
	white(Color.parseColor("#FFFFFF")),
	red(Color.parseColor("#7b2325")),
	green(Color.parseColor("#6df486")),
	blue(Color.parseColor("#64788e")),
	ImperialRed(Color.parseColor("#7b2325")),
	ImperialRedBright(Color.parseColor("#fb2325")),
	RepublicBlue(Color.parseColor("#64788e")),
	GiftGreen(Color.parseColor("#6df486")),
	GiftYellow(Color.parseColor("#ddf60c")),
	GiftRed(Color.parseColor("#f64448"));
	
	private int code;
	
	private MyUIColors(int c) {
		code = c;		
	}
	
	public int getCode() {
		
		return code;
	}
}
