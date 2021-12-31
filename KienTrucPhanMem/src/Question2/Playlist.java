package Question2;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Playlist implements IComponent {
	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList<IComponent>();
	
	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + this.playlistName);
		for (int i = 0; i < playlist.size(); i++){
			System.out.println("==> Playing song " + playlist.get(i).getName());
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return playlistName;
	}
	
	public void add(IComponent component){
		playlist.add(component);
		System.out.println("Added " + component.getName() + " into " + this.playlistName);
	}
	
	public void remove(IComponent component){
		playlist.remove(component);
		System.out.println("Removed " + component.getName() + " into " + this.playlistName);
	}
}
