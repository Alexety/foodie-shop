package com.imooc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@RestController
public class HelloController {

//    final static Logger logger = (Logger) LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public Object hello(){

//        logger.info("info: hello~");
//        logger.debug("debug: hello~");
//        logger.error("error: hello~");
//        logger.warn("warn: hello~");

        return "Hello world~";
    }
}
