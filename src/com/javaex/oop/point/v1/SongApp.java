package com.javaex.oop.point.v1;

import com.javaex.oop.goods.v4.Goods;

class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getAlbum() {
		return album;
	}

	public String getComposer() {
		return composer;
	}

	public int getYear() {
		return year;
	}

	public int getTrack() {
		return track;
	}

	public void showInfo() {
		System.out.print(artist + "," + title + "(" + album + "," + track + "번 track, " + composer + " 작곡");

	}

}

public class SongApp {

	public static void main(String[] args) {
		
		
		Song singer1 = new Song("아이유","좋은날","Real",2010,3,"이민수");
		singer1.showInfo();

	}

}
