package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * Account pojo java class is having the setter and getter methods
 * of database tables column name variables.
 *
 */
@Table(name="ACCOUNT")
@Entity
public class Account {
	private static final long serialVersionUID = -6380749575516426900L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String accountId;
	
	@Column(name="ACCOUNT_NO")
	private String accountNo;
	
	@Column(name="ACCOUNT_TYPE")
	private String accountType;
	
	@Column(name="AMOUNT")
	private String amount;
	
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUST_ID", nullable = false)
	private Long custNo;
	
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Long getCustNo() {
		return custNo;
	}

	public void setCustNo(Long custNo) {
		this.custNo = custNo;
	}
}
