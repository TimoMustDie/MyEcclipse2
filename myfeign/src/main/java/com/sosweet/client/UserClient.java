package com.sosweet.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.data.solr.core.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("user-server")
public interface UserClient {
	@RequestMapping(value="/getByUserId/{userId}",method=RequestMethod.GET)
	public String getByUserId(@Pa)
}
