package com.sahu.component;

import java.util.ArrayList;
import java.util.List;

import com.sahu.factory.BookType;
import com.sahu.model.Book;

public abstract class BookCollection {
	private BookType bookType;
	private List<Book> books = new ArrayList<>();

	public BookType getBookType() {
		return bookType;
	}

	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public abstract void loadBooks();

	@Override
	public String toString() {
		return "BookCollection [bookType=" + bookType + ", books=" + books + "]";
	}

}
