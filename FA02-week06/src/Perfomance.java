import java.util.ArrayList;

public class Perfomance {
    private static MainArtist mainArtist;
    public String performanceName;
    public final int year;
    public final String venue;
    private ArrayList<MusicTrack> trackList = new ArrayList<MusicTrack>();
    private ArrayList<Singers> backupSingers = new ArrayList<Singers>();
    private ArrayList<Dancers> backupDancers = new ArrayList<Dancers>();
    private int no_backupSingers=0;
    private int no_backupDancers=0;
    private String performanceType;
    private boolean canInteractWithAudience;
    private boolean isRecording;
    private String recordingType;
    private boolean hasAudioProcessing;

    //initialize the performance
    public Perfomance(String name,int year,String venue,String type){
        this.performanceName=name;
        this.year=year;
        this.venue=venue;
        this.performanceType=type;
        if(type=="live performances"){
            this.canInteractWithAudience=true;
            this.hasAudioProcessing=false;
            this.recordingType="live recording";
        } else if (type=="studio performances") {
            this.canInteractWithAudience=false;
            this.hasAudioProcessing=true;
            this.recordingType="studio recording";
        }
    }

    //for adding main singer
    public void setMainArtist(String name){
        MainArtist mainSinger=new MainArtist(name);
        mainArtist=mainSinger;
        System.out.println("This is the setMainArtist method in the class Performance.");
    }

    //for adding backup singers
    public void addBackupSingers(String name){
        Singers singer=new Singers(name);
        backupSingers.add(singer);
        no_backupSingers++;
        System.out.println("This is the addBackupSingers method in the class Performance.");
    }

    //for adding backup dancers
    public void addBackupDancers(String name){
        Dancers dancer=new Dancers(name);
        backupDancers.add(dancer);
        no_backupDancers++;
        System.out.println("This is the addBackupDancers method in the class Performance.");
    }

    //for adding songs
    public void addTrackList(String name){
        MusicTrack track = new MusicTrack(name,300);
        trackList.add(track);
        System.out.println("This is the addTrackList method in the class Performance.");
    }

    //for changing the track list
    public void changeTrackList(MusicTrack trackCount){
        trackList.add(trackCount);
        System.out.println("This is the changeTrackList method in the class Performance.");
    }

    //to record the performance
    public void record(boolean recording){
        isRecording=recording;
        System.out.println("This is the record method in the class Performance.");
    }

    //to initialize the performance
    public void initialize(){
        System.out.println("This is the initialize method in the class Performance.");
        System.out.println("Welcome to the Performance "+performanceType+" by "+mainArtist.name+"!");
        mainArtist.isSinging();
        for(int i=0;i<no_backupSingers;i++){
            System.out.println(backupSingers.get(i).name+" is backing her up by singing.");
        }
        for(int i=0;i<no_backupDancers;i++){
            System.out.println(backupSingers.get(i).name+" is backing her up by dancing.");
        }
    }
}


