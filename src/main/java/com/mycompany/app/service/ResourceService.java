package com.mycompany.app.service;

import com.mycompany.app.model.Resource;
import com.mycompany.app.model.ResourceResponse;
import com.mycompany.app.repository.ResourceRepository;

public class ResourceService {
	
	ResourceRepository resourceRepo;
	
	public ResourceService() {
		resourceRepo=new ResourceRepository();
	}

	//hace la busqueda del resource por el codigo, devuelve una respuesta simulando un http response
	//si el resource esta presente, devuelve un codigo 200 success, de lo contrario un 404 not found
	public ResourceResponse getResource(String resourceCode) {
		Resource resource=resourceRepo.getResource(resourceCode);
		ResourceResponse response=new ResourceResponse();		
		if(resource!=null) {
			response.setSuccess(Boolean.TRUE);
			response.setCode(200);
			response.setMessage("OK");
			response.setResource(resource);
		}else {
			response.setSuccess(Boolean.FALSE);
			response.setCode(404);
			response.setMessage("Resource not found");
		}
		return response;
		
	}

}
