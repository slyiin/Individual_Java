public class Movie {
    public String genre;
    public String title;

    Movie (String genre, String title) {
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