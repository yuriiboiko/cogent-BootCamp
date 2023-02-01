package q1.com.bookutil;

import java.util.Scanner;

import q1.com.book.Book;
import q1.com.book.BookStore;

public class Main {
	 static BookStore bs=new BookStore();

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Book Management Application");
		do {

			displayMenu();
			choice=sc.nextInt();
			run(choice);


		}while(choice!=5);
		sc.close();
		System.out.println("Application exited!");



	}


	//prints menu to the console
	public static void displayMenu() {
		System.out.println("************************************");
		System.out.println("*              Menu                *");
		System.out.println("* 1 - Add Book                     *");
		System.out.println("* 2 - Read Books                   *");
		System.out.println("* 3 - Search by Author             *");
		System.out.println("* 4 - Search by Title              *");
		System.out.println("* 5 - Exit                         *");
		System.out.println("* Please enter your choice...      *");
		System.out.println("************************************");		
	}


	//method checks the user input and calls the proper functions of the BookStore
	public static void run(int choice) {
		Scanner sc=new Scanner(System.in);
		
		switch(choice) {
		case 1://Add Book 
			bs.addBook(createBook());
			break;
		case 2: //Read Books 
			bs.displayAll();
			break;
		case 3://Search by Author
			System.out.println("Enter the author you want to find book from");
			String author=sc.next();
			bs.serchByAuthor(author);
			break;
		case 4: //Search by Title 
			System.out.println("Enter the title of the book you want to find");
			String title=sc.next();
			bs.searchByTitle(title);
			break;
		}

	}
	
	//method that creates a book based of what the user enters in the console
	private static Book createBook() {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Book title");
		String title=sc.next();
		System.out.println("Enter Book author");
		String author=sc.next();
		System.out.println("Enter Book category");
		String category=sc.next();
		System.out.println("Enter Book id");
		String id=sc.next();
		System.out.println("Enter Book price");
		float price=sc.nextFloat();
		
		return new Book(id, title, author, category, price);
		
	
	}
}
