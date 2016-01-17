package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstService implements IFirstService {

	@Autowired
	FirstServiceHandler firstServiceHandler;
	
	public void processStarts(){
		System.out.println("Pls Wait, we are in firstServiceHandler");
		firstServiceHandler.processReq();
	}
	
}
