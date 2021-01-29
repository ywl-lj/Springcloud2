package SpringCloud.controller;

import SpringCloud.entities.CommonResult;
import SpringCloud.entities.Payment;
import SpringCloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result=paymentService.create(payment);
        if(result>0){
            return new CommonResult(200,"ok",result);
        }else {
            return new CommonResult(444,"fail",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult get(@PathVariable("id") Long id){
        Payment payment=paymentService.get(id);
        if(payment!=null){
            return new CommonResult(200,"ok",payment);
        }else {
            return new CommonResult(444,"fail",null);
        }
    }
}
