public class MovieEntry {
    private String movieName;
    private String actorName;
    private String actressName;
    private int releaseYear;

    public MovieEntry(String movieName, String actorName, String actressName, int releaseYear) {
        this.movieName = movieName;
        this.actorName = actorName;
        this.actressName = actressName;
        this.releaseYear = releaseYear;
    }

    public MovieEntry(){

    }
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActressName() {
        return actressName;
    }

    public void setActressName(String actressName) {
        this.actressName = actressName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
