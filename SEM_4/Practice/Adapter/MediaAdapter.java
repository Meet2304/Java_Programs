package SEM_4.Practice.Adapter;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String audiotype)
    {
        if(audiotype.equalsIgnoreCase("VLC"))
        {
            advancedMediaPlayer = new VLCPlayer();
        }
        else if (audiotype.equalsIgnoreCase("MP4"))
        {
            advancedMediaPlayer = new MP4Player();
        }
        else
        {
            System.out.println("Incorrecr audiotype");
        }
    }
    
    @Override
    public void play(String audiotype, String filename) {
        if (audiotype.equalsIgnoreCase("VLC"))
        {
            advancedMediaPlayer.playVLC(filename);
        }
        else if(audiotype.equalsIgnoreCase("MP4"))
        {
            advancedMediaPlayer.playMP4(filename);
        }
    }
    
}
