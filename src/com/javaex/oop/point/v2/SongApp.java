package com.javaex.oop.point.v2;


class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	public Song(String artist, String title, String album, int year, int track, String composer) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.year = year;
		this.track = track;
		this.composer = composer;
	}


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
		System.out.println(
				artist + ", " + title + " (" + album + "," + year + "," + track + "번 track," + composer + " 작곡)");

	}

}

public class SongApp {

	public static void main(String[] args) {

		Song singer1 = new Song("아이유", "좋은날", "Real", 2010, 3, "이민수");
		singer1.showInfo();

		Song singer2 = new Song("BIGBANG", "거짓말", "Always", 2007, 2, "G-DRAGON");
		singer2.showInfo();

		Song singer3 = new Song("버스커버스커", "벚꽃엔딩", "버스커버스커1집", 2012, 4, "장범준");
		singer3.showInfo();

	}

}
