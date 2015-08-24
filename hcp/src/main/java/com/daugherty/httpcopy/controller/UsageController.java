package com.daugherty.httpcopy.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UsageController {

	 @Value("${server.port}")
	 private int port;
	 
    @RequestMapping("/")
    public String index() throws UnknownHostException {
        return "Http copy is up and running on " + InetAddress.getLocalHost().getHostAddress() + ":" + port;
    }

    
}