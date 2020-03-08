package com.solidprinciples.liskovsubstitution.badimplementation;

public class WinampMediaPlayer extends MediaPlayer {

	// Play video is not supported in Winamp player
	public void playVideo() {
		throw new VideoUnsupportedException();
	}
}