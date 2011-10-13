package com.RandomGods.presenters;

import java.io.IOException;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.RandomGods.library.CardBuilder;

public class Main extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		CardBuilder builder = new CardBuilder();
		String output = null;
		try {
			output = builder.parse(getAssets());
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		Log.d("RANDOMGODS", output);
	}
}
