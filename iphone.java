public class iphone {
    public static void main(String[] args) {
        iPhone myPhone = new iPhone();
        myPhone.playSong("Stairway to Heaven");
        myPhone.makeCall("555-1234");
        myPhone.openWebPage( );

        System.out.println("MISA");
    }
}

public interface MusicPlayer {
    void playSong(String songTitle);
    void pauseSong();
    void stopSong();
    void skipToNextSong();
    void skipToPreviousSong();
}
public interface Telephone {
    void makeCall(String phoneNumber);
    void endCall();
    void answerCall();
    void rejectCall();
}
public interface InternetBrowser {
    void openWebPage(String url);
    void closeWebPage();
    void refreshWebPage();
    void goBack();
    void goForward();
}
public class iPhone implements MusicPlayer, Telephone, InternetBrowser {
    private String songTitle;
    private String phoneNumber;
    private String url;
    @Override
    public void playSong(String songTitle) {
        this.songTitle = songTitle;
        // Play the song
    }
    @Override
    public void pauseSong() {
        // Pause the song
    }
    @Override
    public void stopSong() {
        // Stop the song
    }
    @Override
    public void skipToNextSong() {
        // Skip to the next song
    }
    @Override
    public void skipToPreviousSong() {
        // Skip to the previous song
    }
    @Override
    public void makeCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        // Make the call
    }
    @Override
    public void endCall() {
        // End the call
    }
    @Override
    public void answerCall() {
        // Answer the call
    }
    @Override
    public void rejectCall() {
        // Reject the call
    }
    @Override
    public void openWebPage(String url) {
        this.url = url;
        // Open the web page
    }
    @Override
    public void closeWebPage() {
        // Close the web page
    }
    
    @Override
public void refreshWebPage() {
    // Refresh the current web page
    }
}