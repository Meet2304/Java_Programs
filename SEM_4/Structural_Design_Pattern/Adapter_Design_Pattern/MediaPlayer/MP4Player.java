package SEM_4.Structural_Design_Pattern.Adapter_Design_Pattern.MediaPlayer;

public class MP4Player implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {
        
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing MP4 File | Name: " + fileName);
    }
    
}
