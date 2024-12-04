package com.mycompany.app.repository;

import java.util.HashMap;

import com.mycompany.app.model.Resource;



public class ResourceRepository {

	//simula bajada de datos de db
HashMap<String, Resource> resources=new HashMap<>();

//inicializa objetos prueba en hasmap
	public ResourceRepository() {
		resources.put("001", new Resource("001","testResource1"));
		resources.put("002", new Resource("002","testResource2"));
		resources.put("003", new Resource("003","testResource3"));
		
	}

	//retorna el Resource dependiendo el codigo, si el codigo no corresponde a ninguno, retorna null
	public Resource getResource(String resourceCode) {				
		return resources.get(resourceCode);
	}

}
