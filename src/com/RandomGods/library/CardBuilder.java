package com.RandomGods.library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.res.AssetManager;

import com.RandomGods.models.Card;
import com.RandomGods.models.Const;

public class CardBuilder {
	private List<Card> _masterList;
	private Context _context;
	
	public CardBuilder(Context context) {
		_masterList = null;
		_context = context;
	}

	public List<Card> getMasterList() {
		return _masterList;
	}
	
	public boolean loadDatabase() {
		
		return false;
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
