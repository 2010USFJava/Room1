package com.revature.beans;

public class Art {
	
	// instance variables
		private String artist;
		private int yearMade;
		
		public Art () {
			
		}
		
		// constructor
		public Art (String artist, int yearMade) {
			this.artist = artist;
			this.yearMade = yearMade;

		}

		// getters and setters
		public String getArtist() {
			return artist;
		}

		public void setArtist(String artist) {
			this.artist = artist;
		}

		public int getYearMade() {
			return yearMade;
		}

		public void setYearMade(int yearMade) {
			this.yearMade = yearMade;
		}

		@Override
		public String toString() {
			return "Art [artist=" + artist + ", yearMade=" + yearMade + "]";
		}
		
		
		
}
