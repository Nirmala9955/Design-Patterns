package com.sahu.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sahu.component.BookCollection;
import com.sahu.component.FictionalBooksCollection;
import com.sahu.component.RealityBooksCollection;
import com.sahu.model.Book;

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
		BookCollection originalBookCollection = cacheMap.get(bookType);
		BookCollection clonedBookCollection = (BookCollection) originalBookCollection.clone();
		BookType originalBookType = originalBookCollection.getBookType();
		BookType cloneBookType = originalBookType;
		List<Book> originalBooks = originalBookCollection.getBooks();
		List<Book> cloneBooks = new ArrayList<>();
		for (Book originalBook : originalBooks) {
			Book cloneBook = (Book) originalBook.clone();
			cloneBooks.add(cloneBook);
		}
		//set everything to clonedBookCollection
		clonedBookCollection.setBookType(cloneBookType);
		clonedBookCollection.setBooks(cloneBooks);
		
		return clonedBookCollection;
	}
	
}
