package com.example.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 订单dto
 *
 * @author lrf
 * @created 2024/4/26
 */

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("t_order")
public class OrderDto extends BaseEntity {

    private String orderId;

    private BigDecimal price;

    private Long userId;

    private String status;
    
    private BigDecimal totalPrice;

}
