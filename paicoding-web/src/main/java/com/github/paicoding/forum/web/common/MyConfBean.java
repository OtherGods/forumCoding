package com.github.paicoding.forum.web.common;

import com.alibaba.fastjson.JSON;
import com.github.paicoding.forum.web.config.MyConf;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Slf4j
@Component
public class MyConfBean {
    
    @Resource
    private MyConf myConf;
    
    public void myConfTest() {
        log.info("@ConfigurationProperties注解 配置获取 {}", JSON.toJSONString(myConf));
    }
}

