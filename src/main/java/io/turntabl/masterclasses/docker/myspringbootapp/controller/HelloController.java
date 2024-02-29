package io.turntabl.masterclasses.docker.myspringbootapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Value("${app.hostname}")
    private String hostname;
    @GetMapping("/")

    public String sayHello() {
        String message = String.format("Hello There from %s!", hostname);
        logger.info(message);
        return message;
     }
}
