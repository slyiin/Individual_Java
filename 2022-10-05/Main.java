import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        Scanner sc = new Scanner (System.in);

        List<Movie> listMovie = new ArrayList<Movie>();

        System.out.println("");
        System.out.println("Welcome to Netflix!");
        System.out.println("Note: You can only input an integer.");

        try{
            System.out.println("");
            System.out.println("Number of Movies you want to add to the download: ");
            Integer objects = input.nextInt();

            if(objects < 0) {
                input.close();
                sc.close();
                throw new MovieException("Your input is negative. Please input positive index");
            }

            for (int i = 0; i < objects; i++) {
                System.out.println("");
                System.out.println("Title: ");
                String mov_title = sc.nextLine();

                System.out.println("Genre: ");
                String mov_genre = sc.nextLine();

                listMovie.add(new Movie(mov_genre, mov_title));
            }

            System.out.println("");
            System.out.println("Here's your downloads!");
            System.out.println("===============");
            for(Movie list : listMovie) {
                System.out.println("Title: " + list.getTitle() + " (" + "Genre: " + list.getGenre() + ")");
            }

            System.out.println("============");
            System.out.println("");

            input.close();
            sc.close();
        }
        catch(MovieException e) {
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException ex) {
            System.out.println("Your input is not a number.");
        }
    }
}