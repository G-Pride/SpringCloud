/**
   guozh
 * 2019年9月9日
 */
package com.hystrix.demo.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hystrix.demo.server.HystrixServer;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author guozh
 *
 * 创建时间：2019年9月9日 下午5:21:10
 */
@Service
public class HystrixServerImpl implements HystrixServer{

	@Autowired
	RestTemplate restTemplate;
	
	@Override
	@HystrixCommand(fallbackMethod = "fallbackResult")
	public String hystrix() {
		
		return restTemplate.getForObject("http://eureka-client/hello?name=hystrix", String.class);
	}
	
	public String fallbackResult() {

		return "fallback";
	}
}
