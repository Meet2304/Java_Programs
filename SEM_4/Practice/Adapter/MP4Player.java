package SEM_4.Practice.Adapter;

public class MP4Player implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {}

    @Override
    public void playMP4(String filename) {
        System.out.println("Playinh MP4 Media: " + filename);
    }
    
}
