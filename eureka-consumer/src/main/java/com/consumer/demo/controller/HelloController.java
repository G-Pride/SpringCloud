/**
   guozh
 * 2019年9月5日
 */
package com.consumer.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author guozh
 *
 * 创建时间：2019年9月5日 上午11:47:27
 */
@RestController
public class HelloController {

	 @Autowired
	 LoadBalancerClient loadBalancerClient;
	 
	 @Autowired
	 RestTemplate restTemplate;
	
	@GetMapping("consumer")
	public String Hello() {
		
		ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
	    String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/hello?name=consumer";
	    return restTemplate.getForObject(url, String.class);
	}
}
