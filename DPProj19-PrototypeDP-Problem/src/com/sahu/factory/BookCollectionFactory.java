package com.sahu.factory;

import com.sahu.component.BookCollection;
import com.sahu.component.FictionalBooksCollection;
import com.sahu.component.RealityBooksCollection;

public class BookCollectionFactory {

	public static BookCollection getBookCollection(BookType bookType) {
		BookCollection bookCollection = null;
		if (bookType.equals(BookType.FICTIONAL))
			bookCollection = new FictionalBooksCollection();
		else if (bookType.equals(BookType.REALITY))
			bookCollection = new RealityBooksCollection();
		
		bookCollection.loadBooks();
		return bookCollection;
	}
	
}
