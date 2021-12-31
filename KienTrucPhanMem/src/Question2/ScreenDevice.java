package Question2;

import java.util.*;

public class ScreenDevice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String playListName;
		String songName, artist;
		float speed;
		Playlist playlist;
		IComponent ic, ic1;
		
		//Input info song ,playlist 
		System.out.print("Enter playlist name: ");
		playListName = scanner.nextLine();
		playlist = new Playlist(playListName);
		
		System.out.print("Enter song name: ");
		songName = scanner.nextLine();
		System.out.print("Enter artist name: ");
		artist = scanner.nextLine();
		System.out.print("Enter speed: ");
		speed = scanner.nextFloat();
		
		ic = new Song(songName,artist,speed);
		ic1 = new Song("qaz","wsx",2.1f);
		
		//add to playlist
		System.out.println();
		playlist.add(ic);
		playlist.add(ic1);
		
		System.out.println(playlist.playlist);
		playlist.play();
		
		//remove 1 song in playlist
		System.out.println();
		playlist.remove(ic1);

		System.out.println(playlist.playlist);
		playlist.play();
		
		scanner.close();
	}
}
