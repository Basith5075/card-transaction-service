package com.barclays.transaction.service;

import java.util.List;

import com.barclays.transaction.model.TransactionRequest;
import com.barclays.transaction.model.TransactionResponse;
import com.barclays.transaction.model.Transactions;

public interface ITransactionDetailsService {
	public TransactionResponse getTransactions (TransactionRequest request);

	public List<Transactions> getAllTransactions();
	
}
