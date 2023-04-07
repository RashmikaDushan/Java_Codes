//child class for singers
public class Singers extends Artists implements iBackup {
    private final boolean canSing = true;
    private boolean is_Backingup;

    public Singers(String name) {
        super(name);
    }

    //to start backup singing
    public void backup() {
        is_Backingup = true;
        System.out.println(name + " is Singing");
        System.out.println("This is the backup method in the class Singers.");
    }

    //to stop backup singing
    public void stopBackup() {
        is_Backingup = false;
        System.out.println(name + " stopped Singing");
        System.out.println("This is the stopBackup method in the class Singers.");
    }
}
