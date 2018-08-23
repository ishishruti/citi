package com.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.beans.Book;

public interface BookOperations {
	
	List<Book> books = new ArrayList<Book>();

	public int addBook(Book book);
	public boolean deleteBook(Book book);
	public Book findBookById(Book book);
	public ArrayList<Book> findBooksByName(String book_name);
}
