package com.barclays.transaction.controller.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.barclays.transaction.exception.BusinessException;
import com.barclays.transaction.exception.SystemException;
import com.barclays.transaction.exception.TransactionRequestDataException;
import com.barclays.transaction.model.StatusBlock;
import com.barclays.transaction.model.TransactionResponse;


@ControllerAdvice
public class TransactionControllerAdvice {

	// Implemented Global Exceptions using in this class
	// a) @ControllerAdvice
	// b) @ExceptionHandler
	
	@ExceptionHandler(value = TransactionRequestDataException.class)
	public TransactionResponse handleRequestInvalidException(TransactionRequestDataException exception) {
		
		// Did code refactoring to replace the below lines with less number of lines
//		BalanceResponse balanceResp = handleErrorResponse(exception.getRespCode(), exception.getRespMsg());
//
//		return balanceResp;

		return handleErrorResponse(exception.getRespCode(), exception.getRespMsg());
	}

	@ExceptionHandler(value = BusinessException.class)
	public TransactionResponse handleDataError(BusinessException exception) {

		return handleErrorResponse(exception.getErrorCode(), exception.getErrorMsg());
	}

	@ExceptionHandler(value = SystemException.class)
	public TransactionResponse handleRequestInvalidException(SystemException exception) {

		return handleErrorResponse(exception.getErrorCode(), exception.getErrorMsg());
	}

	@ExceptionHandler(value = Exception.class)
	public TransactionResponse genericException(Exception exception) {

		return handleErrorResponse("8888", "Generic Error Message" + exception.getMessage());

	}

	private TransactionResponse handleErrorResponse(String respCode, String respMsg) {
		TransactionResponse transactionResp = new TransactionResponse();

		StatusBlock status = new StatusBlock();
		status.setRespCode(respCode);
		status.setRespMsg(respMsg);
		transactionResp.setStatus(status);
		return transactionResp;
	}
}
