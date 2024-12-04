package com.mycompany.app;

import com.mycompany.app.model.ResourceResponse;
import com.mycompany.app.service.ResourceService;


public class App {
    public static void main(String[] args) {
    	ResourceService resourceService=new ResourceService();
		ResourceResponse resourceRespone=resourceService.getResource("001");
		System.out.println(resourceRespone.toString());
		resourceRespone=resourceRespone=resourceService.getResource("005");
		System.out.println(resourceRespone.toString());
    }
}
