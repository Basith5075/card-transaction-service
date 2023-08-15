package com.barclays.transaction.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "transactions")
public class Transactions  implements Serializable{

	@Id
	private int txnId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "amount")
	private String amount;
	
	
	@Column(name = "merchantname")
	private String merchantName;

	@Column(name = "description")
	private String desc;
	
	@Column(name = "status")
	private String status;

	@Column(name="cardnumber")
	private Double cardNumber;
}
