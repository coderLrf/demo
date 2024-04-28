package com.example.common.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一返回实体
 *
 * @author lrf
 * @create 2024/3/26
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result {

    /**
     * 响应码
     */
    private Integer code;

    /**
     * 响应消息
     */
    private String msg;

    /**
     * 数据
     */
    private Object data;

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 通用成功返回
     */
    public static Result success() {
        return new Result(200, "操作成功");
    }
    
    public static <T> Result success(Object data) {
        return new Result(200, "操作成功", data);
    }

    public static Result success(Integer code, String msg) {
        return new Result(code, msg, null);
    }
    
    public static Result success(String msg, Object data) {
        return new Result(200, msg, data);
    }

    public static Result success(Integer code, String msg, Object data) {
        return new Result(code, msg, data);
    }

    /**
     * 通用失败返回
     */
    public static Result error() {
        return new Result(500, "操作失败");
    }

    public static Result error(String msg) {
        return new Result(500, msg);
    }

    public static Result error(Integer code, String msg) {
        return new Result(code, msg);
    }
    
}
