package com.barclays.transaction.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class TransactionRequest implements Serializable{
	
	private String clientId;
	private String requestId;
	private String messageTs;
	private String cardNumber;
	private String cvvNum;
	private String nameOnCard;
	private String expDate;
	private String stDate;
	private String edDate;
	private String typeOfTxn;
	private String sortType;
	private String stIndex;
	private String endIndex;
	private String sortField;

}
