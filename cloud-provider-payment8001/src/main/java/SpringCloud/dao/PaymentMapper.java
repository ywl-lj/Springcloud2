package SpringCloud.dao;

import SpringCloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PaymentMapper {
    public int create(Payment payment);

    public Payment get(@Param("id") Long id);
}
