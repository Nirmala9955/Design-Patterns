package com.sahu.test;

import com.sahu.component.BookCollection;
import com.sahu.factory.BookCollectionFactory;
import com.sahu.factory.BookType;

public class Library {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookCollection fBooks = BookCollectionFactory.getBookCollection(BookType.FICTIONAL);
		System.out.println(fBooks);
		System.out.println("------------------");
		BookCollection fBooks1 = BookCollectionFactory.getBookCollection(BookType.FICTIONAL);
		System.out.println(fBooks1);
		
		//remove one book using fbook1 from List collection
		/* Because of shallow cloning, the change will reflect 
		 * to fbooks which is against of prototype design pattern
		 */
		fBooks1.getBooks().remove(0);
		System.out.println(fBooks.getBooks().size()+"  "+fBooks1.getBooks().size());
		
		System.out.println("******************");
		
		BookCollection rBooks = BookCollectionFactory.getBookCollection(BookType.REALITY);
		System.out.println(rBooks);
		System.out.println("------------------");
		BookCollection rBooks1 = BookCollectionFactory.getBookCollection(BookType.REALITY);
		System.out.println(rBooks1);
		
		
	}
	
}
