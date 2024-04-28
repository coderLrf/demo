package com.example.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author lrf
 * @create 2024/3/26
 */

@AllArgsConstructor
@Data
@TableName("t_order")
public class Order {
    
    private Long orderId;
    
    private BigDecimal price;
    
    private Long userId;
    
    private String status;
    
    public Order(BigDecimal price, Long userId, String status) {
        this.price = price;
        this.userId = userId;
        this.status = status;
    }
}
