package com.example.springbootRest.model;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("COMMENT-SERVICE/Comments")
public interface IntefaceComment {
	@GetMapping("/port")
	public String getPort();
}
