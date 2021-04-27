package Main;

import GUI.gui;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        gui.startUp();
    }
}

