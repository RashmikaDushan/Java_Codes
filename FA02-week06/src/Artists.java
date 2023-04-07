//class for artists
public class Artists {
    public String name;
    String backingUp;

    public Artists(String name) {
        this.name = name;
    }

}

//iBackup interface
interface iBackup{
    public void backup();
    public void stopBackup();
}
