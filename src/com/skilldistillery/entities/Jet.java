package com.skilldistillery.entities;

import java.util.Objects;

public abstract class Jet  {
	protected String type;
	private String model;
	private double speed;
	private int range;
	private long price;
	
	
	
	
	public Jet(String type, String model, double speed, int range, long price) {
		super();
		this.type = type;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, price, range, speed, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		return Objects.equals(model, other.model) && price == other.price && range == other.range
				&& Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed)
				&& Objects.equals(type, other.type);
	}

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public void fly() {
		
	}
	public double getSpeedInMach() {
		
		return speed;
	}

	@Override
	public String toString() {
		return "Type: " + type + " Model: " + model + ", Speed(MPH): " 
	+ speed + ", Range:" + range + ", Price: $" + price;
				
	}
	
}
