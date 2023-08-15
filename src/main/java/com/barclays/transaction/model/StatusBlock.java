package com.barclays.transaction.model;

import java.io.Serializable;

public class StatusBlock implements Serializable{
	private String respCode;
	private String respMsg;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StatusBlock [respCode=");
		builder.append(respCode);
		builder.append(", respMsg=");
		builder.append(respMsg);
		builder.append("]");
		return builder.toString();
	}

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

	
}
