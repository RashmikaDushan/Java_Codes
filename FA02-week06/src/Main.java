public class Main {
    public static void main(String[] args) {

        //creating the performance
        Perfomance perfomance=new Perfomance("Eras Tour",2023,"Glendale","live performance");

        //set main artist
        perfomance.setMainArtist("Taylor Swift");

        //adding to the track list
        perfomance.addTrackList("Lavender Haze");
        perfomance.addTrackList("All Too Well");
        perfomance.addTrackList("The lakes");
        perfomance.addTrackList("The Man");
        perfomance.addTrackList("Love Story");

        //adding backup singers
        perfomance.addBackupSingers("Jeslyn");
        perfomance.addBackupSingers("Melanie");

        //adding backup dancers
        perfomance.addBackupDancers("Stephanie");
        perfomance.addBackupDancers("Jake");

        //initializing the performance
        perfomance.initialize();
    }
}
