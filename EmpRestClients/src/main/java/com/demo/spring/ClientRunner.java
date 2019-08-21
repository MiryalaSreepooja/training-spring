package com.demo.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ClientRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> resp = rt.getForEntity("http://localhost:8181/app/find/100", String.class);
		System.out.println(resp.getBody());
		System.out.print("hello");
	}

}
