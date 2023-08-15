package com.barclays.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.transaction.model.TransactionRequest;
import com.barclays.transaction.model.TransactionResponse;
import com.barclays.transaction.model.Transactions;
import com.barclays.transaction.service.ITransactionDetailsService;

@RestController
@RequestMapping("/v1")
public class TransactionDetailsController {

	@Autowired
	ITransactionDetailsService transactionDtlsService;

	@PostMapping("/transactions")
	public TransactionResponse getTransaction(@RequestBody TransactionRequest request,
			@RequestHeader(value = "client-id", required = false) String clientId,
			@RequestHeader(value = "request-id", required = false) String requestId,
			@RequestHeader(value = "message-ts", required = false) String messageTs) {

		// 1. Validate the request
		// 2. Prepare the request for service class
		// 3. Call service and get the response

		return transactionDtlsService.getTransactions(request);
	}

	@GetMapping("/hello")
	public List<Transactions> getAllTransact() {

		return transactionDtlsService.getAllTransactions();
	}

}
