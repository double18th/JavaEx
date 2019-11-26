package com.bit.javaex.oop.goods.point.v1;

public class SongApp {

	public static void main(String[] args) {
		// 출력

		Song s1 = new Song();
		s1.setArtist("BIGBANG");
		s1.setTitle("거짓말");
		s1.setAlbum("ALWAYS");
		s1.setYear(2007);
		s1.setTrack(4);
		s1.setComposer("G-DRAGON");
		s1.showInfo();
	}

}
