package SEM_4.Structural_Design_Pattern.Adapter_Design_Pattern.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;
    
    public MediaAdapter(String audioType)
    {
        if(audioType.equalsIgnoreCase("VLC"))
        {
            advancedMusicPlayer = new VLCPlayer();
        }
        else if(audioType.equalsIgnoreCase("MP4"))
        {
            advancedMusicPlayer = new MP4Player();
        }
    } 

    public void play(String audioType, String fileName)
    {
        if(audioType.equalsIgnoreCase("VLC"))
        {
            advancedMusicPlayer.playVLC(fileName);
        }
        else if(audioType.equalsIgnoreCase("MP4"))
        {
            advancedMusicPlayer.playMP4(fileName);
        }
    }
}
