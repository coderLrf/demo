package com.example.controller;

import cn.hutool.core.util.IdUtil;
import com.example.common.domain.Result;
import com.example.domain.OrderDto;
import com.example.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * 订单控制器
 *
 * @author lrf
 * @create 2024/3/26
 */

@AllArgsConstructor
@RestController
@RequestMapping("/order")
public class OrderController {
    
    private OrderService orderService;
    
    @GetMapping("/list")
    public Result list() {
        return Result.success(orderService.list());
    }
    
    @PostMapping("/insert")
    public Result insert(OrderDto dto) {
        dto.setPrice(new BigDecimal("233"));
        dto.setOrderId(IdUtil.randomUUID());
        dto.setUserId(1L);
        dto.setStatus("1");
        dto.setTotalPrice(new BigDecimal("1000"));
        return Result.success(orderService.save(dto));
    }

}
