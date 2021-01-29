package SpringCloud.service;

import SpringCloud.dao.PaymentMapper;
import SpringCloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentMapper;
    public int create(Payment payment){
        return paymentMapper.create(payment);
    };

    public Payment get(Long id){
        return paymentMapper.get(id);
    };
}
