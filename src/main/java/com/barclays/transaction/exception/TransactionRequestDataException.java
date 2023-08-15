/**
 * @Author : Abdul Basith
 * Copyright reserved. Don't discolse this code to anyone without writtent permission.
 */
package com.barclays.transaction.exception;

import org.springframework.stereotype.Component;

@Component
public class TransactionRequestDataException extends Exception{

	private String respCode;
	private String respMsg;

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespMsg() {
		return respMsg;
	}

	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TransactionRequestDataException [respCode=");
		builder.append(respCode);
		builder.append(", respMsg=");
		builder.append(respMsg);
		builder.append("]");
		return builder.toString();
	}

}
