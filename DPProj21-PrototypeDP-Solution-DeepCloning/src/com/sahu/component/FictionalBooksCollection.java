package com.sahu.component;

import com.sahu.factory.BookType;
import com.sahu.model.Book;

public class FictionalBooksCollection extends BookCollection {

	@Override
	public void loadBooks() {
		//write JDBC code to get books from DB s/w and load books collection(List Collection)
		System.out.println("hitting DB s/w to get fictional books");
		setBookType(BookType.FICTIONAL);
		Book book = null;
		for (int i = 1; i <= 20; i++) {
			book = new Book(1000+i, BookType.FICTIONAL+"-"+i);
			getBooks().add(book);
		}
		System.out.println("Books are loaded to books collection from DB s/w table records");
	}

}
