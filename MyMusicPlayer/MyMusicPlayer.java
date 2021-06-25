package MyMusicPlayer;

import java.util.ArrayList;

public class MyMusicPlayer {

    private static Music music;
    public boolean isOn;
    public int defaultVolume;
    public boolean canMutePlayer;
    public ArrayList<Music> songList = new ArrayList<>();
    public boolean currentMusicPlaying;
    int maximumVolume;
    int minimumVolume;


    public boolean canBeTurnedOnWithTheToggleButton() {
        return true;
    }

    public boolean canBeTurnedOffWithTheToggleButton() {
        return true;
    }

    public int getDefaultVolume() {
        return defaultVolume;
    }


    public void setDefaultVolume(int defaultVolume) {
        if(defaultVolume == 15)
            maximumVolume = defaultVolume;
        this.defaultVolume = defaultVolume;
    }

    public void increaseDefaultVolume(int increment) {
        defaultVolume += increment;


    }

    public void decreaseDefaultVolume(int decrement) {
        defaultVolume += decrement;
    }

    public boolean cannotBeIncreasedWhenTurnedOn() {
        return true;
    }

    public int displayMaximumVolume(int defaultVolume) {
        if (defaultVolume == 15) {
            maximumVolume = defaultVolume;
        }
        return defaultVolume;
    }

    public int displayMinimumVolume(int defaultVolume) {
        if(defaultVolume == 0){
            minimumVolume = defaultVolume;
        }

        return defaultVolume;
    }

    public void setCurrentMusicPlaying(Music music) {
        MyMusicPlayer.music = music;
    }

    public Music getCurrentMusicPlaying() {
        return music;
    }

    public Music download(Music music) {
        return music;

    }
}






