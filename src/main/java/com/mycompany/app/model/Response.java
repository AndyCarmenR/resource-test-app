package com.mycompany.app.model;

//clase padre hereda a ResourceResponse los atributos code, message y success (simulan http props)
public class Response {
	private Integer code;
	private String message;
	private  Boolean success;
	
	public Response(Integer code, String message, Boolean success) {
		this.code=code;
		this.message=message;
		this.success=success;
	}
	
	public Response() {
		
	}

	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	
	
}
