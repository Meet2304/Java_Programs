package SEM_4.Structural_Design_Pattern.Adapter_Design_Pattern.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("MP3"))
        {
            System.out.println("Playing MP3 File | Name: " + fileName);
        }
        else if(audioType.equalsIgnoreCase("VLC") || audioType.equalsIgnoreCase("MP4"))
        {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,     fileName);
        }
        else
        {
            System.out.println("Invalid Media " + audioType + " Format Not Supported");
        }
    }
}
