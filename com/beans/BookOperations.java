package com.beans;
import java.util.ArrayList;

public class BookOperations {
	
	private ArrayList<Book> books;
	
	public BookOperations() {
		books = new ArrayList<Book>();
	}
	
	public BookOperations(ArrayList<Book> books) {
		this.books = books;
	}
	
	public int addBook(Book book) {
		if(books.add(book)) return 1;
		return 0;
	}
	
	public boolean deleteBook(Book book) {
		return books.remove(book);
	}
	
	
}
