package com.ingramcontent.dataverse.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Pipeline implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String key;
	private java.lang.String message;
	private java.lang.String status;
	private java.lang.String created_date;
	private java.lang.Long processId;

	public Pipeline() {
	}

	public java.lang.String getKey() {
		return this.key;
	}

	public void setKey(java.lang.String key) {
		this.key = key;
	}

	public java.lang.String getMessage() {
		return this.message;
	}

	public void setMessage(java.lang.String message) {
		this.message = message;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getCreated_date() {
		return this.created_date;
	}

	public void setCreated_date(java.lang.String created_date) {
		this.created_date = created_date;
	}

	public java.lang.Long getProcessId() {
		return this.processId;
	}

	public void setProcessId(java.lang.Long processId) {
		this.processId = processId;
	}

	public Pipeline(java.lang.String key, java.lang.String message,
			java.lang.String status, java.lang.String created_date,
			java.lang.Long processId) {
		this.key = key;
		this.message = message;
		this.status = status;
		this.created_date = created_date;
		this.processId = processId;
	}

}