package com.solidprinciples.interfacesegragation.baddesign;

public class WinampMediaPlayer implements MediaPlayer {

	// Play video is not supported in Winamp player
	public void playVideo() {
//		throw exceptions
//		throw new VideoUnsupportedException();
	}

	@Override
	public void playAudio() {
		System.out.println("Playing audio ..............");

	}
}