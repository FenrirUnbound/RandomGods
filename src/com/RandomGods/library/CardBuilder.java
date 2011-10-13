package com.RandomGods.library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.content.res.AssetManager;

import com.RandomGods.models.Const;

public class CardBuilder {
	public CardBuilder() {
		
	}

	public String parse(AssetManager assets) throws IOException {
		StringBuilder builder = new StringBuilder();
		
		InputStream iStream = assets.open(Const.DATABASE);
		InputStreamReader iReader = new InputStreamReader(iStream, "UTF-8");
		
		BufferedReader input = new BufferedReader(iReader);

		while(input.ready())
			builder.append(input.readLine());
		
		return builder.toString();
		
		//build JSON from this read
		//JSONObject = new JSONObject(string);
	}
}
