package dip;

public class MusicPlayer {
	private AudioPlayer audioPlayer;

	public MusicPlayer(AudioPlayer audioPlayer) {
		this.audioPlayer = audioPlayer;
	}

	public void playMusic(String songName) {
		audioPlayer.play(songName);
	}
}
