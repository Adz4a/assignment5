package Adapter;


public class Main {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "california.mp3");
        audioPlayer.play("mp4", "stone free'.mp4");
        audioPlayer.play("vlc", "sweet dreams.vlc");
        audioPlayer.play("avi", "berserk.avi");

    }
}

