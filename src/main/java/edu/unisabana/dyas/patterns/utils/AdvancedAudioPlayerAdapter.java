package edu.unisabana.dyas.patterns.utils;


/**
 * Clase adaptadora que permite a AudioPlayer utilizar la funcionalidad de AdvancedAudioPlayer
 * 
 * @author andersonlopez, sandracuene
 */
public class AdvancedAudioPlayerAdapter implements AudioPlayer {
    private AdvancedAudioPlayer advancedAudioPlayer;

    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
        this.advancedAudioPlayer = advancedAudioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedAudioPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advancedAudioPlayer.playVlc(fileName);
        } else {
            System.out.println("Formato de audio no compatible");
        }
    }

    @Override
    public void stop() {
        advancedAudioPlayer.stop();
    }
}

