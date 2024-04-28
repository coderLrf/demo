package com.example.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dao.OrderDao;
import com.example.domain.OrderDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author lrf
 */

@AllArgsConstructor
@Service
public class OrderService extends ServiceImpl<OrderDao, OrderDto> {
}
