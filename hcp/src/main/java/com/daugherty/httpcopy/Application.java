package com.daugherty.httpcopy;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Application is the standard boot class for Spring boot.  This class
 * provides no functionality  other than to build and print the web context
 * beans for diagnostic purposes.
 * @author Lance.Jensen@Daugherty.com
 *
 */
@SpringBootApplication
public class Application {

	 
	 private static String port = "7777";
	 
	public static void main(String[] args) throws UnknownHostException {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
//        String[] beanNames = ctx.getBeanDefinitionNames();
//        Arrays.sort(beanNames);
//        for (String beanName : beanNames) {
//            System.out.println(beanName);
//        }
        String portOverride = System.getProperty("server.port");
        if((portOverride) != null) {
        	port = portOverride;
        }
        System.out.println("HTTP copy is up and running on " + InetAddress.getLocalHost().getHostAddress() +":" + port);
    }
	
	
}