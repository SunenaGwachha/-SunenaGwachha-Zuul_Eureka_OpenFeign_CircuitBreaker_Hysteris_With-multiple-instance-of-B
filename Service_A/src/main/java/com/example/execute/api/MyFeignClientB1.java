package com.example.execute.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "B1-SERVICE")
public interface MyFeignClientB1 {

    

 @GetMapping(value = "getB1")
 String getB1();


}
