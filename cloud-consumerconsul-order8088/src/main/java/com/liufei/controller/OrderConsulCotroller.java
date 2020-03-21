package com.liufei.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderConsulCotroller {

  private static final String url = "http://cloud-provider-payment";

  @Autowired
  private RestTemplate restTemplate;
  @RequestMapping("/order/consul")
  public String orderconsul(){

    String forObject = restTemplate.getForObject(url + "/payment/consul", String.class);
    return forObject;

  }
}
