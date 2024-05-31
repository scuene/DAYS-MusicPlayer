package edu.unisabana.dyas.patterns.utils;

/**
 * Interfaz para el reproductor de audio
 * 
 * @author andersonlopez, sandracuene
 */
public interface AudioPlayer {
    void play(String audioType, String fileName);
    void stop();
}