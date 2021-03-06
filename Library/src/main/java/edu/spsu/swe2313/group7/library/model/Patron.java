package edu.spsu.swe2313.group7.library.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Robert Whitaker
 */
@Entity
@Table(name="PATRON")
public class Patron {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String lastName;
	private String firstName;
	private Date dateOfBirth;
	private int bookCheckoutLimit;
	private int bookCheckedOutCount;
	private int lateFees;
	private boolean allowedCheckout;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getBookCheckoutLimit() {
		return bookCheckoutLimit;
	}

	public void setBookCheckoutLimit(int bookCheckoutLimit) {
		this.bookCheckoutLimit = bookCheckoutLimit;
	}

	public int getBookCheckedOutCount() {
		return bookCheckedOutCount;
	}

	public void setBookCheckedOutCount(int bookCheckedOutCount) {
		this.bookCheckedOutCount = bookCheckedOutCount;
	}

	public int getLateFees() {
		return lateFees;
	}

	public void setLateFees(int lateFees) {
		this.lateFees = lateFees;
	}

	public boolean isAllowedCheckout() {
		return allowedCheckout;
	}

	public void setAllowedCheckout(boolean allowedCheckout) {
		this.allowedCheckout = allowedCheckout;
	}
	
}
