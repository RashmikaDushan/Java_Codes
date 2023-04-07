//child class for dancers
public class Dancers extends Artists implements iBackup {
    private final boolean canDance = true;
    private boolean is_Backingup;

    public Dancers(String name) {
        super(name);
        backingUp = "Dancing";
    }

    //to start backup dancing
    public void backup() {
        is_Backingup = true;
        System.out.println(name + " is Dancing");
        System.out.println("This is the backup method in the class Dancers.");
    }

    //to stop backup dancing
    public void stopBackup() {
        is_Backingup = false;
        System.out.println(name + " stopped Dancing");
        System.out.println("This is the stopBackup method in the class Dancers.");
    }
}
