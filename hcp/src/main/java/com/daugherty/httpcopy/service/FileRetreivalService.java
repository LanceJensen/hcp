package com.daugherty.httpcopy.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.apache.commons.io.IOUtils;

@Service
public class FileRetreivalService {

	public ResponseEntity<byte[]> getFileData(String... pathFragments) {
		// Build standard response
		
		ResponseEntity<byte[]> response = null;
		HttpHeaders responseHeaders = new HttpHeaders();
		try {
			responseHeaders.setLocation(new URI("/copy"));
		} catch (URISyntaxException e) {
			// Can never happen unless code change is made...
			e.printStackTrace();
		}

		// Initialize the path to support both *nix and Windows file systems
		String filePath = null;
		String os = System.getProperty("os.name");
		System.out.println(os);
		if (os.startsWith("Win")) {
			filePath = "" + pathFragments[0];
		} else {
			filePath = "/" + pathFragments[0];
		}

		for (int fragmentIndex =1; fragmentIndex < pathFragments.length; fragmentIndex++) {
			filePath = filePath + "/" + pathFragments[fragmentIndex];
		}
		
		// Load the file data in the response or provide error response		
		try {
			FileInputStream inputStream = new FileInputStream(new File(filePath));
			byte[] data = IOUtils.toByteArray(inputStream);
			responseHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			response = new ResponseEntity<byte[]>(data, responseHeaders,
					HttpStatus.OK);
		} catch (FileNotFoundException ex) {
			responseHeaders.setContentType(MediaType.TEXT_PLAIN);
			String message = "Your file was not found at the requested path: " + filePath
			+ "More Details:\n" + ex.getLocalizedMessage();
			response = new ResponseEntity<byte[]>(message.getBytes(), responseHeaders,
					HttpStatus.OK);
		} catch (IOException ex) {
			responseHeaders.setContentType(MediaType.TEXT_PLAIN);
			String message = "The file read of: " + filePath + " was interupted.\n"
					+ "More Details:\n" + ex.getLocalizedMessage();
			response = new ResponseEntity<byte[]>(message.getBytes(), responseHeaders,
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;

	}

}
