package com.bit.javaex.oop.goods.point.v3;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	// Getter/Setter
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
	
	
	// 출력 메소드
	public void showInfo() {
		System.out.printf("%s, %s ( %s, %d, %d번 track, %s 작곡) %n"
		, artist, title, album, year, track, composer);
	}
	
	
}
