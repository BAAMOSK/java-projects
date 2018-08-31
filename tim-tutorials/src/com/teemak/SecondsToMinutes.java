package com.teemak;

public class SecondsToMinutes {
	public static void main(String[] args) {
		String result = getDurationString(120,160);
		System.out.println(result);
	}
	
	public static String getDurationString(int minutes, int seconds) {
		if(minutes < 0 || seconds < 0 || seconds > 59) {
			return "Invalid Value";
		}
		System.out.println("The original runs!");
		//int newSeconds = seconds % 60;
		int newMinutes = (seconds / 60 + minutes) % 60;
		int hours = (seconds / 60 + minutes) / 60;
		String result = hours + ":h -- " + newMinutes + ":m -- " + seconds + ":s";
		return result;
	}
	
	public static String getDurationString(int seconds) {
		if(seconds < 0) {
			return "Invalid Value";
		}
		//System.out.println("The single arg function runs!");
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		if(remainingSeconds < 60 && remainingSeconds > 0) {
			return "0:h -- 0:m -- " + remainingSeconds + ":s";
		}
		return getDurationString(minutes, remainingSeconds);
	}
}
