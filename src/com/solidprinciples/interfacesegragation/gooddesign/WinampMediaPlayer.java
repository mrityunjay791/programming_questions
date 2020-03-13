package com.solidprinciples.interfacesegragation.gooddesign;

public class WinampMediaPlayer implements AudioMediaPlayer {

	@Override
	public void playAudio() {
		System.out.println(" Playing audio........");

	}
}