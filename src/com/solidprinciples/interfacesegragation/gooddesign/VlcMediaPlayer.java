package com.solidprinciples.interfacesegragation.gooddesign;

public class VlcMediaPlayer implements VideoMediaPlayer, AudioMediaPlayer {

	@Override
	public void playVideo() {
		System.out.println(" Playing video ..........");

	}

	@Override
	public void playAudio() {
		System.out.println(" Playing audio ..........");

	}
}