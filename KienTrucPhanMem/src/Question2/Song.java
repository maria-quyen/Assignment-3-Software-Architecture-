package Question2;

public class Song implements IComponent {
	public String songName;
	public String artist;
	public float speed;
	
	public void setSongName(String songName) { 
		this.songName = songName; 
	}
	public void setArtist(String artist) { 
		this.artist = artist; 
	}
	
	public Song() {}
	public Song(String songName, String artist, float speed) {
		this.songName = songName;
		this.artist = artist;
		this.speed = speed;
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + this.songName);
	}
	@Override
	public void setPlaybackSpeed(float speed) {
		// TODO Auto-generated method stub
		this.speed = speed;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return songName;
	}
	
	public String getArtist() {
		return artist;
	}
}
