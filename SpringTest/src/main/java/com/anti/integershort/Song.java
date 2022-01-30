package com.anti.integershort;

public class Song  implements Comparable<Song> {
	
	private String title;
	private String artis;
	
	private Integer year;

	public String getTitle() {
		return title;
	}

	public String getArtis() {
		return artis;
	}

	public Song(String title, String artis, Integer year) {
		this.title = title;
		this.artis = artis;
		this.year = year;
	}

	public Integer getYear() {
		return year;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtis(String artis) {
		this.artis = artis;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artis=" + artis + ", year=" + year + "]";
	}

	@Override
	public int compareTo(Song another) {
		return this.getArtis().compareTo(another.getArtis());
	  
		//return this.getTitle().compareTo(another.getTitle());
		  
		//return this.getYear().compareTo(another.year);
	}

}
