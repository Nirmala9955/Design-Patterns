package com.sahu.test;

import com.sahu.component.BookCollection;
import com.sahu.factory.BookCollectionFactory;
import com.sahu.factory.BookType;

public class Library {

	public static void main(String[] args) {
		BookCollection fBooks = BookCollectionFactory.getBookCollection(BookType.FICTIONAL);
		System.out.println(fBooks);
		System.out.println("------------------");
		BookCollection rBooks = BookCollectionFactory.getBookCollection(BookType.REALITY);
		System.out.println(rBooks);
		System.out.println("******************");
		BookCollection fBooks1 = BookCollectionFactory.getBookCollection(BookType.FICTIONAL);
		System.out.println(fBooks1);
		System.out.println("------------------");
		BookCollection rBooks1 = BookCollectionFactory.getBookCollection(BookType.REALITY);
		System.out.println(rBooks1);
	}
	
}
