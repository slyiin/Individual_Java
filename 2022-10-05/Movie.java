public class Movie {
    public String genre;
    public String title;

    public Movie(String mov_genre, String mov_title) {
    }

    void Music (String genre, String title) {
        this.genre = genre;
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }
}