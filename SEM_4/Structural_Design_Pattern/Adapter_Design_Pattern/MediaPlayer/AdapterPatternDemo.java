package SEM_4.Structural_Design_Pattern.Adapter_Design_Pattern.MediaPlayer;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("MP3", "Beyond the Horizon.mp3");
        audioPlayer.play("MP4", "Alone.mp3");
        audioPlayer.play("VLC", "Far Far Away.vlc");
        audioPlayer.play("avi", "Mind Me.avi");
    }
}
