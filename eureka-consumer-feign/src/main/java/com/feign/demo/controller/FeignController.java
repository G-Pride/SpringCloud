/**
   guozh
 * 2019年9月8日
 */
package com.feign.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feign.demo.server.HelloClient;

/**
 * @author guozh
 *
 * 创建时间：2019年9月8日 上午12:27:52
 */
@RestController
public class FeignController {
	
	@Autowired
	HelloClient helloClient;
	
	@GetMapping("feign")
	public String helloFeign() {
	
		return helloClient.helloFeign();
	}
}
