package com.javaex.oop.point.v3;

class TV {
	private int channel;
	private int volume;
	private boolean power;

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public int getPower() {
		return power;
	}

}

public class TVApp {

	public static void main(String[] args) {
		TV tv = new TV(7, 20, false);

	}

}
