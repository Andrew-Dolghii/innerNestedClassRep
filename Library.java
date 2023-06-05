package andrew.nestedClasses;

import java.util.ArrayList;
import java.util.Objects;

public class Library {
    ArrayList<Library.Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    void addBook(String title, int pages, String genre, int publication, Book.Author author){
        Book book = new Book(title, pages, genre, publication, author);
        books.add(book);
    }

    void removeBook(String title){
        books.removeIf(t -> Objects.equals(t.title, title));
    }

    static class Book{
        String title;
        int pages;
        String genre;
        int publication;
        Author author;

        public Book(String title, int pages, String genre, int publication, Author author) {
            this.title = title;
            this.pages = pages;
            this.genre = genre;
            this.publication = publication;
            this.author = author;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", pages=" + pages +
                    ", genre='" + genre + '\'' +
                    ", publication=" + publication +
                    ", author=" + author +
                    '}';
        }

        static class Author{
            String firstName;
            String lastName;

            public Author(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            @Override
            public String toString() {
                return "Author{" +
                        "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        '}';
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        System.out.println("Starting Library: ");
        for(Book book : library.getBooks()){
            System.out.println(book + ", ");
        }

        Book.Author author1 = new Book.Author("Leo", "Tolstoy");
        library.addBook("War and Peace", 1225, "Historical Drama", 1867, author1);

        Book.Author author2 = new Book.Author("Alexandre", "Dumas");
        library.addBook("The Three Musketeers", 700, "Adventure", 1844, author2);

        Book.Author author3 = new Book.Author("Jules", "Verne");
        library.addBook("Around the World in Eighty Days", 304, "Adventure", 1873, author3);

        library.removeBook("The Three Musketeers");

        System.out.println("\nEnding Library: ");
        for(Book book : library.getBooks()){
            System.out.println(book + ", ");
        }

    }
}
