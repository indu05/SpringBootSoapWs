package com;


import io.spring.guides.gs_producing_web_service.SynchUserRequest;
import io.spring.guides.gs_producing_web_service.SynchUserResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class MyEndPoint {
	
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";
			
	private IFirstService firstService;
	
	@Autowired
	public MyEndPoint(IFirstService firstService) {
		this.firstService = firstService;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "synchUserRequest")
	@ResponsePayload
	public SynchUserResponse synchUser(@RequestPayload SynchUserRequest request){
		System.out.println("If@MyEndPoint"+request.getName());
		SynchUserResponse response = new SynchUserResponse();
		firstService.processStarts();
		response.setResult("SUCCESS");
		return response;
	}

}
