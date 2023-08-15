package com.barclays.transaction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.barclays.transaction.model.StatusBlock;
import com.barclays.transaction.model.TransactionRequest;
import com.barclays.transaction.model.TransactionResponse;
import com.barclays.transaction.model.Transactions;
import com.barclays.transaction.repository.ITransactionDetailsRepository;

@Service
public class TransactionDetailsService implements ITransactionDetailsService{
	
	@Autowired 
	ITransactionDetailsRepository transactiondtlsRepository;
	
	@Cacheable(value="transaction",key = "#request.cardNumber") // This code is responsible for implementing the redis cache
	public TransactionResponse getTransactions(TransactionRequest request) {
		
		System.out.println("******* Entered into TransactionDetailsService *******");
		TransactionResponse transactionResponse = new TransactionResponse();
		
		// Call to finance service.
		// Call to cardVerifyService.
		// Call to dao to get the list of transaction.
		// Apply some business rules on list transaction
		
		List<Transactions> transactionList = transactiondtlsRepository.findByCardNumber(Double.valueOf(request.getCardNumber()));
		
		
		StatusBlock status = new StatusBlock();
		status.setRespCode("0");
		status.setRespMsg("success");
		
		transactionResponse.setStatus(status);
		transactionResponse.setTransactions(transactionList);
		// Use jdk8 stream api -- iterate all the transaction and find if any txn status is pending / hold
		// then dont send to consumers
		// Sort the transactions if the input value passed as sorting option
		
		return transactionResponse;
	}

	@Override
	public List<Transactions> getAllTransactions() {
		List<Transactions> allTransact = transactiondtlsRepository.findAll();
		
		return allTransact;
	}

}
