package hashCode;

import java.util.ArrayList;

public class Library {

	private int signupDays;
	private int booksShipedPerDay;
	private ArrayList<Integer> books;

	public Library(int signupDays, int booksShipedPerDay, ArrayList<Integer> books) {
		super();
		this.signupDays = signupDays;
		this.booksShipedPerDay = booksShipedPerDay;
		this.books = books;
	}

	public int getSignupDays() {
		return signupDays;
	}

	public int getBooksShipedPerDay() {
		return booksShipedPerDay;
	}

	public ArrayList<Integer> getBooks() {
		return books;
	}
	
	
}
