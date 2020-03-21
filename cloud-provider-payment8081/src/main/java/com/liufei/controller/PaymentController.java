package com.liufei.controller;

import com.liufei.bean.CommonResult;
import com.liufei.bean.Payment;
import com.liufei.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @Value("${server.port}")
    private  String serverPort;
    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int i = paymentService.create(payment);
        log.info("****插入结果"+i);
        if(i>0){
            return new CommonResult(200,"插入成功,serverPort="+serverPort,i);

        }else {
            return new CommonResult(444,"插入成功,serverPort="+serverPort,null);
        }
    }
    @GetMapping("/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id){

        Payment payment = paymentService.getPayment(id);
        log.info("查询结果"+payment);
        if (payment!=null){
            return new CommonResult(200,"查询成功,serverPort="+serverPort,payment);
        }else {
            return new CommonResult(444,"没有id="+id+"记录",null);
        }
    }
    @GetMapping("/payment/lb")
    public String getServerPort(){
        return serverPort;
    }
}
