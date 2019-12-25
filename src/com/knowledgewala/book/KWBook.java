package com.knowledgewala.book;

import java.util.Map;
/** 
 * This class helps to implement business logic for Books.
 *  dsahu1
 *
 */
public interface KWBook {
	/**
	 * This method helps to add books.
	 * 
	 *  kwBookDetails
	 * 		- Contains Books Details like title, author etc.
	 *  kwBookMap
	 * 		- Contains Books information in the map
	 *  Boolean
	 * 		- Contains true or false value
	 */
	public Boolean addBook(KWBookDetails kwBookDetails,Map<Long, KWBookDetails> kwBookMap);

	/**
	 * This method helps to delete book details from the map.
	 * 
	 *  bookID
	 *            -Contains BookID information
	 *  kwBookMap
	 *            - Contains Books Map
	 *  Boolean - Contains true or false value based on record deletion
	 */
	public Boolean deleteBook(Long bookID,Map<Long, KWBookDetails> kwBookMap);

	/**
	 * This method helps to update book information.
	 * 
	 *  kwBookDetails
	 *            - Contains Book Details
	 *  kwBookMap
	 *            - Contains Book in the map
	 *  KWBookDetails - Contains Book details
	 */
	public KWBookDetails updateBook(KWBookDetails kwBookDetails,Map<Long, KWBookDetails> kwBookMap);
	
	/**
	 * This method helps to display all available book.
	 * 
	 *  kwBookMap
	 * 		- Contains Books information in the map
	 */
	public void displayAvailableBookInfo(Map<Long, KWBookDetails> kwBookMap);
	
	/**
	 * This method helps to display all issued book.
	 * 
	 *  kwBookMap
	 * 		- Contains Books information in the map
	 */
	public void displayIssuedBookInfo(Map<Long, KWBookDetails> kwBookMap);
}
