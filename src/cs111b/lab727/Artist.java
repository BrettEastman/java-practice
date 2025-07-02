package cs111b.lab727;

public class Artist {
    private String artistName;
    private int birthYear;
    private int deathYear;

    public Artist() {
        this.artistName = "unknown";
        this.birthYear = -1;
        this.deathYear = -1;
    }

    public Artist(String artistName, int birthYear, int deathYear) {
        this.artistName = artistName;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    public String getName() {
        return artistName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    public void printInfo() {
        if ((birthYear >= 0) && (deathYear >= 0)) {
            System.out.println("Artist: " + artistName + " (" + birthYear + " to " + deathYear + ")");
        } else if (birthYear >= 0) {
            System.out.println("Artist: " + artistName + " (" + birthYear + " to present)");
        } else {
            System.out.println("Artist: " + artistName + " (unknown)");
        }
    }
}