package q1.com.book;

import java.util.ArrayList;
import java.util.Iterator;

public class BookStore {
	
	//collection where all the books are stored
	ArrayList<Book> books= new ArrayList<Book>();
	
	//To add a new Book object into the collection.
	public void addBook(Book b) {
		books.add(b);
	}
	
	//Search a book based on title and if found, display the details
	//uses Iterators to iterate through the books collection
	//and uses toString method to display it to console if the title is match
	public void searchByTitle(String title) {
		
		for (Iterator<Book> iterator = books.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			if(book.getTitle().equals(title)) {
				System.out.println(book);
			}
		}
		
	}
	
	//Search a book based on author and if found, display the details
	//uses Iterators to iterate through the books collection
	//and uses toString method to display it to console if the author is matched
	public void serchByAuthor(String author) {
		for (Iterator<Book> iterator = books.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			
			if(book.getAuthor().equals(author)) {
				System.out.println(book);
			}
		}
		
	}
	//Print the details of all the books
	//uses Iterators to iterate through the books collection
	//and uses toString method to display it to console
	public void displayAll() {
		for (Iterator<Book> iterator = books.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			System.out.println(book);
	
		}
	}
	

}
