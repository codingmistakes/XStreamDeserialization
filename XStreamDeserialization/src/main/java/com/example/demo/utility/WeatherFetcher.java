package com.example.demo.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WeatherFetcher {

	public static String Get() throws MalformedURLException, IOException {
		URL url = new URL("http://www.sourceflake.com/weatherdata.xml");
		
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");

		StringBuffer content = new StringBuffer();

		try(BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream())))
		{
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
		}

		con.disconnect();
		
		return content.toString();
	}
}
