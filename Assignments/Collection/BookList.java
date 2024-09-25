package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

//Class representing an Author
class Author {
 private String name;

 // Constructor
 public Author(String name) {
     this.name = name;
 }

 // Getter for author name
 public String getName() {
     return name;
 }
}

//Class representing a Book (Book has an Author)
class Book {
 private String title;
 private Author author;  // Book has-a relationship with Author

 // Constructor
 public Book(String title, Author author) {
     this.title = title;
     this.author = author;
 }

 // Getter for book title
 public String getTitle() {
     return title;
 }

 // Getter for book's author
 public Author getAuthor() {
     return author;
 }

 // toString method to display book info
 @Override
 public String toString() {
     return "Book: " + title + ", Author: " + author.getName();
 }
}

public class BookList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create an ArrayList of Book objects
        ArrayList<Book> bookList = new ArrayList<>();

        // Add books with authors
        Author author1 = new Author("J.K. Rowling");
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", author1);
        
        Author author2 = new Author("George Orwell");
        Book book2 = new Book("1984", author2);
        
        Author author3 = new Author("J.R.R. Tolkien");
        Book book3 = new Book("The Hobbit", author3);

        // Add books to the list
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        // Print the list of books in forward direction
        System.out.println("Books in forward direction:");
        for (Book book : bookList) {
            System.out.println(book);
        }

        // Print the list of books in reverse direction
        System.out.println("\nBooks in reverse direction:");
        ListIterator<Book> listIterator = bookList.listIterator(bookList.size());
        while (listIterator.hasPrevious()) {
            Book book = listIterator.previous();
            System.out.println(book);
        }
	}

}
