package com.anti.integershort;

import java.util.ArrayList;
import java.util.Collections;

public class MP4 {

	public static void main(String[] args) {

		// Integer a = 5;
		// System.out.println(a.compareTo(8));

		// negativ if current object lesser then specified
		// System.out.println("b".compareTo("x"));

		ArrayList<Song> musiclist = new ArrayList<>();

		Song song1 = new Song("as you love me", "Backstreet boys", 2008);
		Song song2 = new Song("see you again", "Wiz Khalifa", 2015);
		Song song3 = new Song("take me to your heart", "Micheal Learn to rock ", 2014);
		Song song4 = new Song("radio Gaga", "Queen", 19891);
		Song song5 = new Song("love me like you do", "Ellie  Goulding", 2013);

		musiclist.add(song1);
		musiclist.add(song2);
		musiclist.add(song3);
		musiclist.add(song4);
		musiclist.add(song5);

		Util.printArrayListLinefeed(musiclist);

		Collections.sort(musiclist);

		System.out.println("----------------------After shorting--------------- ");
		Util.printArrayListLinefeed(musiclist);

		//SortByYearComparator c = new SortByYearComparator();
		Collections.sort(musiclist,  new SortByYearComparator());

		System.out.println("----------------------After shorting--------------- ");
		Util.printArrayListLinefeed(musiclist);

	}

}
