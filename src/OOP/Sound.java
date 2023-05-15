package OOP;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Sound {

	public Sound() {
		// TODO Auto-generated constructor stub
	}
	public static void play(String path) {
		 File ac= new File(path);
		 try {
			 AudioInputStream ab=AudioSystem.getAudioInputStream(ac);
			 Clip c=AudioSystem.getClip();
			 c.open(ab);
			 c.start();
			 c.loop(Clip.LOOP_CONTINUOUSLY);
		 }
		 catch (Exception e)
		 {
			 JOptionPane.showMessageDialog(null,"Error"); 
		 }
}
	public static void playsound(String path) {
		File ad= new File(path);
		 try {
			 AudioInputStream ab=AudioSystem.getAudioInputStream(ad);
			 Clip c=AudioSystem.getClip();
			 c.open(ab);
			 c.start();
		 }
		 catch (Exception e)
		 {
			 JOptionPane.showMessageDialog(null,"Error"); 
		 }
	}
}
