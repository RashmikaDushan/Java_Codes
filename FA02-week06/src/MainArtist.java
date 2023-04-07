//Child class for main artist
public class MainArtist extends Artists {
    private final boolean canSing = true;
    private boolean is_Singing;

    public MainArtist(String name) {
        super(name);
    }

    //to print singing
    public void isSinging() {
        is_Singing = true;
        System.out.println("This is the isSinging method in the class MainArtist.");
        System.out.println(name + " is Singing.");
    }

    //to stop singing
    public void stopSinging() {
        is_Singing = false;
        System.out.println("This is the stopSinging method in the class MainArtist.");
    }

}
