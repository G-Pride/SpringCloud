/**
   guozh
 * 2019年9月5日
 */
package com.client.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guozh
 *
 * 创建时间：2019年9月5日 上午11:09:07
 */

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello(String name) {
		return "this is from "+name;
	}
}