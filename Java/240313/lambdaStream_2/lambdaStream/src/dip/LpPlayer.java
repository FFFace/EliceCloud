package dip;

public class LpPlayer implements AudioPlayer{

	@Override
	public void play(String songName) {
		System.out.println("Playing " + songName + " on LP Player");
	}
}
