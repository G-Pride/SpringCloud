/**
   guozh
 * 2019年9月8日
 */
package com.feign.demo.server;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author guozh
 *
 * 创建时间：2019年9月8日 上午12:12:51
 */
@FeignClient("eureka-client")
public interface HelloClient {
	
	@GetMapping("hello")
	String helloFeign();
}
