/**
   guozh
 * 2019年9月8日
 */
package com.hystrix.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hystrix.demo.server.HystrixServer;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author guozh
 *
 *         创建时间：2019年9月8日 下午9:37:01
 */
@RestController
public class HystrixController {
	
	@Autowired
	HystrixServer hystrixServer;

	@GetMapping("/hystrix")
	public String dc() {
		return hystrixServer.hystrix();
	}
	
}
