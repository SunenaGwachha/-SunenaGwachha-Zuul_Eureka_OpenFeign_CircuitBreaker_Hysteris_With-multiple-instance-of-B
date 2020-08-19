package com.example.execute.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "B2-SERVICE")
public interface MyFeignClientB2 {

    

 @GetMapping(value = "getB2")
 String getB2();


}