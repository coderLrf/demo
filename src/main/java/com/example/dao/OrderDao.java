package com.example.dao;

import com.example.domain.OrderDto;
import com.example.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author lrf
 */

@Component
@Mapper
public interface OrderDao extends BaseMapper<OrderDto> {
    
}
