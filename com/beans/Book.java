package com.beans;

import java.util.Comparator;

public class Book implements Comparable<Book>,Comparator<Book>{
	private int isbn;
	private String name;
	public Book() {
		name = "";
		isbn =0;
	}
	public Book(int isbn, String name) {
		super();
		this.isbn = isbn;
		this.name = name;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + isbn;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn != other.isbn)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + "]";
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
//		return this.isbn-o.isbn;
		return this.name.compareTo(o.name);
	}
	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
