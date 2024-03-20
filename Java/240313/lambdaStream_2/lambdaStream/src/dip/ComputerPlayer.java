package dip;

public class ComputerPlayer implements AudioPlayer{
	@Override
	public void play(String songName) {
		System.out.println("Playing " + songName + " on Computer");
	}
}
