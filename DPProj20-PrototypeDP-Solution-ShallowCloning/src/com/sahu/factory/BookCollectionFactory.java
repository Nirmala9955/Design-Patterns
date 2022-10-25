package com.sahu.factory;

import java.util.HashMap;
import java.util.Map;

import com.sahu.component.BookCollection;
import com.sahu.component.FictionalBooksCollection;
import com.sahu.component.RealityBooksCollection;

public class BookCollectionFactory {

	private static Map<BookType, BookCollection> cacheMap = new HashMap<>();
	
	static {
		//In app startup itself load all types of books from DB s/w and keep them in cache
		BookCollection fBookCollection = new FictionalBooksCollection();
		fBookCollection.loadBooks();		
		BookCollection rBookCollection = new RealityBooksCollection();
		rBookCollection.loadBooks();
		
		//Keep BookCollection in cache
		cacheMap.put(BookType.FICTIONAL, fBookCollection);
		cacheMap.put(BookType.REALITY, rBookCollection);
	}
	
	public static BookCollection getBookCollection(BookType bookType) throws CloneNotSupportedException {
		return (BookCollection) cacheMap.get(bookType).clone();
	}
	
}
