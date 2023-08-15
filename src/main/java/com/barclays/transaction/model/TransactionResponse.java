package com.barclays.transaction.model;

import java.io.Serializable;
import java.util.List;

public class TransactionResponse implements Serializable{
	private StatusBlock status;
	private List<Transactions> transactions;

	public StatusBlock getStatus() {
		return status;
	}

	public void setStatus(StatusBlock status) {
		this.status = status;
	}

	public List<Transactions> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TransactionResponse [status=");
		builder.append(status);
		builder.append(", transactions=");
		builder.append(transactions);
		builder.append("]");
		return builder.toString();
	}

}
