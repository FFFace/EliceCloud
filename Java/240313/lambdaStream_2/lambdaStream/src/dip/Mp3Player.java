package dip;

public class Mp3Player implements AudioPlayer{
	@Override
	public void play(String songName) {
		System.out.println("Playing " + songName + " on MP3 Player");
	}
}
