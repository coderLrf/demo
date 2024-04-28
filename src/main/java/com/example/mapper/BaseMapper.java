package com.example.mapper;

import com.example.domain.BaseEntity;

/**
 * 基本baseMapper
 *
 * @author lrf
 * @created 2024/4/26
 */
public interface BaseMapper<T extends BaseEntity> extends com.baomidou.mybatisplus.core.mapper.BaseMapper<T> {

    @Override
    int insert(T entity);

    @Override
    int updateById(T entity);
}
