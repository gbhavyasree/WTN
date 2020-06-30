package live_interface;
import music.string.Veena;
import music.wind.Saxophone;
import music_interface.playable;
public class Test {
	public static void main(String[] args) 
	{
		playable v,s,a;
		
	  v=new Veena();
		v.play();
	  s=new Saxophone();
		s.play();
	}
	
}
