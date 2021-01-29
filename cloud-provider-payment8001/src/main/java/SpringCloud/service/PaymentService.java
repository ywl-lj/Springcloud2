package SpringCloud.service;

import SpringCloud.dao.PaymentMapper;
import SpringCloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(Payment payment);

    public Payment get(@Param("id") Long id);
}
