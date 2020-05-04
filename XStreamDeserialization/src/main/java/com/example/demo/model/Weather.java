package com.example.demo.model;

public class Weather {
    public float lon;
    public float lat;
    public String main;
    public String description;
    public int temp;
    public int id;
    public String name;
    
    public Weather()
    {
    
    }
    
    public Weather(float lon, float lat, String main, String description, int temp, int id, String name)
    {
    	this.lon = lon;
    	this.lat = lat;
    	this.main = main;
    	this.description = description;
    	this.temp = temp;
    	this.id = id;
    	this.name = name;
    }
    
	public float getLon() {
		return lon;
	}
	public void setLon(float lon) {
		this.lon = lon;
	}
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}    
}
