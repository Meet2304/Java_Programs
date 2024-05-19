package SEM_4.Practice.Adapter;

public class VLCPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing VLC media: " + fileName);
    }

    @Override
    public void playMP4(String filename) {}
    
}
