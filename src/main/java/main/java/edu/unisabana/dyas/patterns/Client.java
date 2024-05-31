package main.java.edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;
import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayerAdapter;
import edu.unisabana.dyas.patterns.utils.AudioPlayer;

/**
 * Cliente que utiliza directamente AdvancedAudioPlayer sin conocer la interfaz AudioPlayer
 * 
 * @author andersonlopez, sandracuene
 */
public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AdvancedAudioPlayerAdapter(new AdvancedAudioPlayer());
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.stop();

        AudioPlayer audioPlayervlc = new AdvancedAudioPlayerAdapter(new AdvancedAudioPlayer());
        audioPlayervlc.play("vlc", "audio.vlc");
        audioPlayervlc.stop();
    }
}