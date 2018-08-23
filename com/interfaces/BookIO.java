package com.interfaces;
import java.io.IOException;
import java.util.List;
import com.beans.Book;

public interface BookIO {

	public Book getBook() throws IOException;
	public void printBook(List<Book> books);
	public void printBook(Book book);
	
}
