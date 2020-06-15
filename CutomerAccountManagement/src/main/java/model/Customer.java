package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * Customer pojo java class is having the setter and getter methods
 * of database tables column name variables.
 *
 */
@Table(name="CUSTOMER")
@Entity
public class Customer {

private static final long serialVersionUID = -6759774343110776659L;
	
	@Id
	@GeneratedValue
	@Column(name="CUST_ID",updatable = false)
	private Long custId;
	
	
	@Column(name="CUST_FIRST_NAME")
	private String firstName;
	
	@Column(name="CUST_LAST_NAME")
	private String lastName;
	
	@Column(name="CUST_ADDRESS")
	private String address;
	
	@Column(name="CUST_PHONE_NO")
	private String phoneNo;
	
	@Column(name="CUST_SSN_NO")
	private String ssnNo;

	
	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getSsnNo() {
		return ssnNo;
	}

	public void setSsnNo(String ssnNo) {
		this.ssnNo = ssnNo;
	}
}
