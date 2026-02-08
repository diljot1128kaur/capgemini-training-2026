import java.util.*;
import java.util.stream.Collectors;

class Book {
    String title;
    String author;
    String genre;
    double rating;

    Book(String title, String author, String genre, double rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }
}

class BookRecommendation {
    String title;
    double rating;

    BookRecommendation(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public String toString() {
        return title + " -> " + rating;
    }
}

public class BookRecommendations {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
            new Book("Dune", "Frank Herbert", "Science Fiction", 4.5),
            new Book("Neuromancer", "Gibson", "Science Fiction", 4.2),
            new Book("Random Book", "Author", "Drama", 3.9)
        );

        int page = 1;
        int pageSize = 5;

        List<BookRecommendation> result =
            books.stream()
                .filter(b -> b.genre.equals("Science Fiction"))
                .filter(b -> b.rating > 4.0)
                .map(b -> new BookRecommendation(b.title, b.rating))
                .sorted(Comparator.comparing(BookRecommendation::getRating).reversed())
                .skip((page - 1) * pageSize)
                .limit(pageSize)
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
