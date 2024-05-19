package SEM_4.Practice.Adapter;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audiotype, String filename) {
        if(audiotype.equalsIgnoreCase("MP3"))
        {
            System.out.println("Playing MP3: " + filename);
        }
        else if(audiotype.equalsIgnoreCase("MP4") || audiotype.equalsIgnoreCase("VLC"))
        {
            MediaAdapter M1 = new MediaAdapter(audiotype);
            M1.play(audiotype, filename);
        }
        else
        {
            System.out.println("Incorrect audiotype");
        }
    }
    
}
