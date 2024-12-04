package com.mycompany.app.model;

//hereda atributos de la clase Response
public class ResourceResponse extends Response{
	
	private Resource resource;

	//el metodo super() inicializa atributos de la clase padre
	public ResourceResponse(Integer code, String message, Boolean success, String resourceCode, String resourceName) {
		super(code, message, success);
		
		this.resource=new Resource(resourceCode,resourceName);
		
	}
	public ResourceResponse() {
		super();
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	// metodo toString, devuelve un string con los atributos de la clase padre (Response) y ResourceResponse
	public String toString() {
		String resourceToString="";
		if(this.resource!=null) {
			resourceToString=this.getCode().toString()+" , "+this.getMessage()+" , "+this.getSuccess().toString()+" , "+this.resource.getCode().toString()+" , "+this.resource.getName();
		}else {
			resourceToString=this.getCode().toString()+" , "+this.getMessage()+" , "+this.getSuccess().toString();
		}
		
		return resourceToString;
	}
}
