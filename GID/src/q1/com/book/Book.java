package q1.com.book;

import q1.com.exception.InvalidBookException;

public class Book {

	private String bookID;
	private String title;
	private String author;
	private String category;
	private float price; 


	public Book(String bookID, String title, String author, String category, float price) {
		super();
		setBookID(bookID);
		setTitle(title);
		setAuthor(author);
		setCategory(category);
		setPrice(price);
	}
	/*
	 * Default constructor that sets the Book fields to default value
	 * Default field values: 
	 * bookID = "B0000"
	 * title = "Intro to Java"
	 * author = "Gyanendra Singh"
	 * category = "science"
	 * price = 59.00f
	 */
	public Book() {
		super();
		this.bookID = "B0000";
		this.title = "Intro to Java";
		this.author = "Gyanendra Singh";
		this.category = "science";
		this.price = 59.00f;

	}


	public String getBookID() {
		return bookID;
	}

	//Setter that validates if the BookId starts with letter B and is of length 4
	//Calls the validateBookId helper function to check.
	//Thorws an exception  if  the input is wrong and sets the book id to default value of B000
	public void setBookID(String bookID) {

		try {
			if(!validateBookId(bookID)) {
				throw new InvalidBookException("Invalid book id entered");
			}
			this.bookID = bookID;

		} catch (InvalidBookException ieb) {
			System.out.println(ieb.getMessage());
			System.out.println("Book id has been set to B000");
			this.bookID="B000";
		}
	}
	
	/*
	 * Helper method that returns true if the bookId follows the business rule of
	 * Starting with character B and is of length 4 else it returns false
	 */
	private boolean validateBookId(String bookId) {
		
		if(bookId.charAt(0)=='B' && bookId.length()==4) {
			return true;
		}
		return false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	//Setter that validates if the category is of the following four types
	//science, fiction, technology, other. Calls the validateCategory helper function.
	//Thorws an exception  if  the input is wrong and sets the category to default value of other
	public void setCategory(String category) {


		try {
			if(!validateCategory(category)) {
				throw new InvalidBookException("Invalid category entered");
			}
			this.category=category;
		} catch (InvalidBookException ieb) {

			System.out.println(ieb.getMessage());
			System.out.println("Category has been set to default value of other");
			this.category="other";

		}
	}

	/*
	 * Helper method that validates the category of the book. Return true if the category is of 4 types
	 * science, fiction, technology, other else it return false
	 */
	private boolean validateCategory(String category) {
		if(category.toLowerCase().equals("science")) {
			return true;
		}
		if(category.toLowerCase().equals("fiction")) {
			return true;
		}
		if(category.toLowerCase().equals("technology")) {
			return true;
		}
		if(category.toLowerCase().equals("other")) {
			return true;
		}

		return false;
	}

	public float getPrice() {
		return price;
	}

	//Setter that validates if the price is greater than 0
	//if not thorws an exception and sets the price to default value of 0.00f
	public void setPrice(float price) {
		try {
			if(price<0) {
				throw new InvalidBookException("Price cannot be negative number");
			}
			this.price =price;		

		} catch (InvalidBookException ieb) {
			System.out.println(ieb.getMessage());
			System.out.println("Price has been set to default value of 0");
			this.price= 0.00f;

		}
	}


	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", price=" + price + "]";
	}




}
