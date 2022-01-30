package com.anti.integershort;

import java.util.Comparator;

public class SortByYearComparator implements Comparator<Song> {

	@Override
	public int compare(Song song, Song anotherSong) {
		// TODO Auto-generated method stub

		// sort song object by year
		
		if (song.getYear() > anotherSong.getYear()) {

			return +1;
		}

		if (song.getYear() <  anotherSong.getYear()) {

			return -1;
		}

		return 0;
	}

}
