package SEM_4.Structural_Design_Pattern.Adapter_Design_Pattern.MediaPlayer;

public class VLCPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing VLC File | Name: " + fileName);
    }

    @Override
    public void playMP4(String fileName) {
        
    }
    
}
