/**
   guozh
 * 2019年9月7日
 */
package com.ribbon.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author guozh
 *
 * 创建时间：2019年9月7日 下午11:05:18
 */
@RestController
public class RibbonController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/ribbon")
	public String HelloRibbon() {
		return restTemplate.getForObject("http://eureka-client/hello?name=ribbon", String.class);
    }
}
