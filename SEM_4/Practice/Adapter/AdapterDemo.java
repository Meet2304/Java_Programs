package SEM_4.Practice.Adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer A1 = new AudioPlayer();
        A1.play("MP3", "ABC");
        A1.play("MP4", "ABC");
        A1.play("VLC", "ABC");
        A1.play("Msdd", "ABC");

    }
}
