package com.didispace.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 注意这里说的是“使用”，没有错，我们不需要在Feigh工程中引入Hystix，
 * Feign中已经依赖了Hystrix，我们可以在未做任何改造前，尝试下面你的操作：
 */
@Component
public class ComputeClientHystrix implements ComputeClient {

    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }

}