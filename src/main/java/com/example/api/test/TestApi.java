package com.example.api.test;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.Positive;
import java.util.Map;

/**
 * @author lrf
 */
@Validated
@RequestMapping("/test")
public interface TestApi {
    
    @PostMapping("/insert")
    public Object insert(@Positive Long id);
    
}
